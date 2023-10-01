package com.TestNG.Oct_01_2023_Day10_TestNG_ExcelSheet_DataProvider;

import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.java.Sep_30_Day9_SpecialClasses.Util;

public class TestCases {
	public WebDriver driver;
	public ChromeOptions options;
	
	@Test(priority=1, dataProvider = "TNLogin", dataProviderClass = ExcelCode.class)
	public void loginTNTest(String email, String password) {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());	
	}
	
	@Test(priority=2, dataProvider = "TNRegister", dataProviderClass = ExcelCode.class )
	public void registerTNTest(String firstname, String lastname, String telephone, String password, String confirmPassword) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(firstname);
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(lastname);
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(Util.emailWithDateTimeStamp());
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(telephone);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(confirmPassword);
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualAccountSuccessMessage = driver.findElement(By.xpath("//div[@id = 'content']/child::p[1]")).getText();
		String expectedAccountSuccessMessage = "Congratulations! Your new account has been successfully created!";
		Assert.assertTrue(actualAccountSuccessMessage.contains(expectedAccountSuccessMessage));
		
	}
	
	@Test(priority=3, dataProvider = "RediffLogin", dataProviderClass = ExcelCode.class )
	public void rediffLogin(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		Assert.assertTrue(driver.findElement(By.className("rd_logout")).isDisplayed());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
