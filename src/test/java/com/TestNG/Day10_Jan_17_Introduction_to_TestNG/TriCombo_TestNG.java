package com.TestNG.Day10_Jan_17_Introduction_to_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriCombo_TestNG {
//If @BeforeMethod, @Test and @AfterMethod are being executed then the output will show
	//@BeforeMethod...@Test...@afterMethod   @BeforeMethod....@Test...@AfterMethod  @Before Method...@Test...@afterMethod
	
	
	@BeforeMethod
	public void setup() {
		System.out.println("This is just a before method logic");
	}

	@Test
	public void testcase1() {
		System.out.println("This is TC1");
	}

	@Test
	public void testcase2() {
		System.out.println("This is TC2");
	}
	
	@Test
	public void testcase3() {
		System.out.println("This is TC3");
		}
	
	@AfterMethod
	public void afterMethodMethod() {
		System.out.println("This is just and after method logic");
	}
}
