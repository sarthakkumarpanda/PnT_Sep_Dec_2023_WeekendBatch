package com.TestNG.Oct_01_2023_Day10_TestNG_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Rule 1: It returns a 2-Dimensional Object Array
//Rule 2: You have to pass the data in rows and cols format
//Rule 3: Connect the Test Case with the @DataProvider by passing dataProvider="nameofthemethodin@DataProvider"
//Rule 4: you have to parameterize the method in @Test with total no of cols taking care of the datatypes


public class Rules_DataProvider {
	
	@Test(dataProvider = "getData")
	public void loginTest(String username, String password, int emp_id, boolean promotion) {
		System.out.println(username + "---" + password + "---" + emp_id + "-----" + promotion);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][4]; //rows and cols. Total rows are 3 and Total cols are 4
		
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[0][2] = 98765454;
		data[0][3] = true;
		
		data[1][0] = "username2";
		data[1][1] = "password2";
		data[1][2] = 98765456;
		data[1][3] = true;
		
		data[2][0] = "username3";
		data[2][1] = "password3";
		data[2][2] = 98765458;
		data[2][3] = false;
		
		return data;
		
	}

}
