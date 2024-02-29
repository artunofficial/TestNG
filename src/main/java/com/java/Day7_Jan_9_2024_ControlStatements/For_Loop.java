package com.java.Day7_Jan_9_2024_ControlStatements;

public class For_Loop {

	public static void main(String[] args) {
		//What is the looping statement ?
		//if the same block executes multiple number of times as per the logic 
		//extremely important
		
		//for(initialization ; condition ; increment/decrement) {
				//body
		//	}
		
		//Logic Sequencing Of For LOOP
		//Step 1: Initialization
		//Step 2: Condition
		//Step 3: If condition is true, go inside the body of the for loop
		//Step 4: Increment/Decrement
		//Step 5: Check for the condition again
		
		for(int i=1; i<=5 ; i++) {
			System.out.println(i); //1, 2, 3, 4, 5
		}
		System.out.println("*************************************************");
		
		for(int i=10 ; i>=1 ; i--) {
			System.out.println(i + "");
		}
		System.out.println("*************************************************");
		
		for(int i=2 ; i<=10 ; i++) {
			System.out.println(2*i + " ");
		
		}
		//What if there is no end point write to logic and still get the code
		
		System.out.println("*************************************************");
		
		int sum = 0;
		for(int i=1 ; i<=50 ; i++) {
			System.out.println(i + " ");
			sum = sum + i;
			
		System.out.println(i);
		System.out.println(sum);
					
		}
		
	}

}
