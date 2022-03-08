package com.hybrid.pro;

public class D extends C implements B {

	@Override
	public void car() {
		// TODO Auto-generated method stub
		System.out.println("my car");
		
	}
	private void biscuit() {
		// TODO Auto-generated method stub
System.out.println("sunfill");
	}
	public static void main(String[] args) {
		D op=new D();
		op.property();
		op.car();
		op.chol();
		op.biscuit();
	}
	@Override
	public void property() {
		// TODO Auto-generated method stub
		System.out.println("my property");
		
	}
	@Override
	public void chol() {
		// TODO Auto-generated method stub
		System.out.println("cholocate");
	}

}
