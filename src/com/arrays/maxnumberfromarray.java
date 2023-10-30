package com.arrays;

public class maxnumberfromarray {
	public static void main(String[] args) {
		int intarray[] = { 1, 2, 0,-98765, 100, 2, 80, 212, 0, 6268, 12, 999, 13265, 626862 };
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < intarray.length; i++) {
			max = Math.max(max, intarray[i]);
		}
		System.out.println("max value :" + max);

		System.out.println("------------------------------");

		// min value of array
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < intarray.length; i++) {
			min = Math.min(min, intarray[i]);
		}
		System.out.println("Min value :" + min);
	}

}
