package com.first;

public class Divisibleby3num {
	public static void main(String[] args) {
		int a = 30;
		//comment
		if (a % 3 ==0 &&  a % 5 ==0 && a % 10==0) {
			System.out.println("a is divisible by all 3 numbers");
		} else {
			System.out.println(" a is not divisible by 3 numbers");
		}
	}

}
