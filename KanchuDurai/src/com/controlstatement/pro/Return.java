package com.controlstatement.pro;

public class Return {
	public static int add(int a, int b) {
	return a+b;

	}
	public static void main(String[] args) {
		Return k=new Return();
		System.out.println("the summation value is="+ add(52, 78));
		int a=0;
		while (a<=5) {
			if(a<=2) {
			System.out.println(a);
			a++;
			continue;
			
		}
		}
		
	}
	

}
