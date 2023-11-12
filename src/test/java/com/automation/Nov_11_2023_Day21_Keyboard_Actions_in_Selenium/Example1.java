package com.automation.Nov_11_2023_Day21_Keyboard_Actions_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Example1 {

	public WebDriver driver;

	@Test
	public void rediffLoginTest1() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		Actions action = new Actions(driver);

		// if we are using Actions Class and keyboard operations then it is better you
		// specify WebElements separately

		WebElement username = driver.findElement(By.id("login1"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement signInButton = driver.findElement(By.className("signinbtn"));

		// keydown
		// keyup
		// sendkeys
		// copypaste
		// tab

		// Select All - Ctrl+A
		// Copy - Ctrl+C
		// Paste - Ctrl+V
		// UPPERCASE - Shift+Alphabet

		//action.click(username).sendKeys("seleniumpanda@rediffmail.com").perform();
		action.click(username).sendKeys("seleniumpanda@rediffmail.com").sendKeys(Keys.TAB).perform();
		password.sendKeys("Selenium@123");
		//action.click(password).sendKeys("Selenium@123").perform();
		signInButton.sendKeys(Keys.ENTER);

	}
	
	@Test
	public void rediffLoginTest2() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		Actions action = new Actions(driver);
		WebElement username = driver.findElement(By.id("login1"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement signInButton = driver.findElement(By.className("signinbtn"));
		
		action.click(username).sendKeys("seleniumpanda@rediffmail.com").perform();
		//Selecting all - Ctrl+A
		action.keyDown(username, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		//Copy - Ctrl+C
		action.keyDown(username, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		//Paste - Ctrl+V
		action.click(password).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		action.click(signInButton).perform();
		
	}
	
	@Test
	public void registerTNTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		
		WebElement firstname = driver.findElement(By.id("input-firstname"));
		WebElement lastname = driver.findElement(By.id("input-lastname"));
		WebElement email = driver.findElement(By.id("input-email"));
		WebElement telephone = driver.findElement(By.id("input-telephone"));
		WebElement password = driver.findElement(By.id("input-password"));
		WebElement confirmPassword = driver.findElement(By.id("input-confirm"));
		WebElement privacyPolicy = driver.findElement(By.xpath("//input[@name = 'agree' and @value='1']"));
		WebElement continueButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		
		
		
	}
}
