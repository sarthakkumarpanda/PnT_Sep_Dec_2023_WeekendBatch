package com.java.Oct_22_2023_OOPS_Polymorphism_MethodOverloading_InJava_Day16;

public class Automatic_Promotion {

	public static void main(String[] args) {
		Automatic_Promotion ref = new Automatic_Promotion();
		
		ref.display(1);
		ref.display('c'); //character is converting to integer

	}
	
	
	public void display(int i) {
		System.out.println("int parameter method");
	}

}
