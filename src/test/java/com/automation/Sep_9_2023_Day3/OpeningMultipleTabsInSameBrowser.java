package com.automation.Sep_9_2023_Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningMultipleTabsInSameBrowser {

	// Ctrl + Shift + F

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://flipkart.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://costco.com");

	}

}
