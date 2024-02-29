package com.TestNG.Day12_Jan_24_A_Assertions_In_TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class F_SofAssert_Concepts {
	
	@Test
	public void checkingSoftAssert() {
		//One of the differences especically the way you want to use SoftAssert
		
		//Step 1: You have to create the Object of SoftAssert Class
		SoftAssert softassert = new SoftAssert();
		
		int i = 10;
		int j = 20;
		System.out.println(i + j);
		softassert.assertTrue(1 == 1);
		System.out.println(2*(i+j));
		softassert.assertTrue(1 == 2);
		System.out.println(5 + 5);
		softassert.assertTrue(true == false);
		System.out.println(50+50);
		
		
		softassert.assertAll(); //This should be the last line of code for this Test Case
		
	}

}
