package com.java.Day17_Feb_13_B_OOPs_This_Keyword;

public class F_Use {
	//4. Can be used to pass an arguement in a method call
	public static void main(String[] args) {
		F_Use use4 = new F_Use();
		use4.method2();

	}
	
	public void method1(F_Use use) {
		System.out.println("I am inside the method1");
	}
	
	public void method2() {
		method1(this);
		
	}

}
