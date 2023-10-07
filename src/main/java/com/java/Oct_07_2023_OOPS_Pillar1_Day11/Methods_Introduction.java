package com.java.Oct_07_2023_OOPS_Pillar1_Day11;

public class Methods_Introduction {

	// Methods - independent units of execution. Logical units/factories of java
	// coding logic execution
	// What happens in a factory - you have raw material > Brain > Finished Product
	
	//How many types of methods are there?
	//1. Concrete Method
	//2. Unimplemented Method
	
	//How many methods have we worked on so far?
	//Both but you do not know that you have 
	
	//What is a Concrete method?
	//A method which has an access modifier, a return type, a body
	
	//syntax of a concrete method

	public static void main(String[] args) {
		adding();
		joinThreeStrings();
		validateSalaryIncrease();
	}
	

	public static int adding() {
		int i = 10;
		int j = 20;
		int k = i+j;
		System.out.println(k);
		return k;	
	}
	
	public static String joinThreeStrings() {
		String S1 = "Hello";
		String S2 = "World";
		String S3 = "Automation";
		String S4 = S1+S2+S3;
		System.out.println(S4);
		return S4;
	}
	
	public static boolean validateSalaryIncrease() {
		boolean salaryIncrease2022 = true;
		boolean salaryIncrease2023 = false;
		
		int performance = 95;
		int expectation = 100;
		
		if(performance<expectation) {
			System.out.println("No salary increase");
		}else {
			System.out.println("Salary increase");
		}
		
		
	    boolean expectationFrom2024 = false;
	    return expectationFrom2024;
	   
		
	}

}
