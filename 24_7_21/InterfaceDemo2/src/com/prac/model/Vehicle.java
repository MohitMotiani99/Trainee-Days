package com.prac.model;

public abstract class Vehicle implements Automobile{
	
	protected int regNo;
	protected String model;
	protected int currSpeed;
	
	

	public Vehicle(int regNo, String model, int currSpeed) {
		super();
		this.regNo = regNo;
		this.model = model;
		this.currSpeed = currSpeed;
	}

	@Override
	public String start() {
		// TODO Auto-generated method stub
		return "Vehicle Started";
	}

	@Override
	public abstract int increaseSpeed(int n);

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return "Vehicle Stopped";
	}
	
}
