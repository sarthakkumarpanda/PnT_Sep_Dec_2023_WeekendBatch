package com.java.Sep_30_Day9_Strings;

public class String_Final {

	public static void main(String[] args) {
		
		final int i = 10;
		System.out.println(i);
		
		String S1 = new String("Orange");
		S1.concat("Apple");
		System.out.println(S1); //Output ??
		
		S1 = S1.concat("Apple");
		System.out.println(S1);

	}

}
