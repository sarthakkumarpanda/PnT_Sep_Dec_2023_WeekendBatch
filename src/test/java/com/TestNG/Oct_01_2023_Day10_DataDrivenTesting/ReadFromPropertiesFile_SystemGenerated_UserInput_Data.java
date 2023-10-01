package com.TestNG.Oct_01_2023_Day10_DataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ReadFromPropertiesFile_SystemGenerated_UserInput_Data {
	public static Properties prop;
	public static FileInputStream ip;

	public static void main(String[] args) throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\com\\TestNG\\Oct_01_2023_Day10_DataDrivenTesting\\testdata.properties");
        prop.load(ip);
        
        loginTest();
	}
	
	public static void loginTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("invalidPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = prop.getProperty("emailPasswordMismatchWarning");
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
	}

}
