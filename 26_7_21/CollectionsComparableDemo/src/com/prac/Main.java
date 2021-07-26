package com.prac;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> slist = new ArrayList<Student>();
		
		slist.add(new Student(100,"kark",34));
		slist.add(new Student(100,"jark",12));
		slist.add(new Student(150,"uark",80));
		slist.add(new Student(90,"fark",55));
		
		System.out.println(slist);
		Collections.sort(slist);
		System.out.println(slist);
		
	}

}
