package com.java.Oct_22_2023_OOPS_Inheritance_InJava_Day16;

public class Parent extends GrandParent{
	
	private String name = "John";
	
	public Parent() {
		int i = 10;
		int j = 20;
		int k = i+j;
		System.out.println(k);
	}
	
	private void cashBox() {
		System.out.println("Parent's private cashBox");
	}

	
	public void bankBalance() {
		System.out.println("This is parent's Bank balance");
	}
	
	public void farmHouse() {
		System.out.println("This is parent's farmhouse");
	}
}

class Uncle extends Parent{
	
	public void gameZone() {
		System.out.println("Uncle's gamezone");
	}
}
