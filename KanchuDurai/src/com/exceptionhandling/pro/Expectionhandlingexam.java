package com.exceptionhandling.pro;

public class Expectionhandlingexam {
	public static void main(String[] args) {
		
			try {
				
				int a=12;
				int b=0;
				int c=a/b;
				System.out.println("the sub of a and b is" +c);
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				int a=12;
				int b=6;
				int c=a/b;
				System.out.println(c);
				e.printStackTrace();
			}
			catch (NullPointerException e) {
				System.out.println("null pointer");
				// TODO: handle exception
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("exception handle");
				e.printStackTrace();
			}
		} 
	}





