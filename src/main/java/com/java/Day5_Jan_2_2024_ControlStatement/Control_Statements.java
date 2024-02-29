package com.java.Day5_Jan_2_2024_ControlStatement;

public class Control_Statements {

	//There are 3 types of control statements in Java
	
	//1. Selection or Conditional Statement
	//Examples - if, if else, if else if, switch
	
	//2. Iteration or Looping Statement
	//Examples - while, for, for each (advanced for loop), do while
	
	//3. Jump Statement
	//Examples - break, continue, return
	
	public static void main(String[] args) {
		//learningifstatement();
		greatestof3numbers();
		smallestof4numbers();
		determineLeapYear();
		CheckingWithStrings();
		CheckingWithStrings1();
	}
	
	public static void learningifstatement() {
		//syntax
		//applcation of the syntax
		//sense of the logic
		
		if(2 > 3) {
			System.out.println("The if condition is true");
		}else {
			System.out.println("The if condition was stupid");
		}
	}
	
	//there are 3 numbers 21, 31, 41. How will you determine using if else logic to prove 41 is the greatest
	
	public static void greatestof3numbers() {
		int a = 21;
		int b = 31;
		int c = 41;
		
		if(a>b && a>c) {
			System.out.println("a is the greatest : " + a);
		}else if(b>a && b>c) {
			System.out.println("b is the greatest : " + b);
		}else {
			System.out.println("c is the greatest : " + c);
		}
	}
	
	public static void smallestof4numbers() {
		int d = 2;
		int e = 5;
		int f = 7;
		int g = 9;
		
		if(d<e && d<f && d<g) {
			System.out.println("d is a smallest : " + d);
		}else if(e<d && e<f && e<g) {
			System.out.println("e is a smallest " + e);
		}else if(f<d && f<e && f<g) {
			System.out.println("f is a smallestt " + f);
		}else {
			System.out.println("g is the smalles : " + g);
		}
	}
	
	public static void determineLeapYear() {
		int year1 = 1996;
		int year2 = 2002;
		int year3 = 2004;
		
		//divided by 4
		if(year1 % 4 == 0) {
			System.out.println("Year1 is a leap year");
		}else {
			System.out.println("Year1 is not a leap year");
		}
		
		if(year2 % 4 == 0) {
			System.out.println("Year2 is a leap year");
		}else {
			System.out.println("Year2 is not a leap year");
		}
	}
	
		public static void CheckingWithStrings() {
			String S1 = "Hello";
			String S2 = "World";
			
			
			String S3 = "Hello";
			String S4 = "Java";
			
			//compare the different strings using if else
			
			if(S1 != S2) {
				System.out.println("both strings are not equal");
			}else {
				System.out.println("strings are equal");
			}
		
	}
	
		public static void CheckingWithStrings1() {
			String S5 = "Hello";
			String S6 = "World";
			String S7 = "Hello";
			String S8 = "Java";
			
			//compare the different strings using if else
			
			if(S5 == S6) {
				System.out.println("S5 and S6 are equal");
			}else {
				System.out.println("S5 and S6 are not equal");
			}
		}
}
