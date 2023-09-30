package com.java.Sep_30_Day9_Strings;

public class MemoryLocations_InDepthUnderstanding {

	public static void main(String[] args) {
		String S = new String();
		//I am creating a String Object using new keyword and I am not passing any literal
		//1 Object will be created in the Heap Memory
		
		String S1 = new String("Java");
		//here 2 objects are created
		//1 object in Heap Memory because of new keyword
		//another object in the SLP memory because of the literal "Java" passed
		
		String S2 = "C++";
		//here 1 object will be directly created inside the SLP memory
		
		//What is the difference between
		
		//String S1 = new String("Java")          v/s              String S2 = "C++"
		//2 objects are created - Heap and SLP                  1 Object is created in SLP
		//Heavy                                                 Light
		//this one is not recommended in case of Strings        //recommended in case of Strings
		
		//Interview Question
		
		//If you want to make a String Object will you choose String S1 = "Java"; or will you choose String S1 = new String("Java");
		
		

	}

}
