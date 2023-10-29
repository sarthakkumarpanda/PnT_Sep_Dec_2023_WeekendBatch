package com.java.Oct_28_Day17_SpecialClasses_Scanner_Class;

import java.util.Scanner;

public class Scanner_Calculator {

	public static void main(String[] args) {
		//I will give you two numbers
		//Add, Subtract, Multiple, Divide
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int number1 = scan.nextInt();
		
		System.out.println("Enter second number");
		int number2 = scan.nextInt();
		
		System.out.println("Select mathematical operation ( + , - , * , / )");
		String mathematicalOperation = scan.next();
		
		//How many valid cases are there ?? There are 4 which are +  -  *  /
		
		//Whatever mathematical operation you perform you will get a result. That result will be an integer
		
		int result;
		
		switch(mathematicalOperation) {
		
		case "+" : result = number1 + number2;
		System.out.println("The sum of two numbers is :" + result);
		break;
		
		case "-" : result = number1 - number2;
		System.out.println("The difference of two numbers is :" +result);
		break;
		
		case "*" : result = number1 * number2;
		System.out.println("The multiplication value of two numbers is :" +result);
		break;
		
		case "/" : result = number1/number2;
		System.out.println("The division value of two numbers is :" +result);
		break;
		
		default:System.out.println("Invalid mathamticalOperation");
		break;
		
		}

	}

}
