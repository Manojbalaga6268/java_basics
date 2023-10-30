package com.arrays;

public class FirstExample {

	public static void main(String[] args) {

		int intArr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };    // type one to initialize.
		String stringArray[] = { "Vissu", "balaga", "prasanth" };

		int newArr[] = new int[6];                    // type two to initialize.
		newArr[0] = 1;
		newArr[1] = 2;
		newArr[2] = 3;
		newArr[3] = 4;
		newArr[4] = 5;

		for (int i = 0; i < newArr.length; i++) {         // traverse 
			System.out.print(newArr[i] + " ");
		}

		System.out.println();

		// Revese the array

		for (int i = intArr.length - 1; i >= 0; i--) {
			System.out.print(intArr[i] + " ");
		}

		System.out.println();

		// Find even numbers

		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] % 2 == 0) {
				System.out.print(intArr[i] + " ");
			}
		}

		System.out.println();

		// Find odd numbers

		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] % 2 != 0) {
				System.out.print(intArr[i] + " ");
			}
		}

		System.out.println("====================================================");
		// Max number in array
		
		int max = Integer.MIN_VALUE; // -233453465346
		int array[] = { 88, 4, 90, 1309, 5, 9, 1, 54 };

		for (int i = 0; i < array.length; i++) {

			max = Math.max(max, array[i]);
		}
		System.out.println("Max value: " + max);
		
		
		
		
		
		System.out.println("====================================================");
		int newMax = Integer.MIN_VALUE;
		;
		for (int i = 0; i < array.length; i++) {

			if (newMax < array[i]) {
				newMax = array[i];
			}
		}

		System.out.println("Max value: " + newMax);

	}

}
