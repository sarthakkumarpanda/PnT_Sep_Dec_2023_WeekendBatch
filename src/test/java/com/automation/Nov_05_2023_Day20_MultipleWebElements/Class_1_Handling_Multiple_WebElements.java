package com.automation.Nov_05_2023_Day20_MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Class_1_Handling_Multiple_WebElements {
	
	public WebDriver driver;
	
	@Test
	public void bbcDotCom() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
		
		//Give me total number of links present in https://bbc.com at this moment ???
		//Link is a WebElement ?
		//not 1 link. When I am asking total no of links on this Webpage right now that means WebElements
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links present is :" + links.size());
		
		//You might want to select a particular link. 1st link will go in 0th position
		//the 101st link - this will be in 100th position
		WebElement link101 = links.get(100);
		//you want to print the text of this link
		System.out.println("The text of this link is :" + link101.getText());
		//you want to determine what is the url present in the link
		System.out.println("the url for link101 is :" + link101.getAttribute("href"));
		//you want to know the x and y coordinate of link101
		System.out.println(link101.getLocation().x + "------>" + link101.getLocation().y);
		
		//to click on link101
		//link101.click();
		
		//print total links on the webpage and print their respective names and show whether they are displayed or hidden
		
		for(int i=0 ; i<links.size() ; i++) {
			WebElement totalBBCLinks = links.get(i);
			System.out.println(totalBBCLinks.getText() + "----------->" + totalBBCLinks.isDisplayed());
		}
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
