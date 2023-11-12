package com.automation.Nov_12_2023_Day22_Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Example1 {
	
	public WebDriver driver;
	
	@Test
	public void openWeatherMap() throws Exception{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");
		
		//Step 1: Whichever WebElement you want screenshot of highlight it separately
		WebElement logo = driver.findElement(By.cssSelector("div.section.where-to"));
		
		//Step 2: using the logo we can call a method known as getScreenshotAs
		File source = logo.getScreenshotAs(OutputType.FILE);
		
		//Step 3: Manually create the screenshots folder where you want these screenshots saved
		File destination = new File(System.getProperty("user.dir") + "\\test-output\\Screenshots\\openWeatherMaplogo.png");
		
		//Step 4: Use the FileHandler class to copy the source file into destination path
		FileHandler.copy(source, destination);
	}
	
	@Test
	public void shaadiHomePageBanner() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com/");
		
		//Step 1: Whichever WebElement you want screenshot of highlight it separately
		WebElement logo = driver.findElement(By.xpath("//div[@id = '__next']/child::div[1]"));
		
		//Step 2: using the logo we can call a method known as getScreenshotAs
		File source = logo.getScreenshotAs(OutputType.FILE);
		
		//Step 3: Manually create the screenshots folder where you want these screenshots saved
		File destination = new File(System.getProperty("user.dir") + "\\test-output\\Screenshots\\ShaadiHomeBanner.png");
		
		//Step 4: Use the FileHandler class to copy the source file into destination path
		FileHandler.copy(source, destination);
	}

}
