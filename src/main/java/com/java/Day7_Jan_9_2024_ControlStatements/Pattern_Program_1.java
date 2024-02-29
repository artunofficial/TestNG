package com.java.Day7_Jan_9_2024_ControlStatements;

public class Pattern_Program_1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		System.out.println("*************************************************");

		// Christmas Tree Pattern
		for (int k = 1; k <= 5; k++) {
			for (int j = 4; j >= k; j--) {
				System.out.print(" ");
			}
			for (int l = 1; l <= k; l++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}
