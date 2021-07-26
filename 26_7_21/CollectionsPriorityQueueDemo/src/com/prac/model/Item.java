package com.prac.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Item implements Comparable<Item>{
	private int id;
	private String name;
	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return id-o.id;
	}
}
