package com.java.Day16_Feb_7_B_OOPs_Abstraction_Interface;

public class E_Execution implements B_Introduction, C_Conclusion{
	
	//E_Execution is the Child class
	
	//What is Execution class doing ?
	//It is implementing all the unimplemented methods of the interface
	
	//So Exection 

	public static void main(String[] args) {
		
		C_Conclusion reference = new E_Execution();
		//Reference of the interface is pointing towards the object of the Class
		
//		WebDriver driver = new ChromeDriver();
		
		

	}

	@Override
	public void helloWorld() {
		
		
	}

	@Override
	public void tearDown() {
		
		
	}

	@Override
	public void codeEnd() {
		
		
	}

	@Override
	public void disconnectDB() {
		// TODO Auto-generated method stub
		
	}

}
