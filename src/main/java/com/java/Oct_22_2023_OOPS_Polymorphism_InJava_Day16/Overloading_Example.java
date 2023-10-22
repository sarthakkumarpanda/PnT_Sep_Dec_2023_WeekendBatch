package com.java.Oct_22_2023_OOPS_Polymorphism_InJava_Day16;

public class Overloading_Example {

	public static void main(String[] args) {
		Overloading_Example ref = new Overloading_Example();
		ref.add();
		ref.add(10, 20);
		ref.add(1.1, 2.2);
		ref.add("Hello", "World");

	}

	public void add() {
		System.out.println(10 + 20);
	}

	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);

	}

	public void add(double a, double b) {
		double c = a + b;
		System.out.println(c);
	}

	public void add(String a, String b) {
		String c = a + b;
		System.out.println(c);
	}

}
