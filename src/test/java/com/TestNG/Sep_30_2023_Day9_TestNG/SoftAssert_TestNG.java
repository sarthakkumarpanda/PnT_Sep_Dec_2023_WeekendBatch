package com.TestNG.Sep_30_2023_Day9_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_TestNG {
	
	@Test
	public void hardAssert() {
		//Hard Assert - if at a particular line within the TestCase or within the Logic, Assert fails
		//other lines of code after the failure of Assertion will not execute.
		
		int i=1;
		int j=2;
		Assert.assertTrue(i != j); //this is passing
		
		int a=3;
		int b=2;
		System.out.println(a+b); //5 will not get printed
	}
	
	@Test
	public void softAssert() {
		SoftAssert softassert = new SoftAssert();
		int i=1;
		int j=2;
		softassert.assertTrue(i == j); //this condition is false
		
		int a=3;
		int b=2;
		System.out.println(a+b);
		
		softassert.assertAll();
		
	}

}
