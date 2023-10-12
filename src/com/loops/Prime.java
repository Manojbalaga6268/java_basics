package com.loops;

public class Prime {
	public static void main(String[] args) {
		int number=20;
		int count=2;
		boolean isprime=true;
		
		while(count<number) {
			if (number%count ==0) {
			isprime= false;
			System.out.println("it is not a prime number");
			break;
		}
		count++;
		
	}
		if(isprime) {
			System.out.println("it is a prime number");
		}
 
}
}
