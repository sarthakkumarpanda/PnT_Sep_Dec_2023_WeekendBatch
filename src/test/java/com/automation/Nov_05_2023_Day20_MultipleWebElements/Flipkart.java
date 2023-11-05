package com.automation.Nov_05_2023_Day20_MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Flipkart {
	
	public WebDriver driver;
	
	@Test
	public void formalShirts() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/clothing-and-accessories/topwear/shirt/men-shirt/formal-shirt/pr?sid=clo,ash,axc,mmk,bk1&otracker=categorytree&otracker=nmenu_sub_Men_0_Formal%20Shirts");
		//I want to print the brand name, description of the shirt, price of the shirt and discount % displayed
		
		Thread.sleep(2000);
		List<WebElement> formalShirts = driver.findElements(By.cssSelector("div._2WkVRV"));
		List<WebElement> description = driver.findElements(By.cssSelector("a.IRpwTa"));
		List<WebElement> prices = driver.findElements(By.cssSelector("div._30jeq3"));
		List<WebElement> discountPercentage = driver.findElements(By.cssSelector("div._3Ay6Sb"));
		
		for(int i=0 ; i<formalShirts.size() ; i++) {
			System.out.println(formalShirts.get(i).getText() + "---->" + description.get(i).getText() + "---->" + prices.get(i).getText() +"--->" + discountPercentage.get(i).getText() );
		}
		
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
