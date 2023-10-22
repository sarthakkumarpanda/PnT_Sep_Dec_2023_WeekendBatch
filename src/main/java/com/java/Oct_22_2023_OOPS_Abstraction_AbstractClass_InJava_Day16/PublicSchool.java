package com.java.Oct_22_2023_OOPS_Abstraction_AbstractClass_InJava_Day16;

public class PublicSchool extends Student{
	
	
	
	
	public void publicSchoolCourseCurriculum() {
		System.out.println("This is public's school course curriculum");
	}
	
	public void prayerHallAssembly() {
		System.out.println("This is public's school prayerHall and Assembly");
	}

	@Override
	public void studentMarksheet() {
	System.out.println("Student's marksheet");	
		
	}

	@Override
	public void studentPlayground() {
	System.out.println("Student's playground");	
		
	}

}
