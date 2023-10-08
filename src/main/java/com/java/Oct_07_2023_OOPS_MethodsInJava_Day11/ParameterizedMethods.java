package com.java.Oct_07_2023_OOPS_MethodsInJava_Day11;

public class ParameterizedMethods {

	public static void main(String[] args) {
		joiningTwoStrings("Monkey", "Donkey");	
		addTwoNumbers(1, 299);

	}
	
	//an example of non-parameterized method
	public static void addingTwoIntegers() {
		
	}
	
	//an example of paramterized method
	public static String joiningTwoStrings(String S1, String S2) {
		String S3 = S1+S2;
		System.out.println(S3);
		return S3;
		
	}
	
	public static int addTwoNumbers(int i, int j) {
		int k = i+j;
		System.out.println(k);
		return k;
	}
	
	
	

}
