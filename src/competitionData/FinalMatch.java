package competitionData;

import java.util.Random;

public class FinalMatch extends Match {
	
	private int t1Penalty;
	private int t2Penalty;
	
	
	public FinalMatch(Team t1, Team t2) {
		super(t1, t2);
		// TODO Auto-generated constructor stub
		this.t1Penalty = 0;
		this.t2Penalty = 0;
	}
	
	public void playMatch() {
		super.playMatch();
		
		if(this.score1==this.score2) {
			
			Random rn = new Random();
			int shots = rn.nextInt(3,11);
			computePenalties(shots);
		}
		this.toString();
	
	}
	
	

	@Override
	public String toString() {
		return "FinalMatch [t1Penalty=" + t1Penalty + ", t2Penalty=" + t2Penalty + ", score1=" + score1 + ", score2="
				+ score2 + ", getT1()=" + getT1() + ", getT2()=" + getT2() + "]";
	}

	private void computePenalties(int shots) {
		Random rn = new Random();
		if(shots>5) {
			while(Math.abs(this.t1Penalty - this.t2Penalty ) != 1 ) {
				this.setT1Penalty(rn.nextInt(6,11));
				this.setT2Penalty(rn.nextInt(6,11));
			}
		
			
		}
		else {
			if ( shots == 3) {
				while(Math.abs(this.t1Penalty - this.t2Penalty ) != 3 ) {
					this.setT1Penalty(rn.nextInt(0,3));
					this.setT2Penalty(rn.nextInt(0,3));
				}
			}
			else if(shots == 4) {
				while(Math.abs(this.t1Penalty - this.t2Penalty ) != 2) {
					this.setT1Penalty(rn.nextInt(2,4));
					this.setT2Penalty(rn.nextInt(2,4));
				}
			}
			else {
				while(Math.abs(this.t1Penalty - this.t2Penalty ) != 1) {
					this.setT1Penalty(rn.nextInt(3,5));
					this.setT2Penalty(rn.nextInt(3,5));
			}
			}
		}
	}

	public int getT1Penalty() {
		return t1Penalty;
	}

	public void setT1Penalty(int t1Penalty) {
		this.t1Penalty = t1Penalty;
	}

	public int getT2Penalty() {
		return t2Penalty;
	}

	public void setT2Penalty(int t2Penalty) {
		this.t2Penalty = t2Penalty;
	}
	
	
	

}
