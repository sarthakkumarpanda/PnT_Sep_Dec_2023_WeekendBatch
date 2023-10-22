package com.java.Oct_22_2023_OOPS_Polymorphism_MethodOverriding_InJava_Day16;

public class Student extends School{

	public static void main(String[] args) {
		Student student = new Student();
		student.education();
		student.mandatoryFees(200);
	
	}

	
	void education() {
		System.out.println("This is child's class education method");
	}
	
	void mandatoryFees(int i) {
		System.out.println("This is child's class mandatory fee with int parameter");
	}
}
