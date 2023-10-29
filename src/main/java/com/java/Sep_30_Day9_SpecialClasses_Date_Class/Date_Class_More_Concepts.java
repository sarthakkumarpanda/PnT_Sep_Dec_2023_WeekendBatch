package com.java.Sep_30_Day9_SpecialClasses_Date_Class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Class_More_Concepts {

	public static SimpleDateFormat sdf;

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		String emailTimeStamp = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(emailTimeStamp);

		// you want a different date format ??
		// M/dd/yyyy
		// M/dd/yyyy hh:mm:ss

		sdf = new SimpleDateFormat("M/dd/yyyy");
		System.out.println(sdf.format(date));

		sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("MMMM/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("MMM/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("E, dd MMMM yyyy HH:mm:ss z");
		System.out.println(sdf.format(date));
	}

}
