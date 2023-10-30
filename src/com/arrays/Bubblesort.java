package com.arrays;

import java.util.Arrays;

public class Bubblesort {
	public static void main(String[] args) {

		int A[] = { 5, 12, 6, 13, 19, 99, 100, 2, 10, 999 };
		int n = A.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
				}
				// System.out.print(A[i] +" ");
			}
			// System.out.println(" ");
		}

//		for (int i = 0; i < n; i++) {
//			System.out.print(A[i] + " ");
//		}
		System.out.println(Arrays.toString(A));

	}
}
