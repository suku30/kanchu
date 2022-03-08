package com.polymorphism.org;

public class StudentDetail1 extends StudentDetail {
@Override
public void Student(String name) {
	// TODO Auto-generated method stub
	super.Student(name);
	System.out.println("girl name" + name);
}
@Override
	public void Student(char mother) {
		// TODO Auto-generated method stub
		super.Student(mother);
		System.out.println("girl mothername" + mother);	
	}
@Override
	public void Student(int id) {
		// TODO Auto-generated method stub
		super.Student(id);
		System.out.println("Student id:" +id);
	}
public static void main(String[] args) {
	StudentDetail s =new StudentDetail1();
	s.Student("Kanchana");
	s.Student('r');
    s.Student(123);
}

}
