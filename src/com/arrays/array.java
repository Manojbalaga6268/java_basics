package com.arrays;

public class array {
	public static void main(String[] args) {
		//commit
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		int newarray[]= {1,2,3,4,5,6,0,0,0,0,0,0,0,7,8,9};
		for(int i=0;i<newarray.length;i++) {
			System.out.print(newarray[i]+" ");
		}
	}

}
