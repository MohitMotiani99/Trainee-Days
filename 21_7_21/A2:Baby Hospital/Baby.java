package com.telstra;

import java.util.Random;

@SuppressWarnings("unused")
public class Baby {
	private int regNum;
	private double weight;
	private String color;
	private String breathingEffort;
	private int heartRate;
	
	private static int reg;
	static {
		reg=0;
	}
	private static int getregNum() {
		Random rand=new Random();
		reg=rand.nextInt(10000)+1;
		return reg;
	}
	
	public Baby( double weight, String color, String breathingEffort, int heartRate) {
		super();
		this.regNum = getregNum();
		this.weight = weight;
		this.color = color;
		this.breathingEffort = breathingEffort;
		this.heartRate = heartRate;
	}

	public int getRegNum() {
		return regNum;
	}

	public double getWeight() {
		return weight;
	}

	public String getColor() {
		return color;
	}

	public String getBreathingEffort() {
		return breathingEffort;
	}

	public int getHeartRate() {
		return heartRate;
	}
	
	public String reportBaby() {
		
		if(weight<2.2)
			return "Under Nourished";
		else if(weight>4.2)
			return "Over Nourished";
		else {
			if(color.equals("Blue"))
				return "Under Nourished";
			else {
				if(breathingEffort.equals("Absent"))
					return "Severe";
				else if(breathingEffort.equals("Weak"))
					return "Under Nourished";
				else if(breathingEffort.equals("Good")) {
					if(heartRate<40)
						return "Severe";
					else if(heartRate>40 && heartRate<100)
						return "Under Nourished";
					else
						return "Good Health";
				}
			}
		}
		
		return "";
	}

	@Override
	public String toString() {
		return "Baby [regNum=" + regNum + ", weight=" + weight + ", color=" + color + ", breathingEffort="
				+ breathingEffort + ", heartRate=" + heartRate + ", Baby Health= " + this.reportBaby() + "]";
	}
	
	
	
	
}
