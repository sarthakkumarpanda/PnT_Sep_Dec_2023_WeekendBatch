package com.automation.Sep_23_Day7_Validations_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Basics {
	//what is validation - comparing the actual output with the expected output
	
	
	
	public static void main(String[] args) {
		//webpageValidation();
		webelementValidation();
	}
	
	public static void webpageValidation() {
		//getTitle()
		//getCurrentUrl()
		
		//Step1 - First you need to know what is the title of the webpage and what is the current url of the webpage
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//What is the title of this landingpage?
		System.out.println("Title of the landingpage of rediff is: " + driver.getTitle());
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Rediff url is working fine");
		}else {
			System.out.println("the url is not correct");
		}
	}
	
	
	public static void webelementValidation() {
		//isDisplayed()
		//isEnabled()
		//isSelected()
		
		//you want to verify all the header links are enabled and displayed
		
		//Money, Videos, Business Email, Shopping, Sign in and Create Account - these links are present and enabled
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		WebElement moneyLink = driver.findElement(By.linkText("Money"));
		WebElement businessemaillLink = driver.findElement(By.linkText("Business Email"));
		WebElement shoppingLink = driver.findElement(By.linkText("Shopping"));
		WebElement videosLink = driver.findElement(By.linkText("Videos"));
		WebElement signinLink = driver.findElement(By.linkText("Sign in"));
		WebElement createaccountLink = driver.findElement(By.linkText("Create Account"));
		
		if(moneyLink.isDisplayed() && moneyLink.isEnabled() && businessemaillLink.isDisplayed() && businessemaillLink.isEnabled()) {
			System.out.println("The validations are correct");
		}else {
			System.out.println("Validations are incorrect");
		}
			
		
	}
	public static void integerBooleanValidation() {
		
		
		int i = 1+2; //3
		int j = 3-2; //1
		
		if(i<j || j>i) {
			System.out.println("logic is correct");
		}else {
			System.out.println("incorrect");
		}
		
	}

}
