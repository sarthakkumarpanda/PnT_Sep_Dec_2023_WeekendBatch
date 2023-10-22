package com.java.Oct_22_2023_OOPS_Inheritance_InJava_Day16;

public class Child extends Parent{
	
	public Child() {
		super(); //this represents the constructor of the parent Class
	}

	
	public void superBike() {
		System.out.println("Child's super bike");
	}
	
	public void superCar() {
		System.out.println("Child's super car");
	}
}
