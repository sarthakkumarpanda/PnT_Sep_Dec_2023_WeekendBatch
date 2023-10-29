package com.TestNG.Oct_29_2023_Day18_TestNG_Groups;

import org.testng.annotations.Test;

//learning from PnT - I can show you max 5-6 Test Cases
//in realtime project there might 500, 600, 2000 Test cases
//Seggregate them

//Groups
//how to create Groups?
//execute Groups
//MetaGroups? for example you want to define TestCases which will run everynight - Overnight Test Cases
//Regular Expressions
//Groups at a Class level

@Test(groups = "CompleteClassLevelGroup")
public class Groups {
	
	@Test(groups = {"smoke"})
	public void tc1() {
		System.out.println("This is T1 logic");
		
	}
	
	@Test(groups = {"smoke" , "sanity"})
	public void tc2() {
		System.out.println("This is T2 logic");
		
	}
	
	@Test(groups = {"smoke", "sanity", "regression"})
	public void tc3() {
		System.out.println("This is T3 logic");
		
	}
	
	@Test(groups = {"windows.sanity"})
	public void tc4() {
		System.out.println("This is T4 logic");
		
	}
	
	@Test(groups = {"macOS.regression"})
	public void tc5() {
		System.out.println("This is T5 logic");
		
	}

}
