package com.loops;

public class WhileLoopfact {
	public static void main(String[] args) {
		int num = 10;
		int factorial = 1;
		
		while(num > 0) {
			factorial = factorial*num;
			num--;
		}
		System.out.println(" factorial :" + factorial);
	}

}
