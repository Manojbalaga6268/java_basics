package com.first;

public class IfCondition {

	public static void main(String[] args) {

		int a = 20;
		if (a > 0) {
			System.out.println("It is Positive number");
		} else {
			System.out.println("It is negative number");
		}

		if (a > 10 && a < 100) {
			System.out.println("it is between 10 and 100");
		}

		if (a % 2 == 0 || a % 5 == 0) {

			System.out.println("It is divisble by 2 or with 5");
		}

		int num1 = 10;
		int num2 = 20;

		if (num1 > num2) {
			System.out.println("Num1 is big");
		}
		if (num2 > num1) {
			System.out.println("Num2 is big");
		}

		if (a < 20) {
			System.out.println("first if");
		} else if (a > 30) {
			System.out.println("second if");

		} else if (a == 40) {
			System.out.println("third if");

		} else {
			System.out.println("Last else");
		}

	}
	
	
	

}
