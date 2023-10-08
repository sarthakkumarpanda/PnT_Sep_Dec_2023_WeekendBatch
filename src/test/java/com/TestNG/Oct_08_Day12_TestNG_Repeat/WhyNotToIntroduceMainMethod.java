package com.TestNG.Oct_08_Day12_TestNG_Repeat;

import org.testng.annotations.Test;

public class WhyNotToIntroduceMainMethod {

	public static void main(String[] args) {
		System.out.println("This is the main method");
	}
	
	@Test
	public void executionEngine() {
		System.out.println("This is execution engine of TestNG");
		
	}

}
