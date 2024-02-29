package com.java.Day20_Feb_21_A_OOPs_Exception_Handling;

public class H_Throw_Keyword {
	
	public static void main(String[] args) { //main method is acting as the caller method
		divideByZero();
		System.out.println("The Grass is green");
	}

	public static void divideByZero() { //is the origin of the Excepte
		int a=100, b=0, c;
		c=a/b;
		System.out.println(c);
		
		throw new ArithmeticException("I am trying to handle this exception by self"); //Throw statement must be last statement inside to method
	} //any statement after the Throw statement would not run
}
