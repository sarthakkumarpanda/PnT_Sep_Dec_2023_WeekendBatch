package com.TestNG.Sep_30_2023_Day9_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.java.Sep_30_Day9_SpecialClasses_Date_Class.Util;

public class ClassAssignment_Register {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Register")).isDisplayed());
		driver.findElement(By.linkText("Register")).click();
	}
	
	@Test(priority=1)
	public void verifyRegisterWithMandatoryFields() {
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(Util.emailWithDateTimeStamp());
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualAccountSuccessMessage = driver.findElement(By.xpath("//div[@id = 'content']/child::p[1]")).getText();
		String expectedAccountSuccessMessage = "Congratulations! Your new account has been successfully created!";
		Assert.assertTrue(actualAccountSuccessMessage.contains(expectedAccountSuccessMessage));
		
	}
	
	@Test(priority=2)
	public void verifyRegisterWithAllFields() {
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(Util.emailWithDateTimeStamp());
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div>div>label:nth-child(1)>input")).click();
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualAccountSuccessMessage = driver.findElement(By.xpath("//div[@id = 'content']/child::p[1]")).getText();
		String expectedAccountSuccessMessage = "Congratulations! Your new account has been successfully created!";
		Assert.assertTrue(actualAccountSuccessMessage.contains(expectedAccountSuccessMessage));
		
	}
	
	@Test(priority=3)
	public void verifyRegisterWithExistingEmail() {
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div>div>label:nth-child(1)>input")).click();
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualDuplicateEmailWarning = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedDuplicateEmailWarning = "Warning: E-Mail Address is already registered!";
		Assert.assertTrue(actualDuplicateEmailWarning.contains(expectedDuplicateEmailWarning), "Then my assertion is incorrect");
		
		
		
	}
	
	@Test(priority=4)
	public void verifyRegisterWithNoDetails() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualPrivacyPolicyWarning = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedPrivacyPolicyWarning = "Warning: You must agree to the Privacy Policy!";
		Assert.assertTrue(actualPrivacyPolicyWarning.contains(expectedPrivacyPolicyWarning));
		
		String actualFirstnameWarning = driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).getText();
		String expectedFirstnameWarning = "First Name must be between 1 and 32 characters!";
		Assert.assertTrue(actualFirstnameWarning.contains(expectedFirstnameWarning));
		
		
		String actualLastnameWarning = driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div")).getText();
		String expectedLastnameWarning = "Last Name must be between 1 and 32 characters!";
		Assert.assertTrue(actualLastnameWarning.contains(expectedLastnameWarning));
		
		String actualEmailWarning = driver.findElement(By.xpath("//input[@id='input-email']/following-sibling::div")).getText();
		String expectedEmailWarning = "E-Mail Address does not appear to be valid!";
		Assert.assertTrue(actualEmailWarning.contains(expectedEmailWarning));
		
		String actualTelephoneWarning = driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).getText();
		String expectedTelephoneWarning = "Telephone must be between 3 and 32 characters!";
		Assert.assertTrue(actualTelephoneWarning.contains(expectedTelephoneWarning));
		
		String actualPasswordWarning = driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div")).getText();
		String expectedPasswordWarning = "Password must be between 4 and 20 characters!";
		Assert.assertTrue(actualPasswordWarning.contains(expectedPasswordWarning));
		
		
	}
	

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
