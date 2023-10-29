package com.java.Oct_29_Day18_this_keyword;

public class Program5 {
	//use 3 - this() can be used to invoke current class constructor
	
	
	Program5(){
		System.out.println("No argument constructor");
		
	}
	
	Program5(int i){
		this();
		System.out.println("Parameterized constructor");
	}

	public static void main(String[] args) {
		//Program5 prog = new Program5();
		Program5 prog = new Program5(10);

	}

}
