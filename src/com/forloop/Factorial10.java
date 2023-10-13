package com.forloop;

public class Factorial10 {

	public static void main(String[] args) {

		int factorial = 1;

		for (int a = 10; a > 0; a--) {
			factorial = factorial * a;
			}
		System.out.println("Ten factorial :" + factorial);
	
	}

}
