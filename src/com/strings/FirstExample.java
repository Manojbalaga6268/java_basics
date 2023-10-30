package com.strings;

public class FirstExample {

	public static void main(String[] args) {

		String name = "Balaga is Good boy"; // String literals
		String newname = new String("Balaga is Good boy");
	
		System.out.println(name.contains("boy"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.equals(newname));
		System.out.println("equalsignore: " + name.equalsIgnoreCase("BALAGA is Good boy"));
		System.out.println(name.substring(0, 6));
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(8));
		System.out.println(name.length());
		System.out.println(name.isBlank());
		
		String str = "  vishal";
		System.out.println(str.trim());

	}

}
