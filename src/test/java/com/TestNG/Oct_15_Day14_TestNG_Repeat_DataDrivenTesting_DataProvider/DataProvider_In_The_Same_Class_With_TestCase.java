package com.TestNG.Oct_15_Day14_TestNG_Repeat_DataDrivenTesting_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_In_The_Same_Class_With_TestCase {
	
	    //Parameterization - there is a logic
	                         ///you can use multiple inputs over that logic. Whatever the output is that you will record
	
	
		//DataProvider in TestNG
		//Excel Sheet using DataProvider
	
	//DataProvider is an annotation in TestNG. It is represented as      @DataProvider
	//Rules associated with @DataProvider
	
	//Rule 1: It returns a 2-D Object Array
	//Rule 2: You have to pass the data in forms of rows and cols
	//Rule 3: You have to connect the @Test case with the @DataProvider. There are 2 ways to achieve this
	                //1st way - pass dataProvider = "nameofthemethodin@DataProvider"
	                //2nd way - give a name to the @DataProvider and in @Test(dataProvider = "nameofthe@DataProvider")
	//Rule 4: you have to parameterize the method in @Test with respect to no of cols in @DataProvider
	
	
	@Test(dataProvider="dataCheck" )
	public void loginTest(String browserName, String username, String password, int mob_no) {
		System.out.println(browserName + "--" + username + "---" + password + " --- " + mob_no);
		
	}
	
	
	
	@DataProvider(name = "dataCheck")
	public Object[][] getData() {
		//We will design a 2-D Object array
		
		Object[][] data = new Object[3][4];
		
		data[0][0] = "chrome"; //String
		data[0][1] = "username1"; //String
		data[0][2] = "password1"; //String
		data[0][3] = 98765432; //int
		
		data[1][0] = "firefox";
		data[1][1] = "username2";
		data[1][2] = "password2";
		data[1][3] = 98765433;
		
		data[2][0] = "edge";
		data[2][1] = "username3";
		data[2][2] = "password3";
		data[2][3] = 98765434;
		
		return data;
		
	}

}
