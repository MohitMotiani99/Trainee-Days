package com.prac.emppack;

import com.prac.exceptionpack.InsufficientLeaveException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee(1000,10);
		
		try {
			System.out.println(employee.applyLeave(8));
		} catch (InsufficientLeaveException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
