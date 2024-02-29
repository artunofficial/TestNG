package com.java.Day9_Jan_16_Arrays;

public class Class_Assignment {

	public static void main(String[] args) {
		//1st Array - make an int array with 20 elements in it
//		int FirstArray[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		
		
		//2nd Array - Make a decimal array with 10 elements in it
		
		//3rd Array - Make string array with 5 elements in it
		
		//Use for loop to retrieve all the elements of each array mentioned above
		//Retrieve the 20th element of 1st array
		//Retrieve the 11th element of 2nd array
		//Retrieve the 1st element of 3rd array

		
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		double b[]= {1.2,2.3,3.4,5.3,6.4,7.8,8.8,9.6,3.4,7.5};
		String S[]= {"Hello","Hi","How","Are","You"};

		for(int i=0 ; i<=a.length-1 ; i++ ) {
			System.out.println(a[i] + " ");
		}
		System.out.println();
		
		for(int i=0 ; i<=b.length-1 ; i++ ) {
			System.out.println(b[i] + " ");
		}
		System.out.println();
		
		for(int i=0 ; i<=S.length-1 ; i++ ) {
			System.out.println(S[i] + " ");
		}
		System.out.println();
		
		System.out.println("The 20th element of first array is : " + a[19]);
//		System.out.println("The 11th element of first array is : " + b[10]); //this will not work bec there is no 11th
		System.out.println("The 1st element of first array is : " + S[0]);
	}

}
