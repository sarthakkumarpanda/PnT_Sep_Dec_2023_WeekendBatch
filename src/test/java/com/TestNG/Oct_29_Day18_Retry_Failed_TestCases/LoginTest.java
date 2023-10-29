package com.TestNG.Oct_29_Day18_Retry_Failed_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	public WebDriver driver;
	
	@Test(retryAnalyzer = MyRetry.class)

	public void loginValidationCorrectCredentials() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		Assert.fail("Deliberately failing to show students how to retry failed test cases in TestNG");
		
		//As a fail safe you want to make sure that those test cases which failed in the first run, gets 2 or 3 more chances to run
		//internet issue
		//the particular webelement could not render properly
		//during the time of execution may be server was slow. the responses were slow
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
