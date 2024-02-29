package com.java.Day15_Feb_6_A_OOPs_Polymorphism;

public class D_School {
	
	
	//How to achieve Method Overriding ?
	//Criteria 1 - Method name should be the same
	//Criteria 2 - Class name will be different
	//Criteria 3 - Arguments will be the same
	//Criteria 4 - Inheritance has to be there
	
	public void education() {
		System.out.println("This is Parent class education method");
	}
	
	public void mandatoryFees(int i) {
		System.out.println("The fees per semester is:" + i);
	}

}
