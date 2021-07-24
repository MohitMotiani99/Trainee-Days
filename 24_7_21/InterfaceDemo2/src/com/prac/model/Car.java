package com.prac.model;

public class Car extends Vehicle{
	
	private int maxSpeed;
	private String type;
	public Car(int regNo, String model, int currSpeed, int maxSpeed, String type) {
		super(regNo, model, currSpeed);
		this.maxSpeed = maxSpeed;
		this.type = type;
	}
	
	
	
	public int getMaxSpeed() {
		return maxSpeed;
	}



	@Override
	public int increaseSpeed(int n) {
		// TODO Auto-generated method stub
		if(currSpeed + n<maxSpeed) {
			currSpeed+=n;
			return currSpeed;
		}
		else
			return -1;
	}



	@Override
	public String toString() {
		return "Car [maxSpeed=" + maxSpeed + ", type=" + type + ", regNo=" + regNo + ", model=" + model + ", currSpeed="
				+ currSpeed + "]";
	}
	
	

}
