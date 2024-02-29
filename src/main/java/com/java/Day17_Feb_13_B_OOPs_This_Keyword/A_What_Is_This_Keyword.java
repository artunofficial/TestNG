package com.java.Day17_Feb_13_B_OOPs_This_Keyword;

public class A_What_Is_This_Keyword {
	
	//This keyword is a reference variable which refers to the Object
	
	int identity; //Instance variable. Is instance variable part of the object ?? YES
	
	void setValues(int identity) {
		
		this.identity = identity;
		
		//this keyword refers to the current class instance variable
		
		//but what if this is alone ??
		//Then this will refer to the object
	}
	
	void show() {
		System.out.println(identity);
		
	}

}
