package com.java.Day7_Jan_9_2024_ControlStatements;

public class Control_Statements_Continued {

	//There are 3 types of control statements in Java
	
	//1. Selection or Conditional Statement
	//Examples - if, if else, if else if, switch
	
	//2. Iteration or Looping Statement
	//Examples - while, for, for each (advanced for loop), do while
	
	//3. Jump Statement
	//Examples - break, continue, return
	
	public static void main(String[] args) {
	//nested if - means if block inside if block
		//if condition is true it will go inside, if condition is false it will not go inside the block
		if(2 == 2) {
			if(1 == 1) {
				System.out.println("This innter if block logis is correct");
			}
			System.out.println("This is the body of the outer if block");
		}
	}
}
