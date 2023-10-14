package com.TestNG.Oct_14_Day13_TestNG_Repeat;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion_Concepts {
	
	//What is the difference between SoftAssert and Assert ??
	
	//SoftAssert
	//Assert - is known as Hard Assert
	
	//you have to create the Object of SoftAssert Class
	
	@Test
	public void mathematics() {
		
		SoftAssert softassert = new SoftAssert();
		
		
		System.out.println("Start");
		System.out.println(2+3);
		//Assert.assertTrue(2>3);
		softassert.assertTrue(2 > 3); //false
		System.out.println("End");
		softassert.assertTrue(400 != 400); //false
		
		softassert.assertAll(); //it is accumulating all the false statements
		
		
	}

}
