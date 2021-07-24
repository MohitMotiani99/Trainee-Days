package com.prac.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8171917547872824044L;
	private int sId;
	private String sName;
	private int sAge;
	
}
