package com.java.Sep_9_2023_Day3_BasicsOfJava;

public class Concatenation_Joining {

	public static void main(String[] args) {
		//  +  symbol represents concatenation or joining
		
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		String S1 = "Hello";
		String S2 = "World";
		System.out.println(a+b+S1+S2);
		
		System.out.println(S1+a+b+S2);
		//S1 + a = Hello10
		//S1+a+b = Hello10 + 20 = Hello1020
		//Hello1020 + World = Hello1020World
		
		String assignment = "ThisyeartherewasverylesssnowinVirginia";
		//This year there was very less snow in Virginia
		
		System.out.println("This" + " " + "year" + " " + "there" + " " + "was" + " " + "very" + " " + "less" + " " + "snow" + " " + "in" + " " + "Virginia");
		
		
	

	}

}
