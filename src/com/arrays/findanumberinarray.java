package com.arrays;

public class findanumberinarray {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int length = array.length;
		int a = 5;
		for (int i = 0; i < length; i++) {
			if (array[i] == a) {
				System.out.println("yes");
				break;
			}
		}
		//boolean numberpresent = true;
		for (int i = 0; i < length; i++) {
			if (array[i] == a) {
				//numberpresent = true;
				System.out.println((array[i]) +   ": Number found in array ");

			}
		}
	}
}
