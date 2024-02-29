package com.java.Day11_Jan_23_A_OOPs_Part1_Methods;

public class E_ReturnType_In_Methods {

	public static void main(String[] args) {
		//Definition - Independent units of execution
		//It is a logical house or it stores logic. It is kind of a factory
		//Raw material --- Machine --- Output
		
		//accessModifier static  void(return type of the method) nameoftheMethod() { }

		int value = methodName(20,30);
		System.out.println(value);
	}
	
	public static int methodName(int i, int j) {
		//logical factory
		
		int k=i+j;
		return k; //return type is int 
		
		
	}

}
