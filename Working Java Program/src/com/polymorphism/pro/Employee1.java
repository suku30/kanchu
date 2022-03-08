package com.polymorphism.pro;

public class Employee1 extends Employee {
	@Override
	public void details(String name) {
		// TODO Auto-generated method stub
		super.details("kanchana");
		System.out.println("Girl name=" +name);
		
	}
	@Override
	public void details(String mothername, String fathername) {
		// TODO Auto-generated method stub
		super.details("renu", "durai");
		System.out.println("Girl Mothername=" +mothername);
		System.out.println("Girl Fathername="+ fathername);
	}
@Override
public void details(int id) {
	// TODO Auto-generated method stub
	super.details(123);
	System.out.println("Girl id: " + id);
}
public static void main(String[] args) {
	Employee s=new Employee1();
s.details("chandy");
s.details("siva", "sub");
s.details(523);

}
		
	
	

}
