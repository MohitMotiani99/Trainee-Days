package com.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Orange");
		l1.add("red");
		l1.add(1, "blue");
		
		System.out.println(l1);
		l1.addFirst("green");
		l1.addLast("yellow");
		
		ArrayList<String> sub = new ArrayList<String>();
		sub.add("purple");
		sub.add("maroon");
		
		l1.addAll(1, sub);
		System.out.println(l1);
		
		System.out.println("Is empty: "+l1.isEmpty());
		System.out.println("Contains Blue? "+ l1.contains("Blue"));
		
		ListIterator<String> it = l1.listIterator();
		while(it.hasNext())
			System.out.print(it.next()+"  ");
		it = l1.listIterator(l1.size());
		
		
		System.out.println();
		while(it.hasPrevious())
			System.out.print(it.previous()+"  ");
		System.out.println();
		
		Iterator<String> it2 = l1.listIterator();
		while(it2.hasNext())
			System.out.print(it2.next()+"  ");
		System.out.println();
		
		Collections.reverse(l1);
		System.out.println(l1);
		
		Collections.sort(l1);
		System.out.println(l1);
		
		Collections.shuffle(l1);
		System.out.println(l1);
		
	}

}
