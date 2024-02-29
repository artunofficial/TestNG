package com.java.Day14_Jan_31_A_OOPs_Classes_Objects_and_Methods_Revisited;

public class F_Animal1 {

	public static void main(String[] args) {
		F_Animal1 buzzo = new F_Animal1();
		buzzo.eat();
		buzzo.sleep();
		
		Birds moti = new Birds();
		moti.fly();
		moti.hunt();
		
		Fish nemo = new Fish();
		nemo.swim();
		nemo.eggs();
	}
	
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	public void sleep() {
		System.out.println("Dog is sleeping");
	}
}
	class Birds {
		public void fly() {
			System.out.println("Eagle is flying");
		}
		public void hunt() {
			System.out.println("Eagle hunting");
		}
		
		}
	class Fish{
		public void swim() {
			System.out.println("Fish swimming");
		}
		public void eggs() {
			System.out.println("Fish egg");
		}
	}


