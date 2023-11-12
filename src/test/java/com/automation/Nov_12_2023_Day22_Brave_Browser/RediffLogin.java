package com.automation.Nov_12_2023_Day22_Brave_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class RediffLogin {
	
	//Step 1: Download and install Brave browser in your laptop
	//Step 2: You need the path where the brave.exe file is  C:\Program Files\BraveSoftware\Brave-Browser\Application\\brave.exe
	//Step 3: You have to use ChromeOptions and with the options reference call the setBinary method and pass the path mentioned in Step 2
	
	public WebDriver driver;
	
	@Test
	public void checkingBraveBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		driver.quit();
	}

}
