package com.java.Day13_Jan_30_B_OOPs_Part2_Objects;

public class F_Static_And_NonStatic {
	// Static is mostly used when it is not supposed to change
	// if it is supposed to change we tend not to use static
	
	//Non-static - entities which do not have static keyword associated with it 
	//Non-static is purely for the Object. It is close to the Object family
	//Static basically will be direcly associated with the class
	//Object - Collection of all non-static entities of the class
	
	//Certain set of rules for statin and non-static
	//Static can only call static
	//Static cannot call non-static
	
	
	//Non-Static can call non-static 
	//Non-Static can also call static. It will work but it is not recommended
	
	static int age = 30;
	String name = "Tom";
	
	public static void main(String[] args) {
	//Main method is static
		addition();
		System.out.println(age);


		F_Static_And_NonStatic reference = new F_Static_And_NonStatic();
		reference.multiplication();
	
		
		
	}
	
	public static void addition() {
		int i=1; int j=2;
		System.out.println(i+j);
	}
	
	public void multiplication() {
		int i=3; int j=2;
		System.out.println(i*j);
		modulusOperation(); //Non-static can call Non-Static
	}
	
	public void modulusOperation() {
		int i=10;
		int j=3;
		System.out.println(i%j);
		
	}

}
