package com.TestNG.Oct_14_Day13_TestNG_Repeat;

import org.testng.annotations.Test;

public class Assertions_Basic_Concepts {
	
	//Assert a WebPage at how many levels ??
	//getTitle()
	//getCurrentUrl()
	//getPageSource()
	
	//Assert a WebElement ??
	//isEnabled()
	//isDisplayed()
	//isSelected()
	
	
	@Test
	public void mathematics() {
		System.out.println("Begin"); //this is fine
		System.out.println(2+3);      //this is fine
		System.out.println(5/0); //there is an arithmetic exception
		System.out.println("End");
	}

}
