package com.java.Day7_Jan_9_2024_ControlStatements;

public class Pattern_Program_3 {

	public static void main(String[] args) {

		// Pattern3
		for (int a = 1; a <= 5; a++) {

			for (int b = 5; b >= a; b--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}
}
