package com.automation.Sep_24_Day8_ChromeOptions;

import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Browser {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		//I want to control the speed of my execution
		options.setPageLoadStrategy(PageLoadStrategy.EAGER); //EAGER, NORMAL, NONE
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rediff.com");
		driver.findElement(By.className("signin")).click();

	}

}
