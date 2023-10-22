package com.java.Oct_22_2023_OOPS_Polymorphism_InJava_Day16;

public class Overloading_Example {

	public static void main(String[] args) {
		Overloading_Example ref = new Overloading_Example();
		ref.add();
		ref.add(10, 20);
	

	}
	
	public void add() {
		System.out.println(10 + 20);
	}
	
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public double add(double a, double b) {
		double c = a + b;
		return c;
	}
	
	public String add(String a, String b) {
		String c = a + b;
		return c;
	}

}
