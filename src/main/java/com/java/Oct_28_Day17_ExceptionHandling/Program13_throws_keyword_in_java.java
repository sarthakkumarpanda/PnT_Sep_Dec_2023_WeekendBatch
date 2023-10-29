package com.java.Oct_28_Day17_ExceptionHandling;

import java.io.FileInputStream;

public class Program13_throws_keyword_in_java {

	public static void main(String[] args) throws Exception {
		
		
		findingFile();

	}
	
	
	//throws keyword gives an indicator to the caller method that the method you are calling has an Exception and it could not handle it
	//so it is your job now to handle that Exception. You can use throws keyword or else surround that method with try-catch block
	
	
	public static void findingFile() throws Exception  {
		FileInputStream ip = new FileInputStream("C:\\Users\\sarth\\OneDrive\\Desktop\\abc.txt");
	}

}
