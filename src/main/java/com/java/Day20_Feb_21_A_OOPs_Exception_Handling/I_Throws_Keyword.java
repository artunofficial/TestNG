package com.java.Day20_Feb_21_A_OOPs_Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class I_Throws_Keyword {

	public static void main(String[] args) throws FileNotFoundException {
		filePresentOrNot();

	}
	
	public static void filePresentOrNot() throws FileNotFoundException {
		FileInputStream ip = new FileInputStream("C:\\\\Users\\\\artun\\\\OneDrive\\\\Masaüstü\\\\Login.txt");
		
	}

}
