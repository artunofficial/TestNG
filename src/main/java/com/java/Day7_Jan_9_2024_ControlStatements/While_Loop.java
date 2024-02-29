package com.java.Day7_Jan_9_2024_ControlStatements;

public class While_Loop {

	public static void main(String[] args) {
		//When the knowledge of end point is not clear
		//when something tends to infinity
		//we use while loop
		
		//cnn.com is a news website
		//today the total no of links = 343
		
		//while(condition) {
			//body
		//}
		int i=1;
		while(i < 6) {
			System.out.println("Keep printing the value of i");
			break;
		}
		
		int a=1;
		while(a < 6) {
			System.out.println("Keep printing the value of a");
			a=a+1;
		}
		
		String S1 = "World";
		while(S1.equals("World")) {
			System.out.println("Hello World");
			break;
		}
		
		//Write a java program to prints 1st 100 natural numbers using while loop
		int b=1;
		while(b<=100) {
			System.out.println(b + " ");
			b++;
		}
		int c=100;
		while(c>=1) {
			System.out.println(c + " ");
			c--;
		}
		
		//Print 20 multiples of 5 using while loop
		int d = 5;
		while(d<=100) {
			System.out.println(d + " ");
			d=d+5;
		}
		
		int e=1;
		while(e<=20) {
			System.out.println(e*5 + " ");
			e++;
		}
		
		//Print 1083 multiples of 97 using while loop
		int f=1;
		while(f<=1083) {
			System.out.println(f*97 + " ");
			f++;
		}
	}

}
