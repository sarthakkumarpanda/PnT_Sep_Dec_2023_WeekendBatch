package com.java.Oct_22_2023_OOPS_Polymorphism_MethodOverloading_InJava_Day16;

public class MainMethod_BeOverloaded {

	public static void main(String[] args) {
	main(10);	
	main(args = new String[3], args = new String[4]);

	}
	
	//can the main method be overloaded? YES
	
	
	public static void main(int i) {
		System.out.println(200 + 200);
	}
	
	public static void main(String[] args1, String[] args2) {
		System.out.println("This is the overloaded main method with 2 String [] args");
	}

}
