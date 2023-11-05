package com.java.Nov_5_Day20_Collection_Framework;

import java.util.ArrayList;
import java.util.HashSet;

public class Class_3_What_is_Collection_Framework {
	//Collection is a pre-defined interface
	//Collection (as a general understand in java) - is a single entity or an object which can store multiple data
	//framework - represents a library
	
	//Collection framework - it is a set of pre-fined Classes, Interfaces and methods which is used to store multiple data
	
	//it contains 2 main packages
	// java.util.Collection - we can store the data directly
	// java.util.Map - we store the data in key-value pair

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Selenium");
		al.add(true);
		al.add('c');
		
		
		HashSet hs = new HashSet();
		hs.add("Python");
		hs.add(false);
		hs.add(20);
		hs.add('d');
		
		//al and hs - both are Collection Objects which are storing objects in itself
		
		//What is the difference between the two Collection Objects?
		//Objects have different properties. Internally working principle is different. - This is the most important aspect in interviews
		
		

	}

}
