package com.java.Day17_Feb_13_A_OOPs_Encapsulation;

public class A_What_Is_Encapsulation {
	//Bundling of data and methods that operate on the data within a single unit [Class]
	//Hiding implementation details of a Class from outside access
	//Whatever acces you want to give - that is up to the developer
	
	//How do we achieve this in Java ?
	//1. All the instance variables - declare them as private. So what happens is these private members can only be accessed within the class
	//2. To allow outside entities access to the instance variables, public methods known as getters and setters are defined. These methods
	// are used to retrieve and modify the values of the instance variables.
	
	//What is the consqeuence of creating setters and getters methods ?
	//The class - it can enforce its own data validation rules
	
	//Advantages:
	
	//1. Data Hiding[Increasing Security]
	//2. Flexibility
	//3. Accessibility
	//4. Reusability
	//5. Testing code will become somewhat easier
}
