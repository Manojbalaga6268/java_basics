package com.first;

public class Divisibleby10 {
	public static void main(String[] args) {
		
		int a = 25;
		// written logic *****
		if ( a % 5 == 0 && a % 10 == 0) {
			System.out.println("a is divisible by both 5 and 10");
		} else {
			System.out.println(" a is not divisible by both 5 and 10");
		}
		
	}

}
