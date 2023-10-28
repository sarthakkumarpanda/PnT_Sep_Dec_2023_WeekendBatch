package com.java.Oct_28_Day17_ExceptionHandling;

public class Program4_How_to_handle_Exceptions {

	public static void main(String[] args) {
	
		example1();
	}
	
	
	public static void example1() {
		//in this example we will work with a RunTime/Unchecked Exception
		int a=10, b=0;
		int c = a/b;
		System.out.println(c);
		
	}
	
	public static void explanation() {
		//Exception occurs at Row no 14. This line int c=a/b is under example1() method
		//example1() method will create an Object whenever encounters an Exception
		//this Object has 3 things:-  1. Exception Name [it technically has the Class name]
		//                            2. Description [what type of exception it is]
		//                            3. StackTrace [ which line and method has the exception]
		//example1() method will not be able to handle the exception
		//this object will be passed to JVM. JVM will check if it handle the exception
		//if JVM cannot handle the exception it will pass it on to Default Exception Handler
		//but before JVM passes the object of DEH, it will abnormally terminate the program
		//DEH will print the exception
		
		//How to handle this Exception manually ?
		//by using 5 different keywords
		//1. try
		//2. catch
		//3. finally
		//4. throw
		//5. throws
	}

}
