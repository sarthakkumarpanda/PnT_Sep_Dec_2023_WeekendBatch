package com.automation.Sep_17_2023_Day6_Validation_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Validations {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");

		// Landing Page
	    String actualTitle = driver.getTitle();
	    String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
	    String actualCurrenturl = driver.getCurrentUrl();
	    String expectedCurrenturl = "https://www.rediff.com/";
	   
	    WebElement logo = driver.findElement(By.xpath("//span[@class = 'hmsprite logo']"));
	    WebElement createAccountLink = driver.findElement(By.linkText("Create Account"));
	    
	    if(actualTitle.equals(expectedTitle) && logo.isDisplayed() && createAccountLink.isEnabled()) {
	    	System.out.println("Landing Page is correct");
	    	driver.findElement(By.className("signin")).click();
	    }else {
	    	System.out.println("Landing Page is incorrect");
	    }
	    		
	    // Login Page
	    System.out.println("Login page title is: " + driver.getTitle());
	    System.out.println("Login page current url is: " + driver.getCurrentUrl());
	    
	    String actutalTitleLoginPage = driver.getTitle();
	    String expectedTitleLoginPage = "Rediffmail";
	    
	    String actualCurrentUrlLoginPage = driver.getCurrentUrl();
	    String expectedCurrentUrlLoginPage = "https://mail.rediff.com/cgi-bin/login.cgi";
	    
	   WebElement usernameTextbox = driver.findElement(By.id("login1"));
	   WebElement passwordTextbox = driver.findElement(By.id("password"));
	   WebElement loginButton = driver.findElement(By.name("proceed"));
	    
	   if(actutalTitleLoginPage.equals(expectedTitleLoginPage) && actualCurrentUrlLoginPage.equals(expectedCurrentUrlLoginPage)
			   && usernameTextbox.isDisplayed() && passwordTextbox.isEnabled()) {
		   usernameTextbox.sendKeys("seleniumpanda@rediffmail.com");
		   passwordTextbox.sendKeys("Selenium@123");
		   loginButton.click();
	   }else {
		   System.out.println("Login Page is not valdiated");
	   }
		   

		driver.findElement(By.className("rd_logout")).click();
	   

		// Logout Page
		boolean displayStatus = driver.findElement(By.xpath("//p[text() = 'You have successfully signed out of Rediffmail.']")).isDisplayed();
		System.out.println(displayStatus);

	}



}
