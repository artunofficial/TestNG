package com.java.Day17_Feb_13_A_OOPs_Encapsulation;

public class D_Circle {
	
	private double radius;
	private double pivalue;
	
	public void getAreaOfCircle(double radius, double pivalue) {
		this.radius = radius;
		this.pivalue = pivalue;
	}
	
	public double getAreaOfCircle() {
		double area = pivalue * (radius*radius);
		System.out.println("The area of the circle is :" + area);
		return area;
	}

}
