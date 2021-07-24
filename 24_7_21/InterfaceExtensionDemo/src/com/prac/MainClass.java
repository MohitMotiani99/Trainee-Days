package com.prac;

import com.prac.model.SubInterface;

public class MainClass implements SubInterface{

	@Override
	public void mainMethod() {
		// TODO Auto-generated method stub
		System.out.println("Main Inteface Method");
		
	}

	@Override
	public void subMethod() {
		// TODO Auto-generated method stub
		System.out.println("Sub Interface Method");
	}
	
}
