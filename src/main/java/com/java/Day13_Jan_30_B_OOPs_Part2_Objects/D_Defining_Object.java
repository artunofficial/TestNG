package com.java.Day13_Jan_30_B_OOPs_Part2_Objects;

public class D_Defining_Object {
	//Object is collection of all non static entities of the Class
	
	String name;
	int age;
	static int no_of_paws;
	String color;
	public static void main(String[] args) {
		
		//You can call a static entity directly or with the help of the ClassName
		//if you want to call a non-static entity you have to create the object
		
		D_Defining_Object.checkBehavior();
		
		D_Defining_Object defo = new D_Defining_Object();
						defo.checkBehavior();
						defo.sleepingTechniques();
		
	}
	
	public static void checkBehavior() {
		System.out.println("Labradors are Docile");
	}

	public void Labradors() {
		System.out.println("Labradors are fast runners and fast swimmers");
	}
	
	public void sleepingTechniques() {
		System.out.println("Labradors sleep in weird poses");
	}
}
