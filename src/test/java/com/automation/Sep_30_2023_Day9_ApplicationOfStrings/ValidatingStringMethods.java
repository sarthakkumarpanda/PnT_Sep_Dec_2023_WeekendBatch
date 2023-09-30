package com.automation.Sep_30_2023_Day9_ApplicationOfStrings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidatingStringMethods {
	
	public WebDriver driver;
	
	@Test
	public void checkingEqualsMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualEditAccountInfoLink = driver.findElement(By.linkText("Edit your account information")).getText();
		String expectedEditAccountInfoLink = "Edit your account information";
		System.out.println(actualEditAccountInfoLink.equals(expectedEditAccountInfoLink));
		System.out.println(actualEditAccountInfoLink == expectedEditAccountInfoLink);
		
		String actualChangeYourPasswordLink = driver.findElement(By.linkText("Change your password")).getText();
		String expectedChangeYourPasswordLink = "Change your password";
		System.out.println(actualChangeYourPasswordLink.equals(expectedChangeYourPasswordLink));
		
		String actualModifyYourAddressBookEntriesLink = driver.findElement(By.linkText("Modify your address book entries")).getText();
		String expectedModifyYourAddressBookEntriesLink = "Modify your address book entries";
		System.out.println(actualModifyYourAddressBookEntriesLink.equals(expectedModifyYourAddressBookEntriesLink));
		
		String actualModifyYourWishListLink = driver.findElement(By.linkText("Modify your wish list")).getText();
		String expectedModifyYourWishListLink = "Modify your wish list";
		System.out.println(actualModifyYourWishListLink.equals(expectedModifyYourWishListLink));
		
		String actualLogoutLink = driver.findElement(By.linkText("Logout")).getText();
		String expectedactualLogoutLink = "Logout";
		if(actualLogoutLink.equals(expectedactualLogoutLink)) {
			driver.findElement(By.linkText("Logout")).click();
		}
		
		
		
		
		
	}
}
