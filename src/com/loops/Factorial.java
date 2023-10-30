package com.loops;

public class Factorial {
	
	
	public static void main(String[] args) {
		
		int num = 5;
		int factorial = 1;
		// num =5, factorial =5
		// num =4, factorial = 20
		// num =3, factorial =60
		// num =2, factorial =120
		// num =1, factorial=120
		while(num >0) {
			
			factorial = factorial * num;
			num--;
			//System.out.println("Factorial: " + factorial);
		}
		
		System.out.println("Factorial: " + factorial);
	}

}
