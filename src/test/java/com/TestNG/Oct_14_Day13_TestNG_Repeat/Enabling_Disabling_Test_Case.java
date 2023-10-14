package com.TestNG.Oct_14_Day13_TestNG_Repeat;

import org.testng.annotations.Test;

public class Enabling_Disabling_Test_Case {

	@Test(priority=1)
	public void logic1() {
		System.out.println("This is logic 1");
		
	}
	
	@Test(priority=2, enabled = false) //do not write disabled=true
	public void logic2() {
		System.out.println("This is logic 2");
		
	}
	
	
	@Test(priority=3)
	public void logic3() {
		System.out.println("This is logic 3");
		
	}
}
