package com.prac;

import com.prac.model.Printable;
import com.prac.model.Showable;

public class Reports implements Printable,Showable{

	@Override
	public void show() {
		
		System.out.println("Welcome to Interface Method");
		System.out.println("Count value "+count);
		
	}

	@Override
	public void print() {
		
		System.out.println("Welcome to Java Interface......");
		
	}
	
}
