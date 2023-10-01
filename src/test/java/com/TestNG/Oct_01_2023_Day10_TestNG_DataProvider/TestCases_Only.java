package com.TestNG.Oct_01_2023_Day10_TestNG_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestCases_Only {

	public WebDriver driver;

	@Test(priority=1, dataProvider = "getDataTN", dataProviderClass = DataProviders_Only.class)
	public void loginTN(String email, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());

	}
	
	@Test(priority=2, dataProvider = "Rediff", dataProviderClass = DataProviders_Only.class)
	public void loginRediff(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
