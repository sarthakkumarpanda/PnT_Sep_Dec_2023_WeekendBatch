package com.TestNG.Oct_15_Day14_TestNG_Repeat_DataDrivenTesting_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Rediff_SameClass {
	public WebDriver driver;
	
	@Test(dataProvider = "rediffLogin")
	public void rediffLoginTest(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		Assert.assertTrue((driver.findElement(By.className("rd_logout")).isDisplayed()));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@DataProvider(name = "rediffLogin")
	public Object[][] rediffLoginData() {
		Object[][] data = {{"seleniumpanda@rediffmail.com" , "Selenium@123"},
				           {"seleniumpanda1@rediffmail.com", "Donkey@123"  }, 
		                   { "chowdhurygs@rediffmail.com",	"Shajlee1@"    },
		                   { "homa_rahimi@rediffmail.com",	"Winter2021?"  }};
		return data;

		}
		
	}


