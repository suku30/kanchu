package com.polymorphism.org;

public class StudentDetail {
	public void Student(String name) {
		System.out.println("name" + name);
		
	}
	public void Student(char mother) {
		System.out.println("mother" + mother);
		
	}
	public void Student(int id) {
	System.out.println("id" + id);
}
	public static void main(String[] args) {
		StudentDetail s = new StudentDetail();
		s.Student("kanchu");
		s.Student('r');
		s.Student(4);
		
	}

}
