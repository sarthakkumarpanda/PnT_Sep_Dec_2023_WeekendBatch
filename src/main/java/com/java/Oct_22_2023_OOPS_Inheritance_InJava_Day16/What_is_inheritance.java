package com.java.Oct_22_2023_OOPS_Inheritance_InJava_Day16;

public class What_is_inheritance {
	
//Inheritance is inheriting the properties of parent class into child class
//Inheritance in java is a mechanism in which one object(child) acquires all the properties and behaviors of a parent object
	//Inheritance represents the IS-A relationship which is also known as parent-child relationship
//  for example:
	//Dog IS-A Animal
	//Car IS-A Vehicle
	//Surgeon IS-A Doctor
		
//What are the advantages of inheritance?
//1. Code reusability
//2. It promotes runtime polymorphism by allowing method overriding
	
//Disadvantages
//1. The parent and child classes get tightly coupled
	
//Inheritance is achieved by using the 'extends' keyword
	
//What do not take part in inheritance?
//1. Constructors
//   A child class can inherit all the members(fields, methods, nested classes) from its parent class. Constructors are not members, so they
//   cannot be inherited by the child class. But the constructor of the parent class can be invoked from the child Class

//2. Private members
//   A child class does not inherit the private members of its parent Class. However if the parent class has public or protected methods (like getters
//   and setters) for accessing its private fields, these can be used by the Child Class
	
//Note: There can be only one parent class because java does not support multiple inheritance
//      Parent class is also known as super class and Child class is also known as sub class
	
	
//Types on inheritance in java
// 1. Single inheritance - One Child class extends one parent class
// 2. Multilevel inheritance - Grandparent is the parent of ParentClass and Parent Class is the parent of Child Class. So Child class extends GrandParent indirectly
// 3. Heirarchical inheritance - one parent class is inherited by multiple Child classes

}
