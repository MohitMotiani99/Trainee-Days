package com.prac;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader rd = new Reader();
		//System.out.println(rd.readInput1());
		
		//System.out.println(rd.readInput2());
		
		try {
			System.out.println(rd.readInput3());
		} catch (NumberFormatException | ArithmeticException | IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Done");
		}
		
		System.out.println("END");
	}

}
