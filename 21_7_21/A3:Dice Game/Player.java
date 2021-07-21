package team.telstra;

public class Player {
	
	private int pNum;
	private Dice d;
	private int d1Score,d2Score;
	
	public Player(int pNum,int minV,int maxV) {
		this.pNum=pNum;
		d=new Dice(0,minV,maxV);
	}
	
	public int play() {
		d1Score=d.roll();
		d2Score=d.roll();
		return d1Score+d2Score;
	}
	
	public int getD1Score() {
		return d1Score;
	}

	public int getD2Score() {
		return d2Score;
	}
	
	public int getpNum() {
		return pNum;
	}
	
	public int totalScore() {
		return d1Score+d2Score;
	}

		
	
}
