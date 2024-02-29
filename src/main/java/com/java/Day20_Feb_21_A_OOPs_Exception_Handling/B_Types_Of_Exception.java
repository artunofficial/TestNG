package com.java.Day20_Feb_21_A_OOPs_Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class B_Types_Of_Exception {
	
	//CompileTime Exception - Checked Exception
	
	//RunTime Exception - Unchecked Exception
	
	public static void main(String[] args) {
		divideByZero();
		
		
	}
	
	public static void checkingAFileIsPresentOrNot() {
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\artun\\OneDrive\\Masaüstü\\Login.txt");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void divideByZero() {
		int a=100, b=0, c;
		c=a/b;
		System.out.println(c);
	}

}
