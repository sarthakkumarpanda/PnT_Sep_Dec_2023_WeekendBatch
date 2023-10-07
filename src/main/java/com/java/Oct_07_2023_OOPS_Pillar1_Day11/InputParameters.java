package com.java.Oct_07_2023_OOPS_Pillar1_Day11;

public class InputParameters {

	//Create 5 methods with 2,3,4,5,6 input parameters
	//Two methods should be of String type, 1 should be of int type, 1 should be of boolean type, 1 should be mix
	//Create your own logic. Execute them by calling those methods inside main method
	public static void main(String[] args) {
		addingTwoIntegers(30, 70);
		check("Automation", 10, true);
		parametersFour("aaaa", "bbbb", "cccc", "dddd");
		healthyOrNot(true, true);
	}
	
	public static boolean healthyOrNot(boolean healthchecksession1, boolean healthchecksession2) {
		boolean healthcheckfinal = (healthchecksession1 == healthchecksession2);
		System.out.println("The health of the person is : " + healthcheckfinal);
		return healthcheckfinal;
	}
	
	public static int addingTwoIntegers(int i, int j) {
		int k = i+j;
		System.out.println(k);
		return k;	
	}
	
	public static String check(String S1, int i, boolean b1) {
		System.out.println(S1);
		return S1;	
	}
	
	public static String parametersFour(String S1, String S2, String S3, String S4) {
		String S5 = S1+S2+S3+S4;
		System.out.println(S5);
		return S5;
	}

}
