package com.prac.mainpack;

import com.prac.model.Car;

public class LongDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car(1947,"Q3",20,120,"Sedan");
		
		System.out.println(car.start());
		
		if(car.increaseSpeed(90)==-1)
			System.out.println("Alert....Stop the car!!");
		else
			System.out.println("Enjoy u ride");
		
		System.out.println(car.stop());
		
	}

}
