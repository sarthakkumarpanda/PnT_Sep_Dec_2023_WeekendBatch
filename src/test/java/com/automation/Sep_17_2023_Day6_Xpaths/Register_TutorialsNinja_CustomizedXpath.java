package com.automation.Sep_17_2023_Day6_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_TutorialsNinja_CustomizedXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//fieldset[@id = 'account']/descendant::input[@name = 'firstname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//fieldset[@id = 'account']/descendant::input[@name = 'lastname']")).sendKeys("Panda");
		driver.findElement(By.xpath("//fieldset[@id = 'account']/descendant::input[@name = 'email']")).sendKeys("helloworld98090@gmail.com");
		driver.findElement(By.xpath("//aside[@id = 'column-right']/preceding::input[@id = 'input-telephone']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@name = 'telephone']/following::input[@name = 'password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'telephone']/following::input[@name = 'confirm']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//aside[@id = 'column-right']/preceding::input[@name = 'newsletter' and @value = '1']")).click();
		driver.findElement(By.xpath("//div[@class = 'pull-right']/child::a[1]/following-sibling::input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//div[@class = 'pull-right']/descendant::input[@class = 'btn btn-primary']")).click();

	}

}
