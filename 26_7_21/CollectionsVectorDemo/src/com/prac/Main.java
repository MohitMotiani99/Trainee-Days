package com.prac;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v = new Vector<String>();
		v.add("ArrayList");
		v.add("LinkedList");
		v.add("Array");
		v.add("Vector");
		v.add("List");
		
		Enumeration<String> e = v.elements();
		
		while(e.hasMoreElements()) 
			System.out.print(e.nextElement()+"  ");
		System.out.println();
		System.out.println();
		
		for(int i=0;i<v.size();i++)
			System.out.print(v.get(i)+" ");
		System.out.println();
		System.out.println();
		
		Iterator<String> it = v.iterator();
		while(it.hasNext())
			System.out.print(it.next()+"  ");
		System.out.println();
		
	}

}
