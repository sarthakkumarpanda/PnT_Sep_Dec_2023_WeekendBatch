package com.TestNG.Sep_24_2023_Day8_TestNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_TestNG {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("BeforeSuite is the first annotation to execute");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("BeforeTest is the second annotation to execute");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("BeforeClass is the third annotation to execute");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("BeforeMethod is the next annotation to execute");
	}
	
	@Test
	public void testCase1() {
		System.out.println("This is Test Case1 logic");
	}
	
	@Test
	public void testCase2() {
		System.out.println("This is Test Case2 logic");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("Afterthod is the next annotation to execute");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("AfterClass is the next annotation to execute");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("AfterTest is the next annotation to execute");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("AfterSuite is the next annotation to execute");
	}

}
