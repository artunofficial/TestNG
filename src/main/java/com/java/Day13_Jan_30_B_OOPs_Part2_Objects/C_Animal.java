package com.java.Day13_Jan_30_B_OOPs_Part2_Objects;

public class C_Animal {

	//To understand the concept of Objects even better, you have to know 3 things
	
	//1. Declaration
	//2. Instantiation
	//3. Initialization
	
	String name = "Buzzo";
	String breed = "Labrador";
	int age = 3; //if the value is change
	static int no_of_paws = 4; //If its fixed we can use static 
	String color = "fawn";
	
	//How will I create Object of this class ?
	public static void main(String[] args) {
		//new classname();
	new C_Animal();
	new C_Animal();
	new C_Animal();
	
	C_Animal animal = new C_Animal();
	C_Animal animal1 = new C_Animal();
	
	//C_Animal is the class
	//animal is the reference of the class which is pointing to object
	//new Animal() is the object
	
	//The most important definition of an object
	//Object is the collection of all non-static entities of the Class
	
	
	}
}
