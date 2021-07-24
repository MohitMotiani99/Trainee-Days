package com.prac.exceptionpack;

public class InsufficientLeaveException extends Exception{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8182575636550729083L;
	private String msg;

	public InsufficientLeaveException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return msg;
	}
	
	
	
}
