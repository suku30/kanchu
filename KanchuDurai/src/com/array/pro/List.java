package com.array.pro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.controstatement.org.While;

public class List {
	public static void main(String[] args) {
		java.util.List<Object>list=new ArrayList<>();
		list.add("diraymilk");
		list.add("cholcate");
		list.add("biscuit");
		list.add(22);
		
		int size = list.size();
		System.out.println(size);
		list.add(2,null);
		boolean contains = list.contains("diraymilk");
		System.out.println(contains);
		Object object = list.get(3);
		System.out.println(object);
		list.set(1, "kitkat");
		System.out.println(list);
		list.remove(3);
		java.util.List<Object>list1=new ArrayList<>();
		list1.add(list);
		System.out.println(list);
		System.out.println(list1);
		list1.clear();
		System.out.println(list1);
		boolean empty =list.isEmpty();
		System.out.println(empty);
        System.out.println();
        for (Object object2 : list) {
        	System.out.println(object2);
        	
			
		}
    	System.out.println(list);
    	System.out.println("*** forwarded******");
    	ListIterator<Object>listIterator=list.listIterator();
    	while (listIterator.hasNext()) {
			Object object2 = (Object) listIterator.next();
			System.out.println(object2);
			
			
			
		}
    	System.out.println("****backward****");
    	while (listIterator.hasPrevious()) {
			Object object2 = (Object) listIterator.previous();
			System.out.println(object2);
			
		}
    	
			
		}

		
		

	}


