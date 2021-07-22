package team.telstra;

import java.util.Random;

public class Stadium {

	
	@SuppressWarnings("unused")
	private int attendance;
	private int playerCount;
	private Player[] players;
	private int[] scores;
	

	public Stadium(int attendance, int playerCount,int minV,int maxV) {
		super();
		this.attendance = attendance;
		this.playerCount = playerCount;
		this.players=new Player[playerCount];

		Random rand=new Random();

		for(int i=0;i<playerCount;i++) {
			int num=rand.nextInt(attendance-1)+1;
			players[i]=new Player(num,minV,maxV);
		}
		
		this.scores=new int[playerCount];
		
	}
	public int[] generatePlayers() {
		int[] pids=new int[playerCount];
		for(int i=0;i<playerCount;i++) {
			pids[i]=players[i].getpNum();
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
