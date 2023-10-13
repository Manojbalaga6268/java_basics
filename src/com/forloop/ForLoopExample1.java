package com.forloop;

public class ForLoopExample1 {

	public static void main(String[] args) {

		int factorial = 1;
		//
		for (int i = 5; i > 0; i--) {
			factorial = factorial * i;
		}

		System.out.println("Fcatorial: " + factorial);
		
		
	}

}
