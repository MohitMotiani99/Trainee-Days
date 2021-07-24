package com.prac;

import com.prac.model.MainInterface;
import com.prac.model.SubInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass mainClass = new MainClass();
		mainClass.mainMethod();
		mainClass.subMethod();
		
		SubInterface sub = new MainClass();
		sub.mainMethod();
		sub.subMethod();
		
		MainInterface main = new MainClass();
		main.mainMethod();
	}

}
