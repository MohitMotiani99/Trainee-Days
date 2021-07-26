package com.prac.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Person {
	private int id;
	private String name;
	private int age;
}
