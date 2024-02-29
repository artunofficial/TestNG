package com.java.Day15_Feb_6_B_OOPs_Inheritance;

public class C_Child extends B_Parent { //Extends keyword establishes the Parent-Child relationship
	//Criteria 1 - Method name should be the same
	//Criteria 2 - Class name will be different
	//Criteria 3 - Arguments will be the same
	//Criteria 4 - Inheritance has to be there
	
	public C_Child() {
		super(); //This will invoke Parent Class constructor
		
		System.out.println("This is Child's class Constructor");
	}
	
	public void SuperCar() {
		System.out.println("This is child's super car");
	}
	
	public void guitar() {
		System.out.println("Child's Guitar");
	}
}
