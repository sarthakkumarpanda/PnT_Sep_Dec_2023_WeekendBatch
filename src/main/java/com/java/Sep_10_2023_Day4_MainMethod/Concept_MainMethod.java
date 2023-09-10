package com.java.Sep_10_2023_Day4_MainMethod;

public class Concept_MainMethod {

	public static void main(String[] args) {
		// main method will be the center of execution
		// main method will always be static because it is related at a Class level
		// main method can be overloaded
		// main method will have the public access modifier
		// main method's nomenclature cannot be changed

		System.out.println("This is the main method");
		logic1();
		
		Concept_MainMethod ref = new Concept_MainMethod();
		ref.logic2();
	}

	public static void logic1() {
		// you have very good logic here
		System.out.println("We are learning java");
	}
	
	public void logic2() {
		System.out.println(23+37);
	}

}
