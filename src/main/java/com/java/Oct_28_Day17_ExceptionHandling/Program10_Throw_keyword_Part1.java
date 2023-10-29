package com.java.Oct_28_Day17_ExceptionHandling;

public class Program10_Throw_keyword_Part1 {

	public static void main(String[] args) {
		Program10_Throw_keyword_Part1  prog = new Program10_Throw_keyword_Part1 ();
		prog.divideByZero();

	}
	
	
	
	public static void divideByZero() {
		int a=10, b=0;
		int c=a/b;
		System.out.println(c);
		throw new ArithmeticException(); //here the Exception Object will be created but the twist is programmer is creating it manually
		
		//throw keyword is basically used for Custom/User-defined Exceptions
		//Note: Avoid using it for pre-defined exceptions
		
	}
	
	
	//divideByZero() will create an exception Object and jvm will ask divideByZero() if it can handle the exception
	//divideByZero() will deny handling the exception, so jvm will abruptly terminate divideByZero() method
	//now jvm will ask the caller method (main()) method if it will be able to handle the Exception or not
	//main() method will also deny saying it cannot handle the exception, so jvm will also terminate the main method
	//jvm but to transfer this to DEH and DEH will print the Objects
	

}
