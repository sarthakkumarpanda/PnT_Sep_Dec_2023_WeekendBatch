package com.java.Oct_28_Day17_ExceptionHandling;

public class Program8_final_vs_finally_finalize {
	
	//final is a keyword
	//finally is also a keyword but it cannot be used without a block
	//finalize() is a method
	
	
	//final can be used with variable, method and class
	//final method cannot be over-ridden
	
	//finally block can be used with try block or try-catch block
	//finally block mostly holds cleanup code
	
	//finalize() method is used for overriding an Object

	public static void main(String[] args) {
		final int a=10; //when final is used for a variable that means the value of this variable cannot be changed	
	}
	
	public static final void show() {
		System.out.println("This is show method which is final");
	}
	
	
	protected void finalize() throws Throwable {
		//syntax of finalize() method
		//this method can be overridden
		//executes just before Garbage Collection
		//if any object is about to be deleted, and if there is some resource related to that Object which is open, then the code inside
		//finalize() method will close the resource
		//so technically finalize() method also does the clean up job
	}
	

}

class Test extends Program8_final_vs_finally_finalize{
	
	
	
}
