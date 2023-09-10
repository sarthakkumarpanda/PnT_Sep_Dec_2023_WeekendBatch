package com.java.Sep_10_2023_Day4_ControlStatements;

public class Control_Statements {
	
	public static void main(String[] args) {
		//ifControlStatement();
		//ifelseControlStatement();
		ifelseifControlStatement();
	}
	
	public static void ifControlStatement() {
		
		if(200>100) {
			System.out.println("My logic is correct");
		}
	}
	
	
	public static void ifelseControlStatement() {
		if(2 == 4) {
			System.out.println("My condition is true");
		}else {
			System.out.println("The above condition is dead code.");
		}
	}
	
	
	public static void ifelseifControlStatement() {
		int i=1;
		int j=2;
		int k=3;
		//I want to determine the largest of these 3 numbers
		if(i>j && i>k) {
			System.out.println("i is the largest");
		}else if(j>i && j>k) {
			System.out.println("j is the greatest");
		}else {
			System.out.println("k is the greatest :" + k);
		}
	}
}
