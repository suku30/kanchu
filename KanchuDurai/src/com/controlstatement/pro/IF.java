package com.controlstatement.pro;

import java.util.Scanner;

public class IF {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("eligible to vote");
		int age = s.nextInt();
		if (age!=18 ) {
			System.out.println("you eligible to vote");
			
		}
		else if (age>68) {
			System.out.println("you are senior citizen");
			
		} else {
			System.out.println("you are not elible to votes");

		}
		
	}
	

}
