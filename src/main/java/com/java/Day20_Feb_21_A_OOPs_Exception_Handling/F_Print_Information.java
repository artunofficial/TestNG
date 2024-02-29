package com.java.Day20_Feb_21_A_OOPs_Exception_Handling;

public class F_Print_Information {
	
	public static void main(String [] args) {
		int a=100, b=0, c;
		try {
			c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			
			e.printStackTrace(); //prints ExceptionName, ExceptionDescription, and also StackTrace
			System.out.println(e); //prints ExceptionName, ExceptionDescription
			System.out.println(e.toString()); //prints ExceptionName, ExceptionDescription
			System.out.println(e.getMessage()); //prints ExceptionDescription
			
		}
	}

}
