package com.arrays;

public class countrepeatnumber {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 4, 5, 6, 6, 7, 8, 9 };
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 6) {
				count++;
			}
		}
		System.out.println("number of ones in array :" + count);

	}
}
