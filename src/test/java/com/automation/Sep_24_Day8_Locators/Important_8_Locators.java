package com.automation.Sep_24_Day8_Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Important_8_Locators {
	
	//id
	//className
	//name
	//linkText
	//partiallinkText
	//xpath
	//cssSelector
	//tagname - mostly used as a locator for multiple WebElements
	
	public static void main(String[] args) {
		//determine the total number of links present in Rediff HomePage
		//links are represented by a html tag. a is anchor tag
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("total links are :" + allLinks.size());
	}

}
