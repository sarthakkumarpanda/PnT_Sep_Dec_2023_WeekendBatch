package com.TestNG.Oct_08_Day12_TestNG_Repeat;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeadlessMode_ChromeOptions {
	
	//means the browsers will not open in the Front End UI application
	//Everything will happen in the backend
	
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	public void searchProductSetup() {
		 options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			options.addArguments("--headless");
			driver = new ChromeDriver(options);
			driver.get("https://tutorialsninja.com/demo");
	}
	
	@Test(priority=1)
	public void verifySearchWithValidProduct() {
		driver.findElement(By.name("search")).sendKeys("HP");
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
	}
	@Test(priority=2, invocationCount = 5)
	public void verifySearchWithInvalidProduct() {
		
		//may be one of the webelement is inconsistent. Sometimes it gives accurate results and sometimes it does not
		//we chose best of 2 out of 5 - at least we should run 5 times
		//this is like failsafe in case a particular WebElement(s) is/are misbehaving
		driver.findElement(By.name("search")).sendKeys("DELL");
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
	}
	
	@Test(priority=3)
	public void verifySearchWithNoProduct() {
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
