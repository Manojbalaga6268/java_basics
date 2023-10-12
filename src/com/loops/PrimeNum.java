package com.loops;

public class PrimeNum {
	public static void main(String[] args) {

		int num = 12;
		int count = 2;
		boolean isprime = true;

		while (count < 11) {
			if (num % count == 0) {
				isprime = false;
				System.out.println("it is not a prime number");
				break;
			}
			count++;
		}
		if (isprime) {
			System.out.println("it is a prime number");
		}

	}
}
