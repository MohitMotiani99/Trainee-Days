package team.telstra;

import java.util.Random;

public class Dice {
	
	private int faceValue;
	private int minValue=1;
	private int maxValue=6;

	public Dice(int faceValue,int minValue,int maxValue) {
		super();
		this.faceValue = faceValue;
		this.minValue=minValue;
		this.maxValue=maxValue;
	}

	public int getFaceValue() {
		return faceValue;
	}
		
	public int getMinValue() {
		return minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public int roll() {
		
		Random rand=new Random();
		
		this.faceValue=(int)rand.nextInt(maxValue-minValue)+minValue;
		return faceValue;
	}
	
}
