package com.java.Oct_29_Day18_this_keyword;

public class Program1 {
	
	//this keyword is also a reference variable which refers to the object
	
	int i;
	
	void setValues(int i) {
	   this.i=i; //when you are having the same naming convention for both instance and local variable and you equal them, compiler gets confused
	             //this keyword refers to the Current class instance variable
	             //alone this will refer to the object
	             //but if we write this.i then it refers to the instance variable as instance variables are part of the object itself
	}
	
	void show() {
		System.out.println(i);
	}

}
