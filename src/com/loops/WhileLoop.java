package com.loops;

public class WhileLoop {

	public static void main(String[] args) {
		// if a divisble by 2 then print
		// if a divisble by 3 and 5 then print

		int a = 10;

		while (a > 0) {
			if (a % 2 == 0) {
				System.out.println("a : " + a);
			}
			a--;
		}

	}
}
