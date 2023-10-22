package com.java.Oct_22_2023_OOPS_Abstraction_Interface_InJava_Day16;

public class Test_Execution extends SecretMoney implements Introduction, Conclusion{

	public static void main(String[] args) {
		
		//We cannot create the Object of Abstract Class
		//Interface is more abstract than Abstract Class. So, interface's object creation is impossible
		
	//	Introduction introduction = new Introduction();
	//	Conclusion conclusion = new Conclusion();
	//	SecretMoney sm = new SecretMoney();
		
		Introduction intro = new Test_Execution();   //use the Interface reference to refer to the Object of implementing Class
		
		//How is this concept used in Automation
		

	}

	@Override
	public void display() {
		
		
	}

	@Override
	public void display1() {
	
		
	}

	@Override
	public void display2() {
		
		
	}

	@Override
	public void display3() {
		
		
	}

	@Override
	public void tearDown() {
	
		
	}

	@Override
	public void tearDown1() {

		
	}

	@Override
	public void tearDown2() {

		
	}

	@Override
	public void blackMoney() {
	
		
	}

}
