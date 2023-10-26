package competitionData;

import java.util.List;
import java.util.Random;

public class Match {
	private Team t1;
	private Team t2;
	protected Integer score1;
	protected Integer score2;
	
	
	public Match(Team t1, Team t2) {
		this.t1 = t1;
		this.t2 = t2;
		
		
		
	}
	
	
	
	public Match(Team t1, Team t2, Integer score1, Integer score2) {
		this.t1 = t1;
		this.t2 = t2;
		this.score1 = score1;
		this.score2 = score2;
	}


	public void playMatch() {
		Random n = new Random();
		this.score1 = n.nextInt(0,5);
		this.score2	= n.nextInt(0,5);
		
		if(this.score1 > this.score2) {
			t1.setPoints(t1.getPoints()+3);
		}
		else if (this.score2 > this.score1) {
			t2.setPoints(t2.getPoints()+3);
		}
		else {
			t1.setPoints(t1.getPoints()+1);t2.setPoints(t2.getPoints()+1);
		}
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Match [t1=" + t1 + ", t2=" + t2 + ", score1=" + score1 + ", score2=" + score2 + "]\n";
	}



	public Team getT1() {
		return t1;
	}


	public void setT1(Team t1) {
		this.t1 = t1;
	}





	public Team getT2() {
		return t2;
	}





	public void setT2(Team t2) {
		this.t2 = t2;
	}





	public Integer getScore1() {
		return score1;
	}





	public void setScore1(Integer score1) {
		this.score1 = score1;
	}





	public Integer getScore2() {
		return score2;
	}





	public void setScore2(Integer score2) {
		this.score2 = score2;
	}



	
}
