package com.TestNG.Oct_08_Day12_TestNG_Repeat;

public class Understanding_TestNG {
	
	//What is TestNG
	//TestNG full form is Test New Generation
	
	//Why was TestNG introduced?
	//Selenium does not support Test Reporting. Earlier it used JUnit but Junit is not good for reporting
	//Mostly Junit was used by developers
	
	//What exactly TestNG does?
	//1. It is an Execution engine. That means when you are using TestNG in java language you do not need main method
	//2. It is a reporting system. So TestNG when integrated with Selenium organizes professional Test Reports
	//3. It is a framework in itself. So you can organize your complete Project using TestNG
	
	//What are the topics you need to cover to understand TestNG?
	//1. Installation of TestNG - https://testng.org/doc/download.html and then copy https://testng.org/testng-eclipse-update-site            
	//2. Add TestNG library to your Maven Project
	//3. You need to add TestNG dependency in your pom.xml file
	//4. The meaning of <scope> test </scope> and we can replace test with compile in case you want it to execute everywhere
	//5. Whenever you create a Class in which you want to use TestNG, do not introduce main method in it
	//6. Understanding and memorizing all annotations of TestNG
	//7. You cannot just write the annotation and try to import it. It will give you error.
	//8. Every annotation has to be followed up by creation of a method. Preferably choose non-static method

}
