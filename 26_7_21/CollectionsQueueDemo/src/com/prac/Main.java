package com.prac;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> q = new LinkedList<String>();
		
		q.add("java");
		q.add("js");
		q.add("c++");
		q.add("html");
		
		System.out.println(q);
		
		System.out.println("Element removed is: "+q.poll());
		System.out.println(q);
		
		System.out.println("Front element: "+q.peek());
		System.out.println(q);
		
		System.out.println("Element remove using remove is: "+q.remove());
		System.out.println(q);
		
		
		
	}

}
