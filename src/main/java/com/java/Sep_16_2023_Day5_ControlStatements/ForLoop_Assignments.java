package com.java.Sep_16_2023_Day5_ControlStatements;

public class ForLoop_Assignments {

	public static void main(String[] args) {
		//print1to100();
		//print100to1();
		//print5to495InMultiplesof10AndAddTheMultiples();
		printFirst20multiplesOf9andAddthoseMultiples();

	}

	public static void print1to100() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}

	}
	
	public static void print100to1() {
		int sum = 0;
		for (int i=100 ; i>=1 ; i--) {
			System.out.println(i + " ");
			sum = sum+i;
		}
		System.out.println("sum from 100 to 1 is : " + sum);
	}
	
	
	public static void print5to495InMultiplesof10AndAddTheMultiples() {
		int sum=0;
		for(int i=5 ; i<=495 ; i=i+10) {
			System.out.println(i);
			sum = sum+i;
		}
		System.out.println("the sum is : " + sum);
	}
	
	
	public static void printFirst20multiplesOf9andAddthoseMultiples() {
		
	}

	

}
