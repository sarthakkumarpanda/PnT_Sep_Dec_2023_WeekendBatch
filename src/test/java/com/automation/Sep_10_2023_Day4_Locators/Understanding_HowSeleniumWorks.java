package com.automation.Sep_10_2023_Day4_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Understanding_HowSeleniumWorks {

	public static void main(String[] args) {
		//every laptop is a Client
		//you write the Selenum Code with OOP language of your choice in the Client
		//this code interacts with the Server of the Application you want to use.
		//The Application is in form of a website
		//so to interact with that application you need a browser.
		//Selenium+OOP language Code interacts with the drivers of that browser which in turn interacts with the Browser
		//finally we see the outcome in the browser as a UI (user interface)
		
		//Selenium is an API library
		
		WebDriver driver = new ChromeDriver(); //Ctrl + Shift + O to import the packages from the Library
		//row no 18 opens a blank Chrome Browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://makemytrip.com");
		
		driver.quit();
	}

}
