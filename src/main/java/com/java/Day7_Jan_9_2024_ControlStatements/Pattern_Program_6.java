package com.java.Day7_Jan_9_2024_ControlStatements;

public class Pattern_Program_6 {

	public static void main(String[] args) {

		// Pattern6
		for (int z = 1; z <= 5; z++) {
			for (int x = 1; x <= 1; x++) {
				System.out.print(" ");
			}
			for (int v = 5; v >= z; v--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}
}
