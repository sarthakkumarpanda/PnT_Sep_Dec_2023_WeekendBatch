package com.java.Oct_29_Day18_super_keyword;

public class Child extends Parent{
	
	int a = 20;
	
	Child(){
		super();
	}


	
	void show(int a) {
		System.out.println(a); //30
		System.out.println(this.a);//20
		System.out.println(super.a); //10
		super.takeAway();
		
	}
	
	

	public static void main(String[] args) {
	Child child = new Child();
	child.show(30);
		
	}

}
