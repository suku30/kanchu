package com.oopsprogram.org;

public class ParentClass extends GrandParent {
	public void food() {
		System.out.println("food");
}
	public void money() {
	System.out.println("pockey money");

	}
	public void dress() {
	System.out.println("dress");
}
private void work() {
	System.out.println("work");

}
	public static void main(String[] args) {
		ParentClass f=new ParentClass();
		f.food();
		f.money();
		f.dress();
		f.work();
		f.property();
		
	}

}
