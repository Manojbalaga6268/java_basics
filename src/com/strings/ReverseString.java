package com.strings;

public class ReverseString {

	public static void main(String[] args) {

		String name = "manoj kumar balaga";
		reverseString(name);
	}

	public static void reverseString(String name) {
		int length = name.length();

		for (int i = length - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
	}

}
