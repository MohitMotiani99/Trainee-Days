package com.prac;

import java.util.ArrayList;
import java.util.Collections;

import com.prac.comparator.AgeComparator;
import com.prac.comparator.NameComparartor;
import com.prac.model.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> plist = new ArrayList<Person>();
		
		plist.add(new Person(1,"lark",90));
		plist.add(new Person(2,"shark",40));
		plist.add(new Person(0,"kark",10));
		
		System.out.println(plist);
		Collections.sort(plist,new AgeComparator());
		System.out.println(plist);
		Collections.sort(plist,new NameComparartor());
		System.out.println(plist);
	}

}
