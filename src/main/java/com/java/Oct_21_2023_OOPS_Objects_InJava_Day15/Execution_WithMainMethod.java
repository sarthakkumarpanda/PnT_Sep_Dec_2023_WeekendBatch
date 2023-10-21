package com.java.Oct_21_2023_OOPS_Objects_InJava_Day15;

public class Execution_WithMainMethod {

	public static void main(String[] args) {
		//You intend to execute the logic of Dependent Class
		
		Dependent_WithoutMainMethod.red();
		Dependent_WithoutMainMethod.blue();
		Dependent_WithoutMainMethod.green();
		Dependent_WithoutMainMethod.yellow();
		
		
		//Can I create the Object of another Class inside this Class ???? YES
		Dependent_WithoutMainMethod reference = new Dependent_WithoutMainMethod();
		reference.pink();
		reference.violet();
		
		
		Execution_WithMainMethod reference1 = new Execution_WithMainMethod();
		reference1.hello1();
		reference1.hello2();
		reference1.hello3();

	}
	
	
	public void hello1() {
		System.out.println("This is hello1 non static method inside execution class");
	}
	
	public void hello2() {
		System.out.println("This is hello2 non static method inside execution class");
	}
	
	
	public void hello3() {
		System.out.println("This is hello3 non static method inside execution class");
	}

}
