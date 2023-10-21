package com.java.Oct_21_2023_OOPS_Objects_InJava_Day15;

public class Student {
	
	String name; //what is the default value of a String ?? null
	int age; //what is the default value of an int ? 0
	boolean promotion; //default value of a boolean is false
	String classRoomEnrollment;
	String primarySubject;
	
	public Student(String name, int age, boolean promotion, String classRoomEnrollment, String primarySubject) {
		this.name = name;
		this.age = age;
		this.promotion=promotion;
		this.classRoomEnrollment = classRoomEnrollment;
		this.primarySubject = primarySubject;
		
	}
	
	

	public static void main(String[] args) {
		
      //Student student = new Student(); //Object has been created. A constructor is invoked the moment Object is created. Employee() is the constructor
		
		
       Student student1 = new Student("Tom", 10, true, "4B", "Science");
       //you created the Object and passed the parameters (student info in the constructor)
       //But have you manually invoked the constructor yet ? No
       System.out.println(student1.name + "---" + student1.age + " --- " + student1.promotion + "----" + student1.classRoomEnrollment + "---" + student1.primarySubject);
		
	
       Student student2 = new Student("John", 10, true, "4B", "Science");
       System.out.println(student2.name + "---" + student2.age + " --- " + student2.promotion + "----" + student2.classRoomEnrollment + "---" + student2.primarySubject);

	}

}
