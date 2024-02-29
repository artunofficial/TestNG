package com.java.Day17_Feb_13_B_OOPs_This_Keyword;

public class E_Use {
	//3. This() can be used to invoke current class constructor
	public static void main(String[] args) {
		E_Use use3 = new E_Use();
		E_Use usee3 = new E_Use(10);

	}
	
	public E_Use() {
		System.out.println("This is constructor and I am trying to get the value from inside");
	}
	
	public E_Use(int i) {
		this();
		System.out.println("Parameterized constructor");
		//this(); //Contructor call must be the first statement in a constructor | INTERVIEW QUESTION
	}

}


