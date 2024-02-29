package com.java.Day17_Feb_13_B_OOPs_This_Keyword;

public class D_Use {
	//2. Can be used to invoke current class method(implicitly)
	public static void main(String[] args) {
		D_Use use2 = new D_Use();
		use2.show();
	}

	
	void display() {
		System.out.println("Hello World");
	}
	
	void show() {
		this.display();
	}
}
