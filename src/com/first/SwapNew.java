package com.first;

import java.util.Scanner;

public class SwapNew {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of m: ");
		int m = sc.nextInt();
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();

		System.out.println("m: " + m);
		System.out.println("n: " + n);
		//
		int samp = m;
		m = n;
		n = samp;

		System.out.println("m: " + m);
		System.out.println("n: " + n);

	}
}
