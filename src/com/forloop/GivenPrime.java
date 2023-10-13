package com.forloop;

public class GivenPrime {
	public static void main(String[] args) {

		int a = 11;
		boolean isprime = true;
		for (int count = 2; count <a; count++) {
			if (a % count == 0) {
				isprime = false;
				System.out.println("it is not a prime number ");
			}
		}
		if (isprime) {
			System.out.println("it is a prime number");
		}
	}

}
