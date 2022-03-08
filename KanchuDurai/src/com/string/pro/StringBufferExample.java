package com.string.pro;

public class StringBufferExample {
	public static void main(String[] args) {
		String st="kanchana";
		String s="kanchana";
		System.out.println(System.identityHashCode(st));
		System.out.println(System.identityHashCode(s));
		String concat = s.concat(st);
		System.out.println(concat);
		System.out.println(System.identityHashCode(concat));
		System.out.println(st);
		
		StringBuffer hb=new StringBuffer("kanchana");
		StringBuffer hbb=new StringBuffer("kanchana");
		System.out.println(System.identityHashCode(hbb));
		System.out.println(System.identityHashCode(hb));
		StringBuffer append = hbb.append(hb);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));
		System.out.println(hbb);
		StringBuffer reverse = hb.reverse();
		System.out.println(reverse);
		
		StringBuilder jo=new StringBuilder("kanchana");
		StringBuilder joo=new StringBuilder("kanchana");
		System.out.println(System.identityHashCode(joo));
		System.out.println(System.identityHashCode(jo));
		StringBuilder append2 = joo.append(jo);
		System.out.println(append);
		StringBuilder reverse2 = jo.reverse();
		System.out.println(reverse2);
		
	}

}

