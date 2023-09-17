package com.automation.Sep_17_2023_Day6_Validation_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationTechniques {

	public static void main(String[] args) {
	
		validationAtWebpageLevel();
	}
	
	//At a Webpage level there are 3 validation methods which have been defined in Selenium
	// getCurrentUrl()
	// getTitle()
	// getPageSource()
	
	//At a WebElement level there are again 3 validation methods which have been defined in Selenium
	// isDisplayed()
	// isEnabled()
	// isSelected()
	
	
	public static void validationAtWebpageLevel() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); 
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("My landing page is correct");
		}else {
			System.out.println("My landing page is incorrect");
		}
		
		
		if(driver.getTitle().equals("Rediff.com: News | Rediffmail | Stock Quotes | Shopping")) {
			driver.findElement(By.className("signin")).click();
		}else {
			System.out.println("my landing page title and current url are incorrect");
		}
		
		WebElement usernameTextBox = driver.findElement(By.id("login1"));
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.name("proceed"));
		if (usernameTextBox.isEnabled() && passwordTextBox.isEnabled() && loginButton.isDisplayed() ) {
			usernameTextBox.sendKeys("seleniumpanda@rediffmail.com");
			passwordTextBox.sendKeys("Selenium@123");
			loginButton.click();
			
		}else {
			System.out.println("username and password textbox are not enabled");
		}
	}
	
	
	
	public static void validationAtWebElementLevel() {
		
	}

}
