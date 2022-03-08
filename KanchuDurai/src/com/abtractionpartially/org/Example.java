package com.abtractionpartially.org;

public class Example extends AbstractionExample {
	public static void main(String[] args) {
		Example e=new Example();
		e.method();
		e.method1();
		e.method2();
	}
	@Override
	public void method2() {
	System.out.println("method2");
		
	}
	

}
