package com.java.Oct_22_2023_OOPS_Abstraction_AbstractClass_InJava_Day16;

public abstract class Student { 
	
	String name;
	int age;
	
	
	
	
	//abstract(undefined/unimplemented)
	//How do you create an Abstract method?
	//Ans : 1. By using the abstract keyword
	//      2. By not creating the method body
	
	public abstract void studentMarksheet();
	
	public abstract void studentPlayground();
	
	
	public void studentLibrary() {
		System.out.println("This is a concrete or simple or normal or regular method");
	}

}
