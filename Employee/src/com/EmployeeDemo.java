package com;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Associate(1,"aaa",5000,7000);
		Employee e2=new Consultant(2,"bbb",3000,1000,5000);
		System.out.println(e1.calculateSalary());
		System.out.println(e2.calculateSalary());
	}

}
