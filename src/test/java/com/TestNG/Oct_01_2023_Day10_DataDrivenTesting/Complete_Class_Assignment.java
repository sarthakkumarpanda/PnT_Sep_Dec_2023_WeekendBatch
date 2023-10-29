package com.TestNG.Oct_01_2023_Day10_DataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.java.Sep_30_Day9_SpecialClasses_Date_Class.Util;

public class Complete_Class_Assignment {

	public static Properties prop;
	public static Properties dataprop;
	public static FileInputStream ip;
	public static FileInputStream ip1;
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\TestNG\\Oct_01_2023_Day10_DataDrivenTesting\\config.properties");
        prop.load(ip);
        
        dataprop = new Properties();
        ip1 = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\TestNG\\Oct_01_2023_Day10_DataDrivenTesting\\testdata.properties");
        dataprop.load(ip1);
        
        validLoginTest();
        invalidLoginTest();
        verifyRegisterWithMandatoryFields();
        verifyRegisterWithNoFields();
        
	}
	
	
	public static void validLoginTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}
	
	public static void invalidLoginTest() {
		driver = new ChromeDriver();
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
	
	public static void verifyRegisterWithMandatoryFields() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(dataprop.getProperty("firstname"));
		driver.findElement(By.id("input-lastname")).sendKeys(dataprop.getProperty("lastname"));
		driver.findElement(By.id("input-email")).sendKeys(Util.emailWithDateTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys(dataprop.getProperty("telephone"));
		driver.findElement(By.id("input-password")).sendKeys(dataprop.getProperty("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(dataprop.getProperty("confirmPassword"));
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualSuccessMessage = driver.findElement(By.xpath("//div[@id = 'content']/child::p[1]")).getText();
		String expectedSuccessMessage = dataprop.getProperty("accountSuccessMessage");
		Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage));
	}
	
	public static void verifyRegisterWithNoFields() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualPrivacyPolicyWarning = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedPrivacyPolicyWarning = dataprop.getProperty("privacyPolicyWarning");
		Assert.assertTrue(actualPrivacyPolicyWarning.contains(expectedPrivacyPolicyWarning));
		
		String actualFirstnameWarning = driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).getText();
		String expectedFirstnameWarning = dataprop.getProperty("firstNameWarning");
		Assert.assertTrue(actualFirstnameWarning.contains(expectedFirstnameWarning));
		
		
		String actualLastnameWarning = driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div")).getText();
		String expectedLastnameWarning = dataprop.getProperty("lastNameWarning");
		Assert.assertTrue(actualLastnameWarning.contains(expectedLastnameWarning));
		
		String actualEmailWarning = driver.findElement(By.xpath("//input[@id='input-email']/following-sibling::div")).getText();
		String expectedEmailWarning = dataprop.getProperty("emailWarning");
		Assert.assertTrue(actualEmailWarning.contains(expectedEmailWarning));
		
		String actualTelephoneWarning = driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).getText();
		String expectedTelephoneWarning = dataprop.getProperty("telephoneWarning");
		Assert.assertTrue(actualTelephoneWarning.contains(expectedTelephoneWarning));
		
		String actualPasswordWarning = driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div")).getText();
		String expectedPasswordWarning = dataprop.getProperty("passwordWarning");
		Assert.assertTrue(actualPasswordWarning.contains(expectedPasswordWarning));
	}

}
