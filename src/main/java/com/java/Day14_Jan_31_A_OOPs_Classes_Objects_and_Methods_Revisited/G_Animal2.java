package com.java.Day14_Jan_31_A_OOPs_Classes_Objects_and_Methods_Revisited;

public class G_Animal2 {
	
	//Initialize the object using methods
	String color;
	int age;

	public static void main(String[] args) {
		G_Animal2 buzzo = new G_Animal2();
		buzzo.color = "Fawn";
		buzzo.age = 5;
		
		System.out.println(buzzo.color + "------" + buzzo.age);
		buzzo.initializeObject("Black", 7);
		buzzo.display();

	}

	public void initializeObject(String c, int a) {
		color = c;
		age = a;
	}
	
	public void display() {
		System.out.println(color + "........" + age);
	}
}
