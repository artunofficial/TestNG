package com.java.Day15_Feb_6_B_OOPs_Inheritance;

public class B_Parent {
	//Criteria 1 - Method name should be the same
	//Criteria 2 - Class name will be different
	//Criteria 3 - Arguments will be the same
	//Criteria 4 - Inheritance has to be there
	
	public B_Parent(){
		System.out.println("This is the constructor of Parent class");
	}
	
	public void bankBalance() {
		System.out.println("Parent's bank balance");
	}
	
	public void fixedDeposits() {
		System.out.println("Parent's Fixed Deposit");
	}
}
