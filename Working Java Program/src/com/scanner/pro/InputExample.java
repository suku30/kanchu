package com.scanner.pro;

import java.util.Scanner;

public class InputExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a line");
		String line = sc.next();
		System.out.println("the give line="+line);
		
		System.out.println("enter a word");
		String word = sc.next();
		
		System.out.println("enter a value");
		int a = sc.nextInt();
		
		System.out.println("enter b value");
		int b = sc.nextInt();
		
		int c=a+b;
		System.out.println("the value of a and b is = "+ c);
		
	}
	
	}


