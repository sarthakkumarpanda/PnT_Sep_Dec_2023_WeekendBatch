package com.automation.Nov_11_2023_Day21_Keyboard_Actions_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Example1 {

	public WebDriver driver;
	
	@Test
	public void keyBoardActions() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		
		Actions action = new Actions(driver);
		
		//keyDown
		//KeyUp
		//sendKeys
		//copy paste
		//tab
		WebElement firstname = driver.findElement(By.id("input-firstname"));
		
		action.click(firstname).sendKeys("Selenium").build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.click(driver.findElement(By.id("input-lastname"))).sendKeys("Panda").build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		
		WebElement password = driver.findElement(By.id("input-password"));
		action.click(password).sendKeys("Selenium@123").build().perform();
		//action.keyDown(null)
		//Ctrl+A - select All
		//action.keyDown(password, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		//Ctrl+C - Copy
		action.keyDown(password, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//action.sendKeys(Keys.TAB).build().perform();
		//Ctrl+V - Paste
		WebElement confirmPassword = driver.findElement(By.id("input-confirm"));
		confirmPassword.click();
		
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	}
}
