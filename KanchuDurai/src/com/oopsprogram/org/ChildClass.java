package com.oopsprogram.org;

public class ChildClass extends ParentClass {
	private void toy() {
		System.out.println("toy");

	}
	public static void main(String[] args) {
		ChildClass c= new ChildClass();
		c.food();
		c.money();
		c.dress();
		c.toy();
		c.property();
			
	}
	

}
