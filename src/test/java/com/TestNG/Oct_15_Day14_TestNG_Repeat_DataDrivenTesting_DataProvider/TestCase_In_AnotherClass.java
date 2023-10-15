package com.TestNG.Oct_15_Day14_TestNG_Repeat_DataDrivenTesting_DataProvider;

import org.testng.annotations.Test;

public class TestCase_In_AnotherClass {
	
	//How to connect @Test with @DataProvider which resides in another Class
    //Anser :   @Test (dataProvider = "nameofthe@DataProvider", dataProviderClass = nameOftheClass@DataProvider.class)
	
	@Test(dataProvider = "dataCheck", dataProviderClass = DataProvider_In_Another_Class.class)
	public void tryingToConnectWithDataProviderInAnotherClass(String browser, String username, String password, int mob_no) {
		
	}

}
