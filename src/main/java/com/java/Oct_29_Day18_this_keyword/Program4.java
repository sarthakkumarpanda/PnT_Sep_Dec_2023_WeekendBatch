package com.java.Oct_29_Day18_this_keyword;

public class Program4 {
	//Use 2 - this keyword can be used to invoke current class method(implicitly)
	
	
	void display() {
		System.out.println("hello");
	}
	
	void show() {
		this.display(); 
		//even if you do not use this keyword, compiler automatically adds this keyword while invoking the method
		//hence this.display() or display() will work the same
	}
	

	public static void main(String[] args) {
		Program4 prog = new Program4();
		prog.show();

	}

}
