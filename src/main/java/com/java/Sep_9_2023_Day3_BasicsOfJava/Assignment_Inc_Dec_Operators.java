package com.java.Sep_9_2023_Day3_BasicsOfJava;

public class Assignment_Inc_Dec_Operators {

	public static void main(String[] args) {
		
	int i = 10; // latest value of i is 10
	int j = i--;
	  // j = 10 //latest value of j is 10
	//   i = 9; //latest value of i is 9   
	
	int k = --i + j++;
	//k  = 8    + 10 = latest value of k is 18
	// i  = 8          latest value of i is 8
	//j            11   latest value of j is 11
	
	int l = i-- - --k - --j + j++;
	//  l = 8   - 17  - 10  + 10 = -9
	//  i = 7,                   = 7
	// k  =       17             = 17
	// j  =              10,   11 = 11
	
	System.out.println(i); //7
	System.out.println(j);// 11
	System.out.println(k);// 17
	System.out.println(l);//-9

	}

}
