package com.java.Oct_22_2023_OOPS_Encapsulation_InJava_Day16;

public class Student {
	
	private String name; //data hiding
	private int age; //data hiding
	
	
	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getData1() {
		return name;
	}
	
	public int getData2() {
		return age;
	}

}
