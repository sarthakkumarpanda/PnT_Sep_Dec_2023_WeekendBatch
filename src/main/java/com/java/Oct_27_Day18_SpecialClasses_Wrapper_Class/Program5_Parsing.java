package com.java.Oct_27_Day18_SpecialClasses_Wrapper_Class;

public class Program5_Parsing {

	// Parsing means converting a String representation of a value into its
	// corresponding data type

	public static void main(String[] args) {
		stringToInteger();
		stringToDouble();
		stringToBoolean();
		stringToLong();
	}

	// Integer Parsing
	public static void stringToInteger() {
		String price1 = "450";
		String price2 = "250";
		
		//Total price ??
		//System.out.println(price1 + price2);
		
		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		System.out.println(p1+p2);
	}

	// Double Parsing
	public static void stringToDouble() {
		String price1 = "10.25";
		String price2 = "4.75";
		
		double p1 = Double.parseDouble(price1);
		double p2 = Double.parseDouble(price2);
		
		System.out.println(p1 + p2);
	}

	// Boolean Parsing
	public static void stringToBoolean() {
		String result1 = "true";
		String result2 = "false";
		
		boolean b1 = Boolean.parseBoolean(result1);
		boolean b2 = Boolean.parseBoolean(result2);
		
		System.out.println(b1 == b2);
		
	}

	// Character Parsing
	public static void stringToCharacter() {
		

		
	}

	// Long Parsing
	public static void stringToLong() {
		String S1 = "9876543210";
		String S2 = "9876543210";
		long l1 = Long.parseLong(S1);
		long l2 = Long.parseLong(S2);
		System.out.println(l1 + l2);
		
		
	}

}
