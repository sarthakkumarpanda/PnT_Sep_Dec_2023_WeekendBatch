package com.automation.Nov_11_2023_Day21_ToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rediff_ToolTips {
	
	public WebDriver driver;
	
	@Test
	public void loginTest() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
	 //determine the tool tip of Create Account
		WebElement createAccountLink = driver.findElement(By.linkText("Create Account"));
		String tooltipText = createAccountLink.getAttribute("title");
		System.out.println("The tooltip of create account link is : " + tooltipText);
		
	}

}
