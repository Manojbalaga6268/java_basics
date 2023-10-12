package com.loops;

public class PrimeNumber {

	public static void main(String[] args) {

		int number = 16;
		int count = 2;
		boolean isPrime = true;
		while (count < 11) {

			if (number % count == 0) {
				isPrime =false;
				System.out.println("It is not a prime number");
				break;
			}
			count++;
		}
		
		
		if(isPrime) {
			System.out.println("It is a prime number");
		}
	}
}
