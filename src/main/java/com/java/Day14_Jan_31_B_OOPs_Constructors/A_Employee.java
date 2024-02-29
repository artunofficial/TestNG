package com.java.Day14_Jan_31_B_OOPs_Constructors;

public class A_Employee {
	//There are 2 employees
	
	String emp_name; //What is the default value of String in java ? Null
	int emp_id; //What is the default value of int in java ? 0
	//Object - collection of all non-static entities of the Class
	
	//This is the Constructor
	public A_Employee(String emp_name, int emp_id) {
		this.emp_name = emp_name;
		this.emp_id = emp_id;
		
	}
	

	public static void main(String[] args) {
		
		A_Employee emp1 = new A_Employee("Tom", 101);
//		emp1.emp_id = 101;
//		emp1.emp_name = "Tom"; - Instead of these we typed in the brackets
		System.out.println(emp1.emp_name + "-----" + emp1.emp_id);
		
		A_Employee emp2 = new A_Employee("John", 102);
//		emp2.emp_id = 102; 
//		emp2.emp_name = "John";
		System.out.println(emp2.emp_name + "----" + emp2.emp_id);
		
	}

}
