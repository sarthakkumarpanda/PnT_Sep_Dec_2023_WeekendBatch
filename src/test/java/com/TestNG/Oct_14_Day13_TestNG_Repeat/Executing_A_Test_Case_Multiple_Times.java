package com.TestNG.Oct_14_Day13_TestNG_Repeat;

import org.testng.annotations.Test;

public class Executing_A_Test_Case_Multiple_Times {
	
	@Test(priority=1)
	public void logic1() {
		System.out.println("Hello World");
	}
	
	@Test(priority=2)
	public void logic2() {
		System.out.println("Hello World Tour");
	}
	
	@Test(priority=3, invocationCount=5)
	public void logic3() {
		System.out.println("Hello World Tour Java");
	}

}
