package com.java.Day13_Jan_30_B_OOPs_Part2_Objects;

public class G_Class_Assignment_2 {
	
	static int wheels = 4;
	static int doors = 2;
	int year = 1994;
	String model = "Supra";
	
	public static void main(String [] args) {
//		log1();
//		log2();
//		log3();
		
		G_Class_Assignment_2 cars = new G_Class_Assignment_2();
		cars.log5();
		cars.log6();
		cars.log7();
		cars.log1();
		cars.log2();
	}
	
	
	public static void log1() {
		System.out.println("Toyota Supra 1994");
		log2();
		log3();
	}
	
	public static void log2() {
		System.out.println("Toyota Supra 1999");
		log1();
		log3();
		
	}
	
	public static void log3() {
		System.out.println("Toyota Supra 2023");
		log1();
		log2();
	}
	
	public void log5() {
		System.out.println("Tofas");
		log6();
	}
	
	public void log6() {
		System.out.println("Sahin");
	}
	
	public void log7() {
		System.out.println("SLX");
	}
	
	
	
}
