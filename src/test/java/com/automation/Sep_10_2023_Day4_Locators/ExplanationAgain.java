package com.automation.Sep_10_2023_Day4_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplanationAgain {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rediff.com");
	
	//you want to click on Business Email link
	driver.findElement(By.className("bmailicon relative")).click();

	}

}
