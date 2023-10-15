package com.TestNG.Oct_15_Day14_TestNG_Repeat_DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class HowToReadFromPropertiesFile {	
	
	@Test
	public void readingFromPropertiesFile() throws Exception {
		//Step 1 - Create the Object of Properties Class
		Properties prop = new Properties();
		
		//Step 2 - Create the Object of FileInputStream Class and pass the path of the .properties file in it
		FileInputStream ip = new FileInputStream("C:\\Users\\sarth\\eclipse-workspace\\PnT_Sep_Dec_2023_Weekend_Batch\\src\\test\\java\\com\\TestNG\\Oct_15_Day14_TestNG_Repeat_DataDrivenTesting\\config.properties");
	}

}
