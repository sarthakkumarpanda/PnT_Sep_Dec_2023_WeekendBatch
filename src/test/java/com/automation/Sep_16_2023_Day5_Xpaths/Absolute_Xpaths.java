package com.automation.Sep_16_2023_Day5_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpaths {
	

	public static void main(String[] args) {
		tutorialsninjaLogin();	

	}
	
	public static void tutorialsninjaLogin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		//not able to click on Login button
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).click();
		
	}

}
