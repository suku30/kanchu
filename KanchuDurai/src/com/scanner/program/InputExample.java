package com.scanner.program;

import java.util.Scanner;

public class InputExample {
	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		System.out.println("enter a line");
		String line = d.nextLine();
		System.out.println("the given line is ="+line);
		System.out.println("enter a word");
		String Word = d.nextLine();
		System.out.println("enter a value to a");
		int a = d.nextInt();
		
		System.out.println("enter a value to b");
		int b = d.nextInt();
		
	
		int c=a+b; 
	System.out.println("the value of a and b is = " + c);
	
	
	
		
	
	}

}
