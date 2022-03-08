package com.string.pro;

import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String rin = sc.nextLine();
		
		int length = rin.length();
	System.out.println(length);
	char charAt = rin.charAt(5);
	System.out.println(charAt);
	String concat = rin.concat(" kanchu ");
	System.out.println(concat);
	boolean equalsIgnoreCase = rin.equalsIgnoreCase("learning of java");
	System.out.println(equalsIgnoreCase);
	boolean equals = rin.equals("learning of java");
	System.out.println(equals);
	String upperCase = rin.toUpperCase();
	System.out.println(upperCase);
	String lowerCase = rin.toLowerCase();
	System.out.println(lowerCase);
	int indexOf = rin.indexOf("java");
	System.out.println(indexOf);
	String repeat = rin.repeat(3);
	System.out.println(repeat);
	String replace2 = rin.replace("Learning of java","Learning the java");
	System.out.println(replace2);
	String replace = rin.replace("a", "also");
	System.out.println(replace);
	String substring = rin.substring(3,11);
	System.out.println(substring);
	String[] split = rin.split(" ", 3);
	for (String string : split) {
		System.out.println(string);
		
		
	}
	
	
	
	
	}

}
