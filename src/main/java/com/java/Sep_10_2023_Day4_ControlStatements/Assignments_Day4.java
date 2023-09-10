package com.java.Sep_10_2023_Day4_ControlStatements;

public class Assignments_Day4 {

	public static void main(String[] args) {

		// findLargestBetweenFiveNumbers();
		determineWhetherThisNumberisEvenorOdd();

	}

	public static void findLargestBetweenFiveNumbers() {
		int i = 1;
		int j = 2;
		int k = 3;
		int l = 4;
		int m = 5;

		if (i > j && i > k && i > l && i > m) {
			System.out.println("i is the largest : " + i);
		} else if (j > i && j > k && j > l && j > m) {
			System.out.println("j is the largest : " + j);
		} else if (k > i && k > j && k > l && k > m) {
			System.out.println("k is the largest : " + k);
		} else if (l > i && l > j && l > k && l > m) {
			System.out.println("l is the largest : " + l);
		} else {
			System.out.println("m is the largest : " + m);
		}
	}

	public static void determineWhetherThisNumberisEvenorOdd() {
		int i = 101;
		int j = 100;
		int k = 200;

		if (i % i == 0 && i % 2 == 0) {
			System.out.println("i is even");
		} else {
			System.out.println("i is odd");
		}

		if (j % j == 0 && j % 2 == 0) {
			System.out.println("j is even");
		} else {
			System.out.println("j is odd");
		}

		if (k % k == 0 && k % 2 == 0) {
			System.out.println("k is even");
		} else {
			System.out.println("k is odd");
		}

	}

}
