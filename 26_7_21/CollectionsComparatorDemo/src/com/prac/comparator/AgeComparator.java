package com.prac.comparator;

import java.util.Comparator;

import com.prac.model.Person;

public class AgeComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		
		if(o1.getAge()<o2.getAge())
			return -1;
		if(o1.getAge()>o1.getAge())
			return 1;
		
		return 0;
	}
	
	
}
