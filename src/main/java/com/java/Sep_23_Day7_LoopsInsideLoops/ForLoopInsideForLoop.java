package com.java.Sep_23_Day7_LoopsInsideLoops;

public class ForLoopInsideForLoop {
//nestedloops - if a loop exists inside the body of another loop then it is called nested loop
	
	public static void main(String[] args) {
		monthsAndDays();	

	}
	
	
	public static void statesAndCities() {
		int states = 50;
		int cities = 3;
	}
	
	public static void monthsAndDays() {
		int months = 12;
		int days = 30;
		
		//outer loop will print each month
		//inner loop will print the days of the month
		
		for(int i=1 ; i<=months ; i++) {
			System.out.println("Month is :" + i);
			
			for(int j=1 ; j<=days ; j++) {
				System.out.println("Day is :" + j);
				
			}
			
			System.out.println();
		}
		
	}
	
	
	
	public static void method1() {
	//outerloop - i is from 1 to 10 = 1,2,3,4,5,6,7,8,9,10
		
		for(int i=1; i<=10 ; i++) {
			
			//inner for loop - j is from 1 to 5 = 1,2,3,4,5
			for(int j=1 ; j<=5 ; j++) {
				System.out.print(j);
			}
			
			System.out.println(i);
		}
	}

}
