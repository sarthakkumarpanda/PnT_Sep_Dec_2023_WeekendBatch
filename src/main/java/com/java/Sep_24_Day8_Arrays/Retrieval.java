package com.java.Sep_24_Day8_Arrays;

public class Retrieval {

	public static void main(String[] args) {
		 int[] a = {10, 20, 30, 40, 50};
		 
		 //retrieve all the elements of this array
		 System.out.println(a.length);
		 System.out.println(a[2]);
		 
		 for(int i=0 ; i<a.length ; i++) {
			 System.out.print(a[i] + " ");
		 }
		 
System.out.println("***********************************************");		 
		 
		 int[][] b = { {21, 31, 41, 51},
			           {61, 71, 81, 91},
			           {101, 111, 121, 131} };
		 
		 for(int i=0 ; i<b.length ; i++) {
			  for (int j=0 ; j<b[i].length ; j++) {
				  System.out.print(b[i][j] + " ");
			  }
			  System.out.println();
		 }

	}

}
