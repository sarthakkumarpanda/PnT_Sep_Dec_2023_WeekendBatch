package com.automation.Sep_16_2023_Day5_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {
	
	//there are typically 8 different syntaxes for Dynamic Xpath
	
	//there are certain functions which can be used in Dynamic Xpath
	
	//there are certain keywords which can be used in Dynamic Xpath
	
	//Dynamic Xpath is also known as Relative Xpath or Customized Xpath as it is customized by the Automation Tester
	
	//What is the Catch in writing Xpath?
	//Make sure the xpath is 1 of 1 in the Chrome Browser Editor
	// How will you open the Chrome Browser Editor ?
	//Chrome Browser Editor is the space where we write Xpaths
	
	//Once you right click on a WebElement and the DOM opens. Simply press Ctrl+F of your keyboard
	
	//Syntax 1:
	
	//html[@attribute = 'valueofthatattribute']
	
	
	//Syntax 2:
	
	//html[@attribute1 = 'value1' and @attribute2 = 'value2']
	
	
	//Syntax 3:
	
	//html[@attribute1 = 'value1' or @attribute2 = 'value2']
	
	public static void main(String[] args) {
		//tutorialsninjaLogin();
		tutorialsninjaRegister();

	}
	
	public static void tutorialsninjaLogin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
	
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		
	}
	
	
	
	//html[@attribute = 'valueofthatattribute']
	
	
	public static void tutorialsninjaRegister() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Panda");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda23456789@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("987654310");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
	}
	
	

}
