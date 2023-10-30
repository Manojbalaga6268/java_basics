package com.arrays;

import java.util.Arrays;

public class SplitArray {

	public static void main(String[] args) {

		String input = "Balaga is a good man";

		String res = reverseTheWords(input);
		System.out.println(res);

	}

	private static String reverseTheWords(String input) {

		String[] split = input.split(" ");
		System.out.println(Arrays.toString(split));
		int length = split.length;

		String response = "";

		for (int i = length - 1; i >= 0; i--) {
			response += split[i]+" ";
		}

		return response;
	}

}
