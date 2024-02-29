package com.java.Day17_Feb_13_A_OOPs_Encapsulation;

public class C_Execution_ExternalEntity {

	public static void main(String[] args) {
		
		B_Student_EnclosedUnit student = new B_Student_EnclosedUnit();
		student.setData("Alan", 10, 3.45);
		
		System.out.println(student.getNameOfStudentData());
		System.out.println(student.getAgeOfStudentData());
		System.out.println(student.getHeightOfStudentData());

	}

}
