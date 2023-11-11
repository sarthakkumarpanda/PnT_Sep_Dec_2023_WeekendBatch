package com.automation.Nov_11_2023_Day21_Waits_In_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Facebook_WaitConditions {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	@Test(priority=1)
	public void facebookWebDriverWaitTest() throws Exception {
		//I want my Explicit wait to be smart as well.
		//Thread.sleep(nnnn) is not smart. It is rigid.
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); - this is working
		driver.findElement(By.linkText("Create new account")).click();
		//Thread.sleep(2000);                                                - this is working
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("firstname"))).sendKeys("Selenium");  //this is working
		//driver.findElement(By.name("firstname")).sendKeys("Selenium");
	
	}

}
