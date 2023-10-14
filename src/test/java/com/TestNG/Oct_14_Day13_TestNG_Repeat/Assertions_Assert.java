package com.TestNG.Oct_14_Day13_TestNG_Repeat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertions_Assert {
	public WebDriver driver;
	
	@BeforeMethod
	public void loginSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();	
		driver.findElement(By.linkText("Login")).click();
	}
	
	@Test(priority=0, enabled = false)
	public void explainAssertions() {
		//assertTrue(), assertFalse(), assertEquals(), assertNotEquals()
		
		Assert.assertTrue(1<2); //this condition is true. So this will pass
		Assert.assertFalse(1>2);//this condition is also true. So this will pass
		Assert.assertTrue( 1 != 1); //True (false) - this leads to false
		Assert.assertTrue( true == false); // True (false) - this also leads to false
		
		Assert.assertEquals(false, true); // equals between two entities. false and true leads to false. So final is false
		Assert.assertNotEquals(false, true);  //this whole condition is true
		
		String S1 = "I am learning Java";
		String S2 = "I am learning Python";
		
		//compare these two Strings using Assertions
		
		Assert.assertEquals(S1, S2);    //false
		Assert.assertNotEquals(S1, S2); //true
		Assert.assertTrue(S1.equals(S2)); //false
		Assert.assertTrue(!(S1.equals(S2))); //true
		
		WebElement mother = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]"));
		//I want to determine the text which this mother WebElement holds
		String actualWarningMessage = mother.getText();
		
		//String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		
		Assert.fail();
		Assert.fail("Deliberately failing it");
	}
	
	@Test(priority=1)
	public void verifyLoginWithValidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click(); 
		
		//first you need to decide what you need to Assert
		//then you highlight or objectify that WebElement
		//the you apply Assertion
		
		WebElement editYourAccountInfoLink = driver.findElement(By.linkText("Edit your account information"));
		WebElement logoutLink = driver.findElement(By.linkText("Logout"));
		
		Assert.assertTrue(editYourAccountInfoLink.isDisplayed() && logoutLink.isDisplayed());
		
	}
	
	@Test(priority=2)
	public void verifyLoginWithInvalidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpdasfasdfanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click(); 
		
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		//Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
		
	}
	
	@Test(priority=3)
	public void verifyLoginWithValidEmailInvalidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
	}
	
	@Test(priority=4)
	public void verifyLoginWithInvalidEmailValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpaasdfsadfnda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click(); 
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
	}
	
	@Test(priority=5)
	public void verifyLoginWithNoCredentials() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click(); 
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
