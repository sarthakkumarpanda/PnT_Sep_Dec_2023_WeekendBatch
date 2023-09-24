package com.java.Sep_24_Day8_Arrays;

public class Introduction {
	//What is an Array?
	//Array is an object that holds a fixed number of values of homogeneous or similar data type
	//Array is a a data structure in which we store similar elements
	//Length of the array is decided/determined at the time of creation and once created, remains fixed.
	//indexing position of an array starts with zero
	
	//What are the features of Array?
	//indexing starts from zero
	//any java array variable can be declared like other variables with a dimension []
	//all the variables in the array are ordered.
	//since arrays are objects, they occupy memory space
	//direct Super Class of an Array is Object Class
	//Object Class is the parent of all Classes in java
	//arrays are always created at runtime
	//length of an array can be determined my using the member length
	//the elements of an array are stored in consecutive memory locations
	
	//Advantages of Array?
	//store multiple data items using a single name
	//we can access any element randomly by using indexes
	//arrays can be used to implement other data structures like LinkedLists, Stacks, Queues, Graphs, Trees, etc
	//primitve data types to Wrapper Class Objects will not happen in case of arrays. Hence they are faster in operation
	
	//Disadvantagesd of Array?
	//Fixed size
	//Memory wastage
	//Strongly typed
	//Arrays do not have any add or remove methods
	//Reduce performance
	
	//What kind of arrays should we learn?
	//1-Dimensional Array
	//2-Dimensional Array
	//3-Dimensional Array
	//Jagged Array
	//Object Array
	
	

	// you are working in a school/University
	// your job is to manage the student data
	// total number of students are close to 10000

	int student_id1 = 1;
	int student_id2 = 2;
	
	
	int student_id10000 = 10000;
	
	public static void main(String[] args) {
		int[] student_id = new int[10000];
	}

}
