package com.TestNG.Oct_15_Day14_TestNG_Repeat_DataDrivenTesting_Properties_File;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RediffLogin_PropertiesFile {

	public WebDriver driver;

	@Test
	public void readingFromPropertiesFile() throws Exception {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\TestNG\\Oct_15_Day14_TestNG_Repeat_DataDrivenTesting\\config.properties");
		prop.load(ip);

		String browserName = "chrome";
		if (browserName.equals(prop.getProperty("browser"))) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url1"));
		driver.findElement(By.id("login1")).sendKeys(prop.getProperty("validRediffUsername"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("validRediffPassword"));
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		driver.quit();

	}

}
