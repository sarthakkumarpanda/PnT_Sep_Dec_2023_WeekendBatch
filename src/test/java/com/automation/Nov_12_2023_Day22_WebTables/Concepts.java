package com.automation.Nov_12_2023_Day22_WebTables;

public class Concepts {
	
	//How to identify a webtable in DOM
	//Webtables are dynamic in nature
	
	//Webtable will have a specific id or class
	//thead
	//tbody
	
	//Having good xpath knowledge is very imp
	
	//table[@class = 'dataTable'] - this represents the whole WebTable
	//table[@class = 'dataTable']/thead - this represents the head of the WebTable
	//table[@class = 'dataTable']/thead/tr - this represents the header row of the WebTable
	//table[@class = 'dataTable']/thead/tr/th - this represents all the cols of the header row
	//table[@class = 'dataTable']/thead/tr/th[1] - this represents the 1st col of the header row
	//table[@class = 'dataTable']/thead/tr/th[2] - this represents the 2nd col of the header row
	//
	//
	//table[@class = 'dataTable']/thead/tr/th[5] - this represents the 5th col of the header row
	
	//table[@class = 'dataTable']/tbody - represents the body of the webtable without the header row
	//table[@class = 'dataTable']/tbody/tr - represents all rows of the body of the Webtable
	//table[@class = 'dataTable']/tbody/tr[1] - represents the first row of the body of the WebTable
	//table[@class = 'dataTable']/tbody/tr/td - represents all the cols of all the rows of the body of the WebTable
	//table[@class = 'dataTable']/tbody/tr[1]/td - represents all the cols of the first row of the Webtable
	//table[@class = 'dataTable']/tbody/tr[1]/td[1] - represents the 1st col of the 1st row of the WebTable
	//table[@class = 'dataTable']/tbody/tr/td[1] - represents all values in the 1st col
	//table[@class = 'dataTable']/tbody/tr/td[4] - represents all values in the 4th col

}
