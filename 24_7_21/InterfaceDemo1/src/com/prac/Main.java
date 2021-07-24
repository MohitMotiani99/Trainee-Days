package com.prac;

import com.prac.model.Printable;
import com.prac.model.Showable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reports report = new Reports();
		report.print();
		report.show();
		
		Showable report1 = new Reports();
		report1.show();
		
		Printable report2= new Reports();
		report2.print();
		report2.show();
		
	}

}
