package com.prac.emppack;

import com.prac.exceptionpack.InsufficientLeaveException;

public class Employee {
	
	private int empId;
	private int balanceLeave;
	public Employee(int empId, int balanceLeave) {
		super();
		this.empId = empId;
		this.balanceLeave = balanceLeave;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", balanceLeave=" + balanceLeave + "]";
	}
	
	public String applyLeave(int appliedLeave) throws InsufficientLeaveException {
		if(balanceLeave<appliedLeave)
			throw new InsufficientLeaveException("Leave not sanctioned");
		else {
			balanceLeave-=appliedLeave;
			return "Leave Sanctioned";
		}
	}
	
}
