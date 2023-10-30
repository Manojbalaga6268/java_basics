package com.strings;

public class MethodsIntro {

	public static void main(String[] args) {

		int num = 11;
		boolean result = isprime(num);
		System.out.println(result);

		String res = isAPrime(num);
		System.out.println(res);

	}

	private static String isAPrime(int num) {
		int a = 2;
		while (a < num) {
			if (num % a == 0) {
				return "It is not a prime number";
			}
			a++;
		}
		return "It is a prime number";
	}

	// access //return typr
	private static boolean isprime(int num) {
		int a = 2;
		while (a < num) {
			if (num % a == 0) {
				return false;
			}
			a++;
		}
		return true;
	}

}
