package com.java.Nov_5_Day20_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class_6_List_Interface {

	public static void main(String[] args) {
	//List interface is the child of Collection interface
    //List stores data in an indexing fashion or index based data structure
    //List has the following implementing Classes - ArrayList, LinkedList, Vector, Stack
		
		List list = new ArrayList();
		list.add("Hello");
		list.add("World");
		list.add("World");
		list.add("World");
		list.add("World");
		list.add("World");
		
		//Traversing list through Iterator
		
	  Iterator it = list.iterator();
	  while(it.hasNext()) {
		  System.out.println(it.next());
	  }

	}

}
