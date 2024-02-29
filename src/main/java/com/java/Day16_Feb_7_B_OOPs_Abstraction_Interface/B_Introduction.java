package com.java.Day16_Feb_7_B_OOPs_Abstraction_Interface;

public interface B_Introduction {
	
	//%100 Abstraction
	
	//Definition: Blueprint of a class
	//It tells a class what to do but does not tell how to do
	
	//Methods inside an interface are abstract and public
	//Variables inside an interface as public, static and final
	
	//jdk8 and onwards default concrete/normal methods were allowed
	//jdk9 and onwards private concrete methods were allowed
	//jdk9 and onwards static concrete methods were allowed
	
	public static final int i = 10;
	
	public void helloWorld();
	
	default public void check() {
		
	}
	
	private void checkSum() {
		
	}
	
	public static void drum() {
		
	}
	
}
