package com.TestNG.Oct_22_Day16_Application_Of_OOPs_Interface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationCode {
	
	@Test
	public void setup() {
		WebDriver driver = new ChromeDriver();
		//WebDriver is an interface
		//driver is the reference of the interface
		//ChromeDriver is the implementing Class
		//new ChromeDriver() is the Object of the implementing Class
		
		//whenever we use () it represents methods
		
		driver.manage().window().maximize();
		
	}

}
