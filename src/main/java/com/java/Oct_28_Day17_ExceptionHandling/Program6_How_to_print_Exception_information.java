package com.java.Oct_28_Day17_ExceptionHandling;

public class Program6_How_to_print_Exception_information {

	public static void main(String[] args) {
		
		
		try {
			int a=10, b=0;
			int c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace(); //this will print Exception Name, description and stack trace
			System.out.println(e); //this will print Exception Name and description but it will not print stack trace
			System.out.println(e.toString());//this will print Exception Name and description but it will not print stack trace
			System.out.println(e.getMessage()); //this will only print description
		}

	}

}
