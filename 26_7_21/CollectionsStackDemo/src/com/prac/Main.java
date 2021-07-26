package com.prac;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		
		Stack<String> st = new Stack<String>();
		st.push("aa");
		st.push("bb");
		st.push("cc");
		
		System.out.println(st);
		
		System.out.println(st.pop());
		System.out.println(st);
		
		System.out.println(st.peek());
		System.out.println(st);
		
		st.add("dd");
		st.add(1, "ee");
		System.out.println(st);
		st.remove(1);
		System.out.println(st);
		st.remove("bb");
		System.out.println(st);
		
		System.out.println(st.search("ee"));
		System.out.println(st.contains("aa"));
	}
}
