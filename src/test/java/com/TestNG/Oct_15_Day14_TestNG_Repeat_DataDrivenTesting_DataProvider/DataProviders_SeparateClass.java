package com.TestNG.Oct_15_Day14_TestNG_Repeat_DataDrivenTesting_DataProvider;

import org.testng.annotations.DataProvider;

public class DataProviders_SeparateClass {
	
	
	@DataProvider(name = "TNLogin")
	public Object[][] TNLoginData() {
		Object[][] data = {{"seleniumpanda@gmail.com" ,    "Selenium@123"},
				           {"seleniumpanda1@gmail.com",    "Selenium@123"}, 
		                   { "seleniumpanda2@gmail.com",   "Selenium@123"},
		                   { "seleniumpanda3@gmail.com",   "Selenium@123"},
		                   { "seleniumpanda4@gmail.com",   "Selenium@123"},
		                   { "seleniumpanda5@gmail.com",   "Selenium@123"},
		                   { "seleniumpanda6@gmail.com",   "Selenium@123"},
		                   { "seleniumpanda7@gmail.com",   "Selenium@123"},
		                   { "seleniumpanda8@gmail.com",   "Selenium@123"},
		                   { "seleniumpanda9@gmail.com",   "Selenium@123"},
		                   { "seleniumpanda10@gmail.com",   "Selenium@123"},
		                   { "seleniumpanda11@gmail.com",   "Selenium@123"}};
		return data;

		}
	
	
	@DataProvider(name = "RediffLogin")
	public Object[][] rediffLoginData() {
		Object[][] data = {{"seleniumpanda@rediffmail.com" , "Selenium@123"},
				           {"seleniumpanda1@rediffmail.com", "Donkey@123"  }, 
		                   { "chowdhurygs@rediffmail.com",	"Shajlee1@"    },
		                   { "homa_rahimi@rediffmail.com",	"Winter2021?"  }};
		return data;

		}


}
