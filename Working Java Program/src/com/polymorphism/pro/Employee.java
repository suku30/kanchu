package com.polymorphism.pro;

public class Employee {
	public void details(String name) {
	System.out.println("name = "  + name);

	}
public void details(String mothername,String fathername) {
	System.out.println("mothername = " + mothername);
System.out.println("fathername = " + fathername);
}
public void details(int id) {
	System.out.println("id : " + id);

}
public static void main(String[] args) {
	

Employee e=new Employee();
e.details("kanchana");
e.details("renu", "durai");
e.details(123);


}


}


