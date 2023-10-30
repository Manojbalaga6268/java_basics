package com.arrays;

public class nextedforloop {
	public static void main(String[] args) {
		int array[] = { 2, 4, 6, 2, 6, 2, 6, 2, 5, 7, 8, 5, 8, 9 };
		int length = array.length;

		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				if (i != j && array[i] == array[j]) {

					System.out.print(array[j] +" ");
				}
			}
		}
	}
}
