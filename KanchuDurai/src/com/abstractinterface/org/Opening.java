package com.abstractinterface.org;

public class Opening implements Secret,Green  {
	public static void main(String[] args) {
		Opening s=new Opening();
		s.student();
		s.teacher();
		s.parent();
		s.kanchana();
	}

	@Override
	public void student() {
		System.out.println("Got good mark");
		
	}

	@Override
	public void teacher() {
	System.out.println("Good Mark got by teacher");
		
	}

	@Override
	public void parent() {
	System.out.println("Happy");
		
	}

	@Override
	public void kanchana() {
		System.out.println("child");
		
	}
	

}
