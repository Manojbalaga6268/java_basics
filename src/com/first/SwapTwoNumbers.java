package com.first;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 2;
		int b = 4;

		System.out.println("a : " + a);
		System.out.println("b: " + b);
		
		//
		int temp = a;
		a = b;
		b = temp;
		
		// after swapping
		
		System.out.println("a : " + a);
		System.out.println("b: " + b);

	}

}
