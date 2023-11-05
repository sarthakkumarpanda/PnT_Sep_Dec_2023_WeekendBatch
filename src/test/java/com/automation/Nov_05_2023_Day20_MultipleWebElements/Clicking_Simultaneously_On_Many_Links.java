package com.automation.Nov_05_2023_Day20_MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Clicking_Simultaneously_On_Many_Links {
	
	public WebDriver driver;
	
	@Test
	public void rediff() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		List<WebElement> rediffFooterLinks = driver.findElements(By.xpath("//div[@class = 'footer alignC']/a"));
		
		for(int i=0 ; i<rediffFooterLinks.size() ; i++) {
			//let's get url of each link
			String url = rediffFooterLinks.get(i).getAttribute("href");
			System.out.println(rediffFooterLinks.get(i).getText() + "---->" + url);
			
			//what if I want to click on each link
			rediffFooterLinks.get(i).click();
			System.out.println("title of this page is :" + driver.getTitle());
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			//What is Stale Element Reference Exception?
			rediffFooterLinks = driver.findElements(By.xpath("//div[@class = 'footer alignC']/a"));
			Thread.sleep(1000);
			
		}
	}

}
