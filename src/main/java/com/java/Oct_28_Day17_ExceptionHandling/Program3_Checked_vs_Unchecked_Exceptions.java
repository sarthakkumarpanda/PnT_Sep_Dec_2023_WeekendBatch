package com.java.Oct_28_Day17_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Program3_Checked_vs_Unchecked_Exceptions {
	
	//what are CompileTime Exceptions and what are RunTime Exceptions?
	
	//Exceptions always occur at Runtime. Exceptions never occur at CompileTime
	
	//CompileTime(Checked) Exceptions are the exceptions which can be handled or warned by the Compiler at Compile Time
	//RunTime(unChecked) Exceptions are the exceptions which cannot be handled by the compiler at Compile Time

	public static void main(String[] args) {
		arithmeticExceptionValidation();
		
		classNotFoundExceptionValidation();
		fileNotFoundExceptionValidation();

	}
	
	
	public static void fileNotFoundExceptionValidation() {
		//my intention is to handle a particular file in my laptop
		
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\sarth\\OneDrive\\Desktop\\abc.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void classNotFoundExceptionValidation() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void arithmeticExceptionValidation() {
		int a=10, b=0;
		int c=a/b; //here lies the exception.... Is compiler giving you a warning ??? This is an example of Runtime Exception
		System.out.println(c);
		
	}

}
