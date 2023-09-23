package com.java.Sep_23_Day7_PatternProgramming;

public class StarPatterns {

	public static void main(String[] args) {

		pattern1();
		System.out.println();
		pattern2();
		System.out.println();
		pattern3();

	}

	public static void pattern1() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();

		}

	}

	public static void pattern2() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void pattern3() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();

		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
