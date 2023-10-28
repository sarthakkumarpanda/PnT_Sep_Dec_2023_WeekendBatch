package com.java.Oct_28_Day17_ExceptionHandling;

public class Program7_finally_block {

	// finally block will execute no matter Exception occurs or not
	// you can execute finally block with only try block. You can choose not to use
	// catch block but again if exception is there it will not be handled
	// only finally block is not possible

	public static void main(String[] args) {
		
		case3();
		case2(); // there is no exception. Code is clean. Will finally block be executed ? YES

		case1(); // there was exception

	}

	public static void case1() {

		try {
			int a = 10, b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("No matter what this will be printed");
		}
	}

	public static void case2() {
		try {
			int a=10, b=2;
			int c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("No matter what this will be printed");
		}	
		
	}
	
	public static void case3() {
		
		try {
			int a = 10, b = 0;
			int c = a / b;
			System.out.println(c);
		} finally {
			System.out.println("No matter what this will be printed");
		}
	}

}
