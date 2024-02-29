package com.java.Day7_Jan_9_2024_ControlStatements;

public class Pattern_Program_4 {

	public static void main(String[] args) {

		// Pattern4
		for (int k = 1; k <= 5; k++) {

			for (int l = 1; l <= k; l++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		for (int a = 1; a <= 5; a++) {

			for (int b = 4; b >= a; b--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}
}
