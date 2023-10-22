package com.java.Oct_22_2023_OOPS_Abstraction_AbstractClass_InJava_Day16;

public class PrivateSchool extends Student{

	public static void main(String[] args) {
		PrivateSchool ps = new PrivateSchool();
		
		System.out.println(ps.age = 20);
		System.out.println(ps.name = "John");
		
		//We cannot create the Object of Abstract Class
	//	School school = new School(); //this is not happening
		
		// We will use the Parent Class to refer the Object of Child Class
		
		Student ref = new PrivateSchool();
		//Student is the parent abstract Class
		//ref is the reference
		//new PrivateSchool() is the Object of Child Class
		
		//A parent class reference is pointing towards the object of Child Class
		ref.studentMarksheet();
		ref.studentLibrary();
		ref.studentPlayground();

	}
	
	public void privateSchoolCourseCurriculum() {
		System.out.println("This is private's school course curriculum");
	}
	
	public void privateSchoolHallAssembly() {
		System.out.println("This is private's school prayerHall and Assembly");
	}

	@Override
	public void studentMarksheet() {
	System.out.println("Write your own logic");	
	}

	@Override
	public void studentPlayground() {
	System.out.println("write your own logic");	
	}

}
