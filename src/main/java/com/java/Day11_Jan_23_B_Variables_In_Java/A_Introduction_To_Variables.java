package com.java.Day11_Jan_23_B_Variables_In_Java;

public class A_Introduction_To_Variables {
	
		//There are 3 types of variables in Java
	
		//Generally instance and static variables are also called Class Variables or Global Variables but it is not wise to call them Global
			
			//1. Instance Variables
			//2. Static Variables
			//3. Local Variables

	int age = 10; //this is knows as an instance variable
	static String name = "John"; //name is static variable
	
	
	public static void main(String[] args) {
		
	}

	public static void logic1(String S1, String S2) {
		int x;
		int y; 
		//x and y are local variables. They are local only to logic1() method
		//Their scope lies within the logic(1) method
		//S1 and S2 are also variables
		
		//can we make a local variable static?
		//static int z = 23; //local variables cannot be associated with static keyword
		
		//by default local variables are non-static ?
		//NO... local variables are neither static or non-static
	}
}
