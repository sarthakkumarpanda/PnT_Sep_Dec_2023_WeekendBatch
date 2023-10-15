package com.TestNG.Oct_15_Day14_TestNG_Repeat_DataDrivenTesting_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestCases_SeparateClass {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@Test(priority=2, dataProvider = "RediffLogin", dataProviderClass = DataProviders_SeparateClass.class)
	public void rediffLoginTest(String username, String password) {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);	
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		Assert.assertTrue((driver.findElement(By.className("rd_logout")).isDisplayed()));
		
	}
	
	
	@Test(priority=1, dataProvider = "TNLogin", dataProviderClass = DataProviders_SeparateClass.class)
	public void tnLoginTest(String username, String password) {
		
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);	
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue((driver.findElement(By.linkText("Logout")).isDisplayed()));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
