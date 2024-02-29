package com.java.Day21_Feb_27_B_Wrapper;

public class E_Parsing {
	
	//Parsing means converting a String representation of a value into its corresponding data type
	
	public static void main(String[] args) {
		stringToInteger();
		stringToDouble();
		stringToBoolean();
		stringToLong();
	}
	
	public static void stringToInteger() {
		
		String price1 = "400";
		String price2 = "250";
		
		System.out.println("Total price of the commodities is :" + (price1 + price2));
		
		//String to int
		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		System.out.println("Total price of the commodities is :" + (p1 + p2));
	}
	
	public static void stringToDouble() {
		String price1 = "1.11";
		String price2 = "2.22";
		
		System.out.println("Total price of the commodities is :" + (price1 + price2));
		
		//String to Double
		
		double p1 = Double.parseDouble(price1);
		double p2 = Double.parseDouble(price2);
		
		System.out.println("Total price of the commodities is :" + (p1 + p2));
	}
	
	//String to Boolean
	public static void stringToBoolean() {
		String value1 = "true";
		String value2 = "false";
		
		boolean result1 = Boolean.parseBoolean(value1);
		boolean result2 = Boolean.parseBoolean(value2);
		
		System.out.println(result1 == result2);

	}
	
	public static void stringToLong() {
		String beverly1 = "124435435";
		String beverly2 = "453488543";
		
		long hills1 = Long.parseLong(beverly1);
		long hills2 = Long.parseLong(beverly2);
		
		System.out.println();
		
		
	}
	

}
