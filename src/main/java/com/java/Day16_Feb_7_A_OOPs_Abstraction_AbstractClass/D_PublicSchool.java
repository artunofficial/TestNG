package com.java.Day16_Feb_7_A_OOPs_Abstraction_AbstractClass;

public class D_PublicSchool extends C_Student {
	//Can a normal class extend Abstract Class
	//Can the School class which is an abstract act as a parent ? Yes
	
	//Now you are giving body or implementation to the unimplemented methods of the parent Abstract Class
	
	
	@Override
	public void studentMarksheet() {
		System.out.println("Student's Marksheet");
		
	}

	@Override
	public void StudentPlayground() {
		System.out.println("Student's playground");
		
	}
	
	//Can the child have its own methods ?
	//Yes
	
	public void hallAssembly() {
		
	}
	
	public void schoolCafeteria() {
		
	}
	
	

}
