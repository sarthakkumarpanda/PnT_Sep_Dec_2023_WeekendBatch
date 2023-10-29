package com.java.Oct_27_Day18_SpecialClasses_Wrapper_Class;

public class Program4_Boxing_AutoBoxing_Unboxing_AutoUnboxing {
	
	//direct parent class of Character and Boolean Wrapper Class --> Object class
	//direct parent of other Wrapper Classes ---> Number class
	
	
	//Boxing - conversion of primitive data type to Wrapper Class Object
	//Unboxing - conversion of Wrapper Class Object to primitive data type
	
	//Homework - try boxing and unboxing for other primitive Data Types and Wrapper Classes

	public static void main(String[] args) {
		boxingExample();
		autoBoxingExample();
		unboxingExample();
		autoUnboxingExample();

	}
	
	
	public static void boxingExample() {
		int a = 10;
		Integer b = Integer.valueOf(a); //primitive to Wrapper
		System.out.println(b);
		
	}
	
	public static void autoBoxingExample() {
		int a = 10;
		Integer b = a;
		System.out.println(b);
		
	}
	
	public static void unboxingExample() {
		Integer result = 200;
		int newResult = result.intValue(); //Wrapper to primitive
		System.out.println(newResult);
	   
	}
	
	public static void autoUnboxingExample() {
		Integer result = 200;
		int newResult = result;
		System.out.println(newResult);
	}

}
