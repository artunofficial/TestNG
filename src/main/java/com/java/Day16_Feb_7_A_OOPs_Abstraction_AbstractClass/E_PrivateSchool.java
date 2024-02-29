package com.java.Day16_Feb_7_A_OOPs_Abstraction_AbstractClass;

public class E_PrivateSchool extends C_Student {

	public static void main(String[] args) {
		E_PrivateSchool privateschool = new E_PrivateSchool();
		privateschool.studentMarksheet();
		privateschool.studentLibrary();
		privateschool.StudentPlayground();
		
		E_PrivateSchool.studentPrayerRoom();

		//Try creating the Object of parent class
		//C_Student student = new C_Student(); //Can never create the object of abstract class!!!!
		
		C_Student stud = new E_PrivateSchool(); //Here the Parent Class reference is poiting to Child Class Object
		stud.studentMarksheet();
		stud.studentLibrary();
		stud.StudentPlayground();
		

	}

	@Override
	public void studentMarksheet() {
		
		
	}

	@Override
	public void StudentPlayground() {
		
		
	}

}
