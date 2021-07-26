package com.prac.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Customer implements Comparable<Customer>{
	
	private int id;
	private String name;
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
}
