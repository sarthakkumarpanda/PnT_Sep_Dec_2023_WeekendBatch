package com.java.Oct_28_Day17_ExceptionHandling;

public class Program5_Try_Catch_Block {
	
	
	
	public static void main(String[] args) {
		tryCodeisNotRiskySoWhatHappensToCatchBlock();
		//example2();
		//example1();
		
	}
	
	public static void example1() {
		
		try {
			int a=10, b=0;
			int c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("The exception has been handled");
		}
		
	}
	
	public static void example2() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("6");
			System.out.println("7");
			System.out.println("8");
			System.out.println("9");
			System.out.println("10");
		} 
	
	}
	
	public static void tryCodeisNotRiskySoWhatHappensToCatchBlock() {
		try {
			int a=10, b=2;
			int c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("There is no problem in the try block or there is no risk, still I am using try catch");
		}
	}

}
