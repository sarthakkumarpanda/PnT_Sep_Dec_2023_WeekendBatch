package com.java.Oct_21_2023_OOPS_Objects_InJava_Day15;

public class Static_NonStatic_In_Java {
	
	static int wheels;
	String name;
	static int rollNumber;
	boolean promotion;

	public static void main(String[] args) {
		//static means - it is purely for the Class
		//non static means - it is purely for the Object
		
		//Rules for static: 
		//1. static can only call static
		//2. static cannot call non-static
		
		//Rules for non-static:
		//1. non-static can call non-static
		//2. non-static can also call static but not recommended
		
		logic1();
		logic3();
		wheels = 4;
		rollNumber = 101;
		
		
		Static_NonStatic_In_Java reference = new Static_NonStatic_In_Java();
		reference.logic2();
		reference.logic4();
		reference.name = "Monty";
		reference.promotion = true;
	}
	
	
	public static void logic1() {
		System.out.println("This is static logic1 method");
		logic3();
		wheels = 6;
		
	}

	public void logic2() {
		System.out.println("This is non-static logic2 method");
		logic4();
		name = "John";
		logic1();
	}
	
	public static void logic3() {
		System.out.println("This is static logic3 method");
		rollNumber = 102;
	}
	
	public void logic4() {
		System.out.println("This is non-static logic4 method");
	}
}
