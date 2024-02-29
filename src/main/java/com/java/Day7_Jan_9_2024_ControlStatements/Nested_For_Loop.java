package com.java.Day7_Jan_9_2024_ControlStatements;

public class Nested_For_Loop {
		//For 1 execution of outer loop - inner loop executes completely
	public static void main(String[] args) {
		//for(conditionofouterforloop) {
			//for(conditionofinnerforloop) {
				
			//}
		//}

		
		for(int i=1; i<=5; i++) {
			System.out.println("Outer for loop is :" + i);
			
			for(int j=1; j<=5; j++) { //1
										//2
										//3
										//4
										//5 after this it will go to outer for loop and do everything again here
										//5 times as much as show in j<=5
				System.out.println("The value of inner for loop is :" + j);
			}
			
		}
	}

}
