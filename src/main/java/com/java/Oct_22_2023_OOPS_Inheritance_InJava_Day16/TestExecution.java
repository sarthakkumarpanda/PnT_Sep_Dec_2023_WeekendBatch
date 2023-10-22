package com.java.Oct_22_2023_OOPS_Inheritance_InJava_Day16;

public class TestExecution {

	public static void main(String[] args) {
		//I will create the Object of the Child class
		
		Child child = new Child(); //30
		child.superBike();
		child.superCar();
		child.bankBalance();
		child.farmHouse();
		child.politicalOffice();
		child.creditUnion();
		

		
		
		Child2 child2 = new Child2(); //30
		child2.guitar();
		child2.bar();
		child2.bankBalance();
		child2.farmHouse();
		child2.politicalOffice();
		child2.creditUnion();
		
		
		//Create the Object of the Parent Class
		Parent parent = new Parent(); //30
		parent.bankBalance();
		parent.farmHouse();
		parent.creditUnion();
		parent.politicalOffice();
		
		
		

	}

}
