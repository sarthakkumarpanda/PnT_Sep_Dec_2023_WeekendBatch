package com.java.Oct_28_Day17_ExceptionHandling;

public class Program9_Possible_Combinations_Try_catch_finally {
	
	//only try is not possible
	//only catch is not possible
	//only finally is not possible
	//try-catch  yes possible
	//try-finally yes possible
	//try-catch-finally yes possible
	
	//can I have one try and multiple catches ? YES
	//Conditions
	//1. If the catch blocks have the same Class name then it is not allowed
	//2. the first catch block cannot have the parent Class
	//3. the first catch block can have the Child class and the second catch block can have the Parent class
	
	//can a try block have try catch block - YES
	//can a catch block have try-catch block - YES
	//can a finally block have try-catch block - YES
	//can a finally block only have catch block - NO

	public static void main(String[] args) {
		
		try {
			try {
				int a=10, b=0;
				int c=a/b;
				System.out.println(c);
			} catch (ArithmeticException e) {
				
				try {
					int a=10, b=0;
					int c=a/b;
					System.out.println(c);
				} catch (ArithmeticException e1) {
					e.printStackTrace();
				} 
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
