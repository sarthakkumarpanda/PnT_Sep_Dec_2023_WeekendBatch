package com.TestNG.Oct_15_Day14_TestNG_Repeat_DataDrivenTesting_Properties_File;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HowToReadFromPropertiesFile {	
	public WebDriver driver;
	
	@Test
	public void readingFromPropertiesFile() throws Exception {
		//Step 1 - Create the Object of Properties Class
		Properties prop = new Properties();
		
		//Step 2 - Create the Object of FileInputStream Class and pass the path of the .properties file in it
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\TestNG\\Oct_15_Day14_TestNG_Repeat_DataDrivenTesting\\config.properties");
		
		//Step 3 - Load the properties file
		prop.load(ip);
		
		String browserName = "chrome";
		
		if(browserName.equals(prop.getProperty("browser"))) {
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validUsername"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

}
