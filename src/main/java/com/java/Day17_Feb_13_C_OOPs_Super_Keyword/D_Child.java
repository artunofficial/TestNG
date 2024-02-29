package com.java.Day17_Feb_13_C_OOPs_Super_Keyword;

public class D_Child extends C_Parent {
	//1. Super keyword is used to refer immediate parent class instance variable
	//2. Can be used to invoke immediate parent class method
	//3. super() can be used to invoke immediate parent class constructor
	public static void main(String[] args) {
		D_Child child = new D_Child();
		child.show(50);

	}

	int a = 20;

	void show(int a) {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		super.takeAway();
	}
	
	public D_Child() {
		super();
	}
}
