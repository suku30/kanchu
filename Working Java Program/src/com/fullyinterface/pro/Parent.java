package com.fullyinterface.pro;

public class Parent implements Child {
	public void property() {
		System.out.println("my property");

	}

	@Override
	public void cholocate() {
		// TODO Auto-generated method stub
		System.out.println("diary milk");
		
	}
	public static void main(String[] args) {
		Parent p=new Parent();
		p.property();
		p.cholocate();
	}
	
		
	
	}


