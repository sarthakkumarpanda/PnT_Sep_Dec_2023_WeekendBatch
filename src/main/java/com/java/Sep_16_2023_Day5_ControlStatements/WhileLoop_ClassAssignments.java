package com.java.Sep_16_2023_Day5_ControlStatements;

public class WhileLoop_ClassAssignments {

	public static void main(String[] args) {
		//print1to10();
		//print10to1();
		print1to10AndAdd1to10();
	    //print5to100InTheMultiplesOf5AndAddThoseMultiples();
		//print100to5InTheDecreasingMultiplesof5AndAddThoseMultiples();
		//print1to4andAdd();

	}
	
	
	public static void print1to10() {
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
	}
	
	public static void print10to1() {
		int i=10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}
	
	public static void print1to10AndAdd1to10() {
		int i=1;
		int sum = 0;
		while(i<=4) {
			System.out.println(i); 
			sum = sum+i; 
			i++; 	
		}
		System.out.println("the total sum of 1 to 4 is: " + sum); 
	}
	
	public static void print5to100InTheMultiplesOf5AndAddThoseMultiples() {	
		int i=5;
		int sum=0;
		while(i<=100) {
			System.out.println(i); //5
			sum = sum+i;
			i=i+5; 
			
		}
		System.out.println("The sum of the multiples are: " + sum);
		
	}
	
	public static void print100to5InTheDecreasingMultiplesof5AndAddThoseMultiples() {
		int i = 100;
		int sum = 0;
		while(i>=5) {
			System.out.println(i);
			sum = sum+i;
			i = i-5;		
		}
		System.out.println("the multiples' sum is: " + sum);
		
	}
	
	

}
