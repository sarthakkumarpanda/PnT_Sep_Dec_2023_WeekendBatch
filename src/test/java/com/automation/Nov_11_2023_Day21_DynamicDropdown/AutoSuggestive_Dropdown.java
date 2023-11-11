package com.automation.Nov_11_2023_Day21_DynamicDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestive_Dropdown {

	public WebDriver driver;
	
	@Test
	public void makeMyTrip() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys("New");
		Thread.sleep(2000);
		
		int i=0;
		while(i<5) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.DOWN);
			i++;
		}
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		driver.findElement(By.id("toCity")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys("Las");
		
		int j=0;
		while(j<3) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.DOWN);
			j++;
		}
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.ENTER);
		
	}
	
	@Test
	public void easeMyTripAutoSuggestPlusJump() {
		//homework
	}
}
