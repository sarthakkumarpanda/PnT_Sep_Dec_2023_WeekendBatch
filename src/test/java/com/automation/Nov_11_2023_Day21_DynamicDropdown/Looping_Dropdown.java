package com.automation.Nov_11_2023_Day21_DynamicDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Looping_Dropdown {
	public WebDriver driver;

	@Test(priority = 1)
	public void easeMyTripTravellersLooping() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://easemytrip.com");

		// preSelection = 1
		// postSelection = n travelers

		String preSelection = driver.findElement(By.id("spnDrpNo")).getText();
		System.out.println("Travelers before selection is : " + preSelection);

		driver.findElement(By.id("ptravlrNo")).click();

		int Adults = 1;
		while (Adults < 5) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id = 'add' and @class = 'add plus_box1']")).click();
			Adults++;
		}
		
		int Children = 0;
		while (Children < 2) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id = 'add' and @class = 'add plus_boxChd']")).click();
			Children++;
		}
		
		int Infant = 0;
		while (Infant < 5) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id = 'add' and @class = 'add plus_box1Inf']")).click();
			Infant++;
		}
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("traveLer")).click();
		
		Thread.sleep(1000);
		String postSelection = driver.findElement(By.id("spnDrpNo")).getText();
		System.out.println("Travelers after selection is : " + postSelection);
	}
	
	
	@Test
	public void spiceJetLoopingTravlers() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	}
	
	
	

}



