package com.TestNG.Sep_24_2023_Day8_TestNGBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriCombo_Annotations {


	@BeforeMethod
	public void setup() {
		System.out.println("Begin");
	}
	
	@Test
	public void testCase1() {
		System.out.println("The rose is red");
	}
	
	@Test
	public void testCase2() {
		System.out.println("The rose is pink");
	}
	
	
	@Test
	public void testCase3() {
		System.out.println("The rose is yellow");
	}
	
	@AfterMethod
	public void closing() {
		System.out.println("End");
	}

}
