package com.automation.Nov_12_2023_Day22_Date_Picker_Calendar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Type2 {

	public WebDriver driver;
	
	@Test
	public void datePicker() throws Exception {
		customizeDate("31", "January", "2027");
		
	}
	
	

	public void customizeDate(String selectDay, String selectMonth, String selectYear) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		//need to check for invalid date
		//a month cannot exceed 31 days
		//february cannot have more than 29 days
		
		//selectDay I have declared as a String. But selectDay cannot be greater than 31.
		
		if(Integer.parseInt(selectDay) > 31) {
			System.out.println("Invalid date");
			return;
		}
		
		if(selectMonth.equals("February") && Integer.parseInt(selectYear) > 29) {
			System.out.println("Invalid Feb month date");
			return;
		}
		
		
		
		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];
		
		while(!(month.equals(selectMonth) && year.equals(selectYear))) {
			driver.findElement(By.xpath("//a[@title = 'Next']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];
		}
		Thread.sleep(1000);
		
		String xpathDayText = "//td[@data-handler = 'selectDay']/a[text() = \'" + selectDay + "\']";
		
		
		
		try {
			driver.findElement(By.xpath(xpathDayText)).click();
		} catch (Exception e) {
			System.out.println("Invalid date");
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
