package com.prac;

import java.util.Random;

import lombok.Data;

public @Data class Dice {
	
	private static int faceValue;
	private static int minValue;
	private static int maxValue;
	
	static {
		faceValue=0;
		minValue=0;
		maxValue=0;
	}
	
	public static void setMinValue(int minV) {
		minValue=minV;
	}
	
	public static void setMaxValue(int maxV) {
		maxValue=maxV;
	}
	
	public static int roll() {
		Random rand = new Random();
		faceValue=rand.nextInt(maxValue-minValue)+minValue;
		return faceValue;
	}
}
