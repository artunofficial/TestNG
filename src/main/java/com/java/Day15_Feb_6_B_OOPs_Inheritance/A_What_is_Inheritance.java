package com.java.Day15_Feb_6_B_OOPs_Inheritance;

public class A_What_is_Inheritance {
	
	//Inheritance is inheriting properties of Parent Class into Child Class
	//Inheritance in Java is a mechanism in whic one Object(Child) acquires all the properties and behaviors of the Parent Object
	//Inheritance represents IS-A relationship which is also known as Parent-Child relationship
	
	//Example:
	//Let's say parent Class is Animal
	//Dog IS-A Animal
	//Cow IS-A Animal
	//Cat IS-A Animal
	
	//Example 2:
	//Let's say parent Class is Doctor
	//Surgeon 			 IS-A Doctor
	//MedicineSPecialist IS-A Doctor
	
	
	//What are the advantages of inheritance ?
	//1. Code reusability
	//2. It promotes RunTime Polymorphism [Method Overriding]
	
	//What are the disadvantages of inheritance ?
	//1. Parent Class and Child Class get tightly coupled
	
	//Which entities do not take part in inheritance ?
	//1. Private members of a Class
	//2. Constructors (YOU CAN NOT OVERRIDE CONSTRUCTORS - INTERVIEW QUESTION)
	
	//What are the types of inheritance ?
	//1. Single Inheritance - One Child class extends one Parent Class
	//2. Multilevel Inheritance - Grand Parent is extended by Parent which is extended by Child
	//3. Hierarchical Inheritance - One Parent class is extended by Multiple Child classes
}
