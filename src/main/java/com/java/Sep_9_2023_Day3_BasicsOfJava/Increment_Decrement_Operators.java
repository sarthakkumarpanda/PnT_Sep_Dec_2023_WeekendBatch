package com.java.Sep_9_2023_Day3_BasicsOfJava;

public class Increment_Decrement_Operators {

	public static void main(String[] args) {
		//    ++          means +1
		//    --          means -1
		
		//post increment operator
		//pre increment operator
		
		//post decrement operator
		//pre decrement operator
		
		
		int a = 1;
		
		a++;          //this is post increment operator. after the variable ++ is used
		++a;          //this is pre increment operator, before the variable ++ is used
		a--;
		--a;
		
		
		/*
		 * int i = 1; //latest value of i is 1 int j = i++; //here latest value of j is
		 * 1
		 * 
		 * System.out.println(j); //1 System.out.println(i); //2
		 */	
		
		/*
		 * int i=1; int j = ++i;
		 * 
		 * System.out.println(j); System.out.println(i);
		 */
		
		int i=1;      //latest value of i is 1
		int j= i++ + ++i;
		
		// j = 1   + 3 = 4
		//  i = 2, 3
		
		System.out.println(i);
		System.out.println(j);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
