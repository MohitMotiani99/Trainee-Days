package team.telstra;

import java.util.Random;

public class Stadium {

	
	private int attendance;
	private int playerCount;
	private Player[] players;
	private int[] scores;
	private int minV,maxV;
	

	public Stadium(int attendance, int playerCount,int minV,int maxV) {
		super();
		this.attendance = attendance;
		this.playerCount = playerCount;
		this.players=new Player[playerCount];
		this.scores=new int[playerCount];
		this.minV=minV;
		this.maxV=maxV;
	}
	public int[] generatePlayers() {
		Random rand=new Random();
		int[] pids=new int[playerCount];
		
		for(int i=0;i<playerCount;i++) {
			int num=rand.nextInt(attendance-1)+1;
			players[i]=new Player(num,minV,maxV);
			pids[i]=num;
		}
		
		return pids;
		
	}
	public int[] play() {
		for(int i=0;i<playerCount;i++)
			scores[i]=players[i].play();
		return scores;
	}
	
	public int getWinner() {
		int maxScore=0;
		int winnerNum=0;
		for(int i=0;i<playerCount;i++) {
			if(maxScore<scores[i]) {
				maxScore=scores[i];
				winnerNum=players[i].getpNum();
			}
		}
		
		return winnerNum;
	}
	
	
}
