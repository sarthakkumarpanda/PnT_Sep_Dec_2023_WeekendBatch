package com.TestNG.Oct_08_Day12_TestNG_Repeat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment1 {
public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
	}
	
	@Test
	public void verifyLoginWithValidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
	}
	
	@Test
	public void verifyLoginWithInvalidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("selenium200panda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
	}
	
	@Test
	public void verifyLoginWithInvalidEmailValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("selenium200panda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@Test
	public void verifyLoginWithValidEmailInvalidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@Test
	public void verifyLoginWithNoCredentials() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@AfterMethod
	public void closing() {
		driver.quit();
	}
}
