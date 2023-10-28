package com.java.Oct_28_Day17_SpecialClasses;

import java.util.Scanner;

public class Scanner_Concept {
	//Scanner class is a pre-define class in Java under java.util package
	//Use of Scanner Class - It helps to acknowledge user input
	//Scanner class has a lot of inbuilt methods - next(), nextInt(), nextLong()

	public static void main(String[] args) {
		
		//Create the Object of Scanner Class and you have to pass the System.in as the input parameter inside the Constructor
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = scan.next();
		
		System.out.println("Enter gender");
		//M or F - one entity means you can store it as a character
		char gender = scan.next().charAt(0);
		
		
		System.out.println("Enter age");
		int age = scan.nextInt();
		
		System.out.println("Enter phone number");
		long phoneNumber = scan.nextLong();
		
		System.out.println("The name of the person is: " + name);
		System.out.println("The age of the person is: " +  age);
		System.out.println("The gender of the person is: " + gender);
		System.out.println("The phonenumber of the person is: " + phoneNumber);
		
	

	}

}
