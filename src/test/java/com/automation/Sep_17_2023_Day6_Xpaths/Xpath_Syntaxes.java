package com.automation.Sep_17_2023_Day6_Xpaths;

public class Xpath_Syntaxes {
	
	//Syntax 1:
	//html[@attribute = 'value']
	
	//Syntax 2:
	//html[@attribute1 = 'value1' and @attribute2 = 'value2']
	
	//Syntax 3:
	//html[@attribute1 = 'value1' or @attribute2 = 'value2']
	
	//use Syntax 2 and Syntax 3 when Syntax 1 does not return 1 of 1
	
	//Syntax 4: is mostly used for links
	//html[text() = 'valueofthetext']
	
	//Syntax 5: uses a keyword known as contains. This works for both links as well as other WebElements
	//html[contains(text(), 'contentofthetext')] - this is used for links
	
	//Syntax 6: 
	//html[contains(@attribute, 'value')]
	
	//Syntax 7:
	//html[starts-with(@attribute, 'startingvalue')]
	
	//Syntax 8:
	//html[ends-with(@attribute, 'endingvalue')]
	

	public static void main(String[] args) {
		

	}

}
