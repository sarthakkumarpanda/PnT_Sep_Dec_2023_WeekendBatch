package com.java.Oct_29_Day18_this_keyword;

public class Program6 {
	//use 4 - this can be used to pass as an argument in the method call
	
	
	void m1(Program6 prog) {
		System.out.println("I am in the m1 method");
	}
	
	void m2() {
		m1(this);
	}

	public static void main(String[] args) {
		Program6 prog = new Program6();
		prog.m2();

	}

}
