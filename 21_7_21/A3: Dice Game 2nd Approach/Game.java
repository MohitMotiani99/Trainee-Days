/*
 
  Logic:-
  		
  		Players don't bring dice with themselves,its provided in the game,
  		thats why Dice has static members
  		
  		Made the players in game only, because then every time to make a new round 
  		of game new stadium had to be instantiated,didn't make much sense some times

*/


package com.prac;

import java.util.Random;
import java.util.Scanner;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Game {
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the audience count of the game: ");
		int attendance=sc.nextInt();
		System.out.println("Enter the Number of Players to Play: ");
		int playerCount=sc.nextInt();
		System.out.println("Enter the Minimum value of Dice: ");
		int minV=sc.nextInt();
		System.out.println("Enter the Maximum value of Dice: ");
		int maxV=sc.nextInt();
		
		Dice.setMinValue(minV);
		Dice.setMaxValue(maxV);
		
		int winner=-1,maxScore=0;
		for(int i=0;i<playerCount;i++) {
			Random rand =new Random();
			int num=rand.nextInt(attendance-1)+1;
			Person p=new Person(num);
			
			int score=p.play();
			System.out.println("Player Number: "+num+"     Score: "+score);
			
			if(maxScore<score) {
				maxScore=score;
				winner=num;
			}
		}
		
		System.out.println("Winner is Player Number: "+winner);
		
		sc.close();
	}
}
