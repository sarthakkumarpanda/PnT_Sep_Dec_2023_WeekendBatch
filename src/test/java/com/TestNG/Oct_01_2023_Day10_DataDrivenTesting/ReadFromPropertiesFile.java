package com.TestNG.Oct_01_2023_Day10_DataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromPropertiesFile {
	//What is properties file?
	// .properties and it basically stores the following types of data
	// 1. the basic configured data of the application - url, browser, validEmail, validPassword
	// 2. the system response generated data
	// 3. user input data
	
	//Why use Properties file?
	//When we write industry standard code we should not hardcode our data i.e., our data should not be visible in the code directly
	//rather it should be customized. Hence, we use properties file.
	
	public static Properties prop;
    public static FileInputStream ip;
	public static void main(String[] args) throws Exception{
		//Step 1 - Create a properties file
		//Step 2 - The data should be saved in key = value 
		//Step 3 - Create the Object of Properties Class
		//Step 4 - Create the Object of FileInputStream class and pass the path of the properties file in the constructor object
		//Step 5 - Load the file
		
		prop = new Properties();
        ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\TestNG\\Oct_01_2023_Day10_DataDrivenTesting\\config.properties");
        prop.load(ip);
	    
	    login();
	    
	}
	
	public static void login() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

}
