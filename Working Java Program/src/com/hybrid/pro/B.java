package com.hybrid.pro;

public interface B extends A {
	void car();
	@Override
	default void property() {
		// TODO Auto-generated method stub
		System.out.println("my property");
		
	}

}
