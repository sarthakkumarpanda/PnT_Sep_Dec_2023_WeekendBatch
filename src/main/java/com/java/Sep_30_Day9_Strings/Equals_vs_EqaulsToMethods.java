package com.java.Sep_30_Day9_Strings;

public class Equals_vs_EqaulsToMethods {

	public static void main(String[] args) {
		String S1 = new String("Java"); //2 objects will be created. 1 in the Heap Memory and the other in the SLP
		String S2 = new String("Java");
		
		System.out.println(S1 == S2);
		
		String S3 = "Hello";
		String S4 = "Hello";
		System.out.println(S3 == S4);
		
	
	}

}
