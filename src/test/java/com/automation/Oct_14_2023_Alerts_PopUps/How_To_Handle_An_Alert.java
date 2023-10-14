package com.automation.Oct_14_2023_Alerts_PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class How_To_Handle_An_Alert {

	public WebDriver driver;
	
	@Test
	public void handlingAlert() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		
		//you will ask your driver to switch to that alert
		Alert alert = driver.switchTo().alert();
		//this is under an interface known as Alert
		//Alert is not a class. It is an interface
		
		//important interview question - What are the 3 most important methods inside Alert interface
		
		//1. getText() - this will give you text of the alert
		
		String messageOfTheAlert = alert.getText();
		System.out.println(messageOfTheAlert);
		
		//2. accept();
		
		//3. dismiss();
	}
}
