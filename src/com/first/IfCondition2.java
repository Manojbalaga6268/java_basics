package com.first;

import java.util.Scanner;

public class IfCondition2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("It is even number");
		} else {
			System.out.println("It is odd number");
		}
	}

}
