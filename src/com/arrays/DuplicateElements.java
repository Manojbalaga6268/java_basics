package com.arrays;

public class DuplicateElements {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 9, 2, 7, 8, 2, 2, 5 };
		String elements = "";
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {

				if (i != j && arr[i] == arr[j]) {
					if (!elements.contains("" + arr[i])) {
						elements = elements + arr[i] + " ";
					}
				}
			}
		}

		System.out.println(elements);

	}

}
