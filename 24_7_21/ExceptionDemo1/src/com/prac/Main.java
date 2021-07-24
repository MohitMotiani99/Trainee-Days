package com.prac;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res=0;
		
		try {
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		res=n1/n2;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("In Finally Block");
			System.out.println(res);
		}
		
		System.out.println("End");
	}

}
