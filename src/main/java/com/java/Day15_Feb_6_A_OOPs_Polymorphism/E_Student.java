package com.java.Day15_Feb_6_A_OOPs_Polymorphism;

public class E_Student extends D_School{
	//How to achieve Method Overriding ?
	//Criteria 1 - Method name should be the same
	//Criteria 2 - Class name will be different
	//Criteria 3 - Arguments will be the same
	//Criteria 4 - Inheritance has to be there
	
	public static void main(String[] args) {
		//Method Overriding means Child Class method is taking precedence over the Parent class method
		E_Student student = new E_Student();
		student.playSports();
		student.education();
		student.mandatoryFees(100);
		
		D_School school = new D_School();
		school.education();
		school.mandatoryFees(1000);
		
		
	}
	
	//Access modifier of overriden method in child class should be equivalent or higherthan the parent Class method
	
	public void playSports() {
		System.out.println("Student can select alloted sports in the school");
	}
	
	public void education() {
		System.out.println("This education method child is overriding from the parent");
	}
	
	public void mandatoryFees(int i) {
		System.out.println("The fees per student per semester is :" + i);
	}
}
