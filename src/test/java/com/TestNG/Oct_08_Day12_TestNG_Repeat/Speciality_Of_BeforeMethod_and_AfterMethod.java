package com.TestNG.Oct_08_Day12_TestNG_Repeat;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Speciality_Of_BeforeMethod_and_AfterMethod {	
//@BeforeMethod runs everytime there is an @Test - it will run everytime before each TestCase
//@AfterMethod runs everytime there is an @Test - it will run everytime after each TestCase
//Tri-combo execution of TestNG
	
	@BeforeMethod
	public void setup() {
		System.out.println("This is my application setup code");
	}
	
	@Test
	public void testCase1() {
		System.out.println("This is TestCase logic 1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("This is TestCase logic 2");
	}
	
	@Test
	public void testCase3() {
		System.out.println("This is TestCase logic 3");
	}
	
	@AfterMethod
	public void closing() {
		System.out.println("Closing my logic");
	}

}
