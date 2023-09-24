package com.TestNG.Sep_24_2023_Day8_TestNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Apply_TriCombo_Automation {
	public WebDriver driver;

	@BeforeMethod
	public void openApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
	}

	@Test
	public void selectLoginOption() {
		driver.findElement(By.linkText("Login"));
	}

	@Test
	public void selectregisterOption() {
		driver.findElement(By.linkText("Register"));
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
