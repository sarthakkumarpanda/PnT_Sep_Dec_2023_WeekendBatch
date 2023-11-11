package com.automation.Nov_11_2023_Day21_Waits_In_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TN_Implicit_and_Explicit_Wait {

	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeMethod
	public void launchUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
	}
	
	@Test(priority=1)
	public void tnImplictWaitTest() {
		
		//implicit wait is smart form of wait.
		//let's say the webElement appears in 0.5 seconds, then the remaining 9.5 secs will not be utilized. It will just move on
		//what if the webelement does not show up till the 9th second?
		//still you have 1 more second. 
		
		//what if the WebElement does not show up till the 10th second?
		//this implicit wait will fail the execution and you will get some kind of Exception
		
	}
	
	
	@Test(priority=2)
	public void tnExplictWaitTest() throws Exception {
		Thread.sleep(3000); //is an example of Explicit Wait. No matter what it will wait out the whole duration. This is rigid. 
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@Test(priority=2)
	public void tnExplicitWebDriverWaitTest() throws Exception {
		//I want my Explicit wait to be smart as well.
		//Thread.sleep(nnnn) is not smart. It is rigid.

		
		//Step 1: Create the Object of WebDriverWait Class
		//Step 2: In the constructor you have to pass 2 parameters - driver reference, the other one is Duration class
		//Step 3: Use the wait reference and call the until method. Overload the until method with ExpectedConditions class
		//Step 4: Use the ExpectedConditions class to call any of the methods as per requirement
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My Account"))).click();
	
		//driver.findElement(By.linkText("My Account")).click(); //Let's say My Account is misbehaving
		
		WebElement loginDropdownOption = driver.findElement(By.linkText("Login"));
		wait.until(ExpectedConditions.elementToBeClickable(loginDropdownOption)).click();
		
		//driver.findElement(By.linkText("Login")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("input-email"))).sendKeys("seleniumpanda@gmail.com");
	   //driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
	
		wait.until(ExpectedConditions.elementToBeClickable(By.id("input-password"))).sendKeys("Selenium@123");
		//driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.btn.btn-primary"))).click();
		//driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	

	
	
}
