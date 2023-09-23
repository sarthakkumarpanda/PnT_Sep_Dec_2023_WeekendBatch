package com.java.Sep_23_Day7_LoopsInsideLoops;

public class ForLoopInsideWhileLoop {

	public static void main(String[] args) {
		int weeks = 3;
		int days = 7;
		int i = 1;
		
		//outer loop will be while loop
		
		while(i <= weeks) {
			System.out.println("Week : " + i);
			
			 //inner loop - will be a for loop
			for(int j=1 ; j<=days ; j++) {
				System.out.println("Days :" + j);
			}
			i++;
			
		}

	}

}
