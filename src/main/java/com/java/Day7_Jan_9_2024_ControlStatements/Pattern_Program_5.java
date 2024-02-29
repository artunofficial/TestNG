package com.java.Day7_Jan_9_2024_ControlStatements;

public class Pattern_Program_5 {

	public static void main(String[] args) {

		// Pattern5 //EDIT THIS
		for(int i=1 ; i<=5 ; i++) {
			for(int j=4 ; j>=i ; j--) {
				System.out.print(" ");
			}
			for(int k=1 ; k<=i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

