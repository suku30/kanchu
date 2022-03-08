package com.constructor.pro;

public class StudentDetails {
	
	public StudentDetails() {
		System.out.println("Kanchu");
	}
	
	public StudentDetails(String s) {
		System.out.println(s+"vangah da eruku da ");
	}
	public static void main(String[] args) {
		StudentDetails s= new StudentDetails();
		StudentDetails s1 = new StudentDetails("eruma madungala");

	}
	
}
