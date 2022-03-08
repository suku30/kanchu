package com.controlstatement.pro;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number between 1 to 5");
		int num = s.nextInt();
		switch (num) {
		case 1:
			System.out.println("one");
			
			
			
		case 2: 
			System.out.println("Two");
			break;
			
			
		case 3:
			System.out.println("Three");
			
			

		default:
			System.out.println("invalid range");
			
			break;
		}
		
	}

}
