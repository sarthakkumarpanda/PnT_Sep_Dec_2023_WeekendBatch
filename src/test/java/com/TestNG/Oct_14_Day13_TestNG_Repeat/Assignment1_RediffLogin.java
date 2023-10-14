package com.TestNG.Oct_14_Day13_TestNG_Repeat;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment1_RediffLogin {
	
//	seleniumpanda@rediffmail.com	   Selenium@123
//	seleniumpanda1@rediffmail.com	   Donkey@123
//	chowdhurygs@rediffmail.com	       Shajlee1@
//	homa_rahimi@rediffmail.com	       Winter2021?
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	public void loginRediff() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	
	@Test(priority=1)
	public void verifyLoginWithValidCredentials() {
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda1@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Donkey@123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		//you want to assert the logout
		//Objectify the logout link
		//Assert the presence of logout link
		
		WebElement logoutLink = driver.findElement(By.className("rd_logout"));
		Assert.assertTrue(logoutLink.isDisplayed(), "I could not find the logout link");
	}
	
	@Test(priority=2)
	public void verifyLoginWithValidUsernameInvalidPassword() {
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda1@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123456");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		
		String actualWarningMessage = driver.findElement(By.xpath("//div[@id = 'div_login_error']")).getText();
		String expectedWarningMessage = "Wrong username and password combination.";
		
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
	}
	
	@Test(priority=3)
	public void verifyLoginWithInvalidUsernameValidPassword() {
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda1@rediffmail100.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		
		String actualWarningMessage = driver.findElement(By.xpath("//div[@id = 'div_login_error']")).getText();
		String expectedWarningMessage = "Temporary Issue. Please try again later. [#5002]";
		
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
	}
	
	@Test(priority=4)
	public void verifyLoginWithInvalidCredentials() {
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda1@rediffmail100.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123456");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[@id = 'div_login_error']")).getText();
		String expectedWarningMessage = "Wrong username and password combination.";
		
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
	}
	
	@Test(priority=5)
	public void verifyLoginWithNoCredentials() {
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		Alert alert = driver.switchTo().alert();
		String actualAlertMessage = alert.getText();
		String expectecAlertMessage = "Please enter a valid user name";
		
		Assert.assertEquals(actualAlertMessage, expectecAlertMessage);
		alert.accept();
	
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
