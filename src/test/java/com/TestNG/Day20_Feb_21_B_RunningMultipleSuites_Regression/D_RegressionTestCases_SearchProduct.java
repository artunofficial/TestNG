package com.TestNG.Day20_Feb_21_B_RunningMultipleSuites_Regression;

import org.testng.annotations.Test;

public class D_RegressionTestCases_SearchProduct {
	
	@Test(priority = 1)
	public void test1() {
		System.out.println("Regression test 1");
	}
	
	@Test(priority = 2)
	public void test2() {
		System.out.println("Regression test 2");
	}
	@Test(priority = 3)
	public void test3() {
		System.out.println("Regression test 3");
	}

}
