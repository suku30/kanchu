package com.constructor.program;


	public class B {
		public B() {
		this("JAVA");
		System.out.println("Default const...");
		}

		public B(int id) {
		this(3456.5678f);
		System.out.println(id);
		}

		public B(String name) {
		this(12);
		System.out.println(name);
		}

		public B(float sal) {
		System.out.println(sal);
		}

		public static void main(String[] args) {
		B a = new B();
		}
		}




