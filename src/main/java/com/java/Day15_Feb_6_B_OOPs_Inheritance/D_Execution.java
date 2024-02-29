package com.java.Day15_Feb_6_B_OOPs_Inheritance;

public class D_Execution {

	public static void main(String[] args) {
		
		//Create the Object of the Child Class here
		
		C_Child child = new C_Child();
		child.guitar();
		child.SuperCar();
		child.bankBalance();
		child.fixedDeposits();
		
		//Can the parent inherit child's class properties?
		//NO
		
		B_Parent parent = new B_Parent();
		parent.bankBalance();
		parent.fixedDeposits();
	

	}

}
