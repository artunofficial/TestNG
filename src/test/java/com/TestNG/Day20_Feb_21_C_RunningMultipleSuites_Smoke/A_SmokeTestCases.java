package com.TestNG.Day20_Feb_21_C_RunningMultipleSuites_Smoke;

import org.testng.annotations.Test;

public class A_SmokeTestCases {
	@Test(priority = 1)
	public void test1() {
		System.out.println("Smoke test 1");
	}
	
	@Test(priority = 2)
	public void test2() {
		System.out.println("Smoke test 2");
	}
	@Test(priority = 3)
	public void test3() {
		System.out.println("Smoke test 3");
	}

}
