package com.strings;

public class DifferentWaysToCreateAString {

	public static void main(String[] args) {

		String name = "vishal"; // -> String literals
		System.out.println(name);
		String object = new String("vishal");
		// strings are immutable
		name = "balaga";
		System.out.println(name);
		String a = name + "sai roop";
		System.out.println(a);
		 
	}

}
