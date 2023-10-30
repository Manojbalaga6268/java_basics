package com.arrays;

public class reversenumber {
	public static void main(String[] args) {
		int array[] = { 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 9 };

		// reverse
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println("  ");

		// find even numbers
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0 && array[i] > 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println("  ");
		// odd numbers
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
