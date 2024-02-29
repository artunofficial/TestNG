package com.java.Day16_Feb_7_A_OOPs_Abstraction_AbstractClass;

public abstract class C_Student {
	
	//An abstract class can hold abstract methods
	//A regular class cannot hold abstract methods
	//An abstract class can also hold regular methods
	
	public abstract void studentMarksheet(); 
	//public void studentMarksheet() //Unimplemented or undefined method. This also known as abstract method.
									 //A method is known as unimplemented if it has no body

	public abstract void StudentPlayground();
	
	//public static abstract void studentBasketBallCourt(); this is not possible
	
	//Why can unimplemented method not be static ?
	
	
	public void studentLibrary() {
		System.out.println("This is a normal method or a concrete method");
	}
	
	public static void studentPrayerRoom() {
		System.out.println("This is a static method inside abstract class");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method can reside inside an Abstract Class");
	}
}
