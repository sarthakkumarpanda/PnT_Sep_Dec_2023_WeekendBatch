package com.java.Nov_5_Day20_Collection_Framework;

import java.util.ArrayList;

public class Class_2_Arrays_vs_CollectionFramework {

	public static void main(String[] args) {
	

	}
	
	//Diff 1 - Arrays can store primitive and non-primitive type of Data but collection framework can only store non-primitive type of data(objects)
	public static void difference1() {
		int[] a = {1,2,3,4,5};
		
		Class_2_Arrays_vs_CollectionFramework obj1 = new Class_2_Arrays_vs_CollectionFramework();
		Class_2_Arrays_vs_CollectionFramework obj2 = new Class_2_Arrays_vs_CollectionFramework();
		Class_2_Arrays_vs_CollectionFramework obj3 = new Class_2_Arrays_vs_CollectionFramework();
		Class_2_Arrays_vs_CollectionFramework obj4 = new Class_2_Arrays_vs_CollectionFramework();
		Class_2_Arrays_vs_CollectionFramework obj5 = new Class_2_Arrays_vs_CollectionFramework();
		
		Class_2_Arrays_vs_CollectionFramework[] ref = { obj1, obj2, obj3, obj4, obj5 } ;
		
		
		
		ArrayList al = new ArrayList();
		al.add(10);  //10 is an Integer object
		al.add("Java");
		al.add('c');
		al.add(obj1);
		
	}
	
	//Diff 2 - Arrays can store only homogenous type of data excepting in some cases like int as it can be typecasted automatically but
	//         collection framework can store heterogeneous type of data
	
	public static void difference2() {
		int[] a = {1,2,3,4,5};
		int[] a1 = {1,2, 'c', 3, 4, 5};
		
		boolean[] b1 = {true, false, 1<2, 2>4};
		
		Class_2_Arrays_vs_CollectionFramework obj5 = new Class_2_Arrays_vs_CollectionFramework();
		
		ArrayList al = new ArrayList();
		al.add(10);  //10 is an Integer object
		al.add("Java");
		al.add('c');
		al.add(obj5);
		
		
	}
	
	//Diff 3 - Arrays size is fixed. We cannot increase/decrease size of array during runtime but we can increase/decrease the size of collection framework
	//         entities during runtime
	
	//Diff 4 - Arrays are inbuilt features of java, so algorithms have to developed by the developer but Collection framework is an API
	//         which means there are already pre-defined Classes and interfaces and methods inside the API. We can directly use it.

}
