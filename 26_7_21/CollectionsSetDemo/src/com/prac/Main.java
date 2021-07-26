package com.prac;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.prac.model.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s = new HashSet();
		s.add(1);
		s.add("aa");
		s.add(12.5);
		s.add(null);
		s.add("12.5");
		
		System.out.println(s);
		
		System.out.println("HashSet");
		Set<String> s1 = new HashSet<String>();
		s1.add("aa");
		s1.add("yy");
		s1.add("pp");
		s1.add("zz");
		
		System.out.println(s1);
		
		System.out.println("LinkedHashSet");
		Set<String> s2 = new LinkedHashSet<String>();
		s2.add("aa");
		s2.add("yy");
		s2.add("zz");
		s2.add("pp");
		
		System.out.println(s2);
		
		System.out.println("TreeSet");
		Set<String> s3 = new TreeSet<String>();
		s3.add("aa");
		s3.add("yy");
		s3.add("zz");
		s3.add("pp");
		
		System.out.println(s3);
		
		Set<Person> s4 = new HashSet<Person>();
		s4.add(new Person(10,22));
		s4.add(new Person(10,22));
		s4.add(new Person(12,24));
		System.out.println(s4);
		
		
	}

}
