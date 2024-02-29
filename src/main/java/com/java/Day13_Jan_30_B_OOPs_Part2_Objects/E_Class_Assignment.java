package com.java.Day13_Jan_30_B_OOPs_Part2_Objects;

public class E_Class_Assignment {

	String name = "Supra";
	String type = "Car";
	String color = "Black";
	int engine_type = 6;

	static int no_wheels = 4;
	static int doors = 2;

	public static void main(String[] args) {
		E_Class_Assignment BestCar = new E_Class_Assignment();
		BestCar.color = "Red";
		BestCar.type = "Carr";
		BestCar.name = "Supraa";
		BestCar.engine_type = 2;
		BestCar.logic3();
		BestCar.logic4();
		BestCar.logic5();
		logic1();
		
	}

	public static void logic1() {
		System.out.println("Toyota Supra is the best");
	}

	public static void logic2() {
		System.out.println("Nissan Skyline is the best");
	}
	
	public void logic3() {
		System.out.println("Toyota SUPRA");
	}
	
	public void logic4() {
		System.out.println("Nissan Skyline");
	}
	
	public void logic5() {
		System.out.println("Skyline GTR");
	}
	
	
}
