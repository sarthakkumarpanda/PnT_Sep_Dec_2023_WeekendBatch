package com.TestNG.Oct_01_2023_Day10_TestNG_DataProvider;

import org.testng.annotations.DataProvider;

public class DataProviders_Only {
	@DataProvider(name = "TN")
	public Object[][] getDataTN() {
		Object[][] data = { { "seleniumpanda@gmail.com", "Selenium@123" },
				            { "seleniumpanda1@gmail.com", "Selenium@123" }, 
				            { "seleniumpanda2@gmail.com", "Selenium@123" },
				            { "seleniumpanda3@gmail.com", "Selenium@123" }, 
				            { "seleniumpanda4@gmail.com", "Selenium@123456" } };
		return data;
	}

	
	@DataProvider(name = "Rediff")
	public Object[][] getDataRediff() {
		Object[][] data = { { "seleniumpanda@rediffmail.com", "Selenium@123" },
				            { "seleniumpanda1@rediffmail.com", "Donkey@123" }}; 
				                         
		return data;
	}

}
