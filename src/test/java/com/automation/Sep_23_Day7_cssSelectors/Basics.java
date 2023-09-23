package com.automation.Sep_23_Day7_cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a[class = signin]")).click();
		driver.findElement(By.cssSelector("input[id=login1]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input[id=password]")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input[class = signinbtn]")).click();
	}

}
