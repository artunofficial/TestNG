package com.java.Day14_Jan_31_B_OOPs_Constructors;

public class B_What_is_a_Constructor {

	// Constructor can acknowledge all the 4 access modifiers

//	B_What_is_a_Constructor() {
//		
//	}

	public B_What_is_a_Constructor(String name, int age) {

	}

	public B_What_is_a_Constructor(String name, int age, double height) {

	}
	
	public B_What_is_a_Constructor() {
		
	}

	public static void main(String[] args) {
		B_What_is_a_Constructor reference = new B_What_is_a_Constructor("Artun", 10);
		
		B_What_is_a_Constructor reference1 = new B_What_is_a_Constructor("Artun", 10, 5.10);
		
		B_What_is_a_Constructor reference2 = new B_What_is_a_Constructor();
	}

	// If some entity has a body we call that entity BLOCK
	// Constructor is a block which looks like a method but it is not a method
	// Constructor has no return type. Not even void.

	// When does a Contructor come into picture or when does it appear or when is it
	// invoked ?
	// The moment an Object is created, constructor is invoked

	// What are the uses of Constructor ?
	// 1. Initialize the object
	// 2. Optimize the code

	// How many types of constructor are there
	// 1. Default constructor which is invisible and is created by the compiler the
	// moment an object is created
	// 2. User-defined constructor (No argument)
	// 3. User-defined constructor (arguements / parameters)

}
