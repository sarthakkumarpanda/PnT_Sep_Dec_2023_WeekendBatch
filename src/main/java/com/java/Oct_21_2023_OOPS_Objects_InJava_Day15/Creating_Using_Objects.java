package com.java.Oct_21_2023_OOPS_Objects_InJava_Day15;

public class Creating_Using_Objects {
	
	//name of the Class is Creating_Using_Objects
	
	//What is an Object ?
	//Instance of a Class
	
	String name;
	int rollNumber;
	boolean promotion;
	
	public static void main(String[] args) {
	
	Creating_Using_Objects reference = new Creating_Using_Objects();
	
	//How many Objects of this Creating_Using_Objects Class can we create ?
	//Innumerable
	
	Creating_Using_Objects reference1 = new Creating_Using_Objects();
	Creating_Using_Objects reference2 = new Creating_Using_Objects();
	Creating_Using_Objects reference3 = new Creating_Using_Objects();
	
	
	//Java definition : Object is collection of all non-static entities of the Class

	logic2();
	reference.logic1();
	reference.logic3();
	reference.name = "John";
	reference.rollNumber = 101;
	reference.promotion = true;
	
	reference.logic2(); //Will it work??? Yes it will work
	//We can also use the Object reference to call static entities of the Class
	//But is it recommended??? No.... Because static entities can be called directly or with the help of Class name. You do not need to use object reference
	
	
	}
	
	
	public void logic1() {          //this is non-static entity
		System.out.println("The grass is green");
	}
	
	
	public static int logic2() {          //this is a static entity
		System.out.println("This is logic2 static method");
		int i = 10;
		int j = 20;
		int k = i + j;
		System.out.println(k);
		return k;
	}
	
	public void logic3() {          //this is non-static entity
		
	}
	

}
