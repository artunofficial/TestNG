package com.java.Day21_Feb_27_A_Scanner;

import java.util.Scanner;

public class A_Scanner_Concept {
	
	//Scanner class is a pre-defined class used to take user input while execution happens
	//java.util package
	//Scanner class has a lot of built in methods - next(), nextInt(), nextLong() and you can also do method chaining

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //here in represents input
		
		//String
		System.out.println("Enter the name");
		String name = scan.next();
		
		//Gender - M or you can F or male or female. Let's go with char
		System.out.println("Enter the gender");
		char gender = scan.next().charAt(0);
		
		//Age -Store as in
		System.out.println("Enter the age");
		int age = scan.nextInt();
		
		//Phone number - 9876543210
		System.out.println("Enter the contact number");
		long phoneNumber = scan.nextLong();
		
		System.out.println("The name of the person is : " + name);
		System.out.println("The gender of the person is : " + gender);
		System.out.println("The age of the person is : " + age);
		System.out.println("The contact number of the person is : " + phoneNumber);
		
	}
}
