package team.telstra;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Attendance count of the stadium");
		int attendance=sc.nextInt();
		System.out.println("Enter the Playercount count of the Competition");
		int playerCount=sc.nextInt();
		
		System.out.println("Enter the Minimum Value for the Dice");
		int minValue=sc.nextInt();
		System.out.println("Enter the Maximum Value for the Dice");
		int maxValue=sc.nextInt();
		
		Stadium stad=new Stadium(attendance,playerCount,minValue,maxValue);
		System.out.println("Selected Players are: ");
		for(int pid:stad.generatePlayers())
			System.out.print(pid+" ");
		System.out.println();
		
		System.out.println("Scores for the Respective Selected Players are: ");
		for(int score:stad.play())
			System.out.print(score+" ");
		System.out.println();
		
		System.out.println("Winner of the Dice Competition is Player Number : "+stad.getWinner());
		
		sc.close();
		
		}

}
