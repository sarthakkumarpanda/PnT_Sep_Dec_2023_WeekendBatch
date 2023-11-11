package com.automation.Nov_11_2023_Day21_Mouse_Actions_in_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Example1 {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@Test
	public void easeMyTripMouseActions() {
		
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://easemytrip.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step 1: Create the Object of Actions class
		//Step 2: Pass the driver reference in the Constructor
		
		Actions action = new Actions(driver);
		
		//click and hold
		//click and release
		//context click - Right Click
		//Back click
		//forward click
		//double click
		//move to element
		//move by offset - 
		//drag and drop
		
		WebElement myAccount = driver.findElement(By.id("spnMyAcc"));
		action.moveToElement(myAccount).build().perform();
		
		WebElement LoginButton = driver.findElement(By.id("shwlogn"));
		action.moveToElement(LoginButton).click().build().perform();
		
		
		
	
	}
	
	@Test
	public void draggable() {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//you need to handle frames - frames are not in practice anymore
		//there could be multiple frames
		//frames are also WebElements
		
		//first you need to determine which frame
		
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of frames are : " + totalFrames.size());
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		action.dragAndDropBy(source, 300, 0).build().perform();
		
		
	}
	
	
	@Test
	public void dragAndDrop() {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//you need to handle frames - frames are not in practice anymore
		//there could be multiple frames
		//frames are also WebElements
		
		//first you need to determine which frame
		
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of frames are : " + totalFrames.size());
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		
		action.dragAndDrop(source, destination).build().perform();
		
		
	}
	

}
