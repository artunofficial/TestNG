package com.java.Day4_Dec_27_2023_LearningBasicsOfJava;

public class Inc_Dec_Operators_Examples5 {

	public static void main(String[] args) {
		
		int i = 10; // latest value of i is 10
		
		int j = i-- - i++ + ++i;
		//how many variable - j and i
		// equation j = 10 - 9 + 10 = 11
		// position of i = 9, 10, 11 = i is 11

		int k = --i + --j - j-- + i++ + --i;
		// equation k = 10 + 10 - 11 + 11 + 10 = 30 is k
		// position of j = 10
		// position of i = 10
		
		
		int l = i++ + j++ + ++k - --k + k--;
		// equation l = 10 + 10 + 31 - 30 + 30 = 51
		// position of k = 29
		// position of j = 11
		// position of i = 11
		
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		
		

	}

}
