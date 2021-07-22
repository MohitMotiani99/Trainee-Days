package com.prac;


import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Person {
	
	@NonNull private int pNum;
	@Getter private int totalScore=0;
	
	public int play() {
		totalScore= Dice.roll()+Dice.roll();
		return totalScore;
	}
	
	
}
