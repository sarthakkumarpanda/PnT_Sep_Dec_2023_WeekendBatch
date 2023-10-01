package com.TestNG.Oct_01_2023_Day10_DataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WholePropertiesData {
	public static Properties prop;
	public static Properties dataprop;
	public static FileInputStream ip;
	public static FileInputStream ip1;

	public static void main(String[] args) throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\TestNG\\Oct_01_2023_Day10_DataDrivenTesting\\config.properties");
        prop.load(ip);
        
        dataprop = new Properties();
        ip1 = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\TestNG\\Oct_01_2023_Day10_DataDrivenTesting\\testdata.properties");
        dataprop.load(ip1);
        
        loginTest();
        
	}
	
	public static void loginTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(dataprop.getProperty("invalidPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = dataprop.getProperty("emailPasswordMismatchWarning");
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
	}

}
