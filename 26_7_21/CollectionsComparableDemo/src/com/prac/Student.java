package com.prac;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int marks;
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		if(id<o.id)
			return -1;
		else if(id>o.id)
			return 1;
		else {
			if(marks<o.marks)
				return -1;
			else if(marks>o.marks)
				return 1;
			else 
				return name.compareTo(o.name);
				
		}
	}
}
