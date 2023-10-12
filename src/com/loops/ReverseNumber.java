package com.loops;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 225;
		int reverse = 0;
		// num =225, reverse = 0
		// reminder = 5, reverse = 5, num = 22  -> first iteration
		// reminder = 2, revese = 52, num = 2 -> second iteration
		// reminder = 2, reverse 522, num = 0 -> third iteration
		
		while (num > 0) {
			int reminder = num % 10;
			reverse = (reverse * 10) + reminder;
			num = num / 10;
		}

		System.out.println("Reversed num: " + reverse);

	}

}
