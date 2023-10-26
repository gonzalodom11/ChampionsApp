package test;

import java.util.List;

import competitionData.ChampionsLeague;
import competitionData.FinalMatch;
import competitionData.Team;
import competitionData.Tournament;

public class ChampionsTest {
	public static void main(String[] args) {
		
		ChampionsLeagueSimulator();
		
	}
	
	public static void ChampionsLeagueSimulator() {
		Team t1 = new Team("Toulouse F.C", "France");
		Team t2 = new Team("Real Madrid", "Spain");
		Team t3 = new Team("Chelsea", "England");
		Team t4 = new Team("A.S. Roma", "Italy");
		Team t5 = new Team("Union Berlin", "Germany");
		Team t6 = new Team("Porto", "Portugal");
		Team t7 = new Team("Celtic", "Scotland");
		Team t8 = new Team("Lazio", "Italy");
		Team t9 = new Team("AC Milan", "Italy");
		Team t10 = new Team("Betis Balonpie", "Spain");
		Team t11 = new Team("Málaga F.C", "Spain");
		Team t12 = new Team("Nottingham Forest", "England");
		Team t13 = new Team("F.C. Barcelona", "Spain");
		Team t14 = new Team("Bayern Munich", "Germany");
		Team t15 = new Team("Galatasaray", "Turkey");
		Team t16 = new Team("Lens", "France");
		Team t17 = new Team("Arsenal", "England");
		Team t18 = new Team("Napoli", "Italy");
		Team t19 = new Team("Real Sociedad", "Spain");
		Team t20 = new Team("Inter Milano", "Italy");
		Team t21 = new Team("Feyenoord", "Netherlands");
		Team t22 = new Team("Atletico Madrid", "Spain");
		Team t23 = new Team("PSG", "France");
		Team t24 = new Team("Newcastle", "England");
		Team t25 = new Team("RB Leipzig", "Germany");
		Team t26 = new Team("Manchester City", "England");
		Team t27 = new Team("Manchester United", "England");
		Team t28 = new Team("Copenhaguen", "Denmark");
		Team t29 = new Team("Sevilla", "Spain");
		Team t30 = new Team("PSV", "Netherlands");
		Team t31 = new Team("Union Berlin", "Germany");
		Team t32 = new Team("Benfica","Portugal");
		
		
		
		ChampionsLeague tr = new ChampionsLeague("Champions League 2024",List.of(t1, t2, t3, t4, t5, t6,
											   t7, t8, t9, t10, t11, t12,t13, t14,
											   t15, t16, t17, t18, t19, t20, t21, t22,
											   t23, t24, t25, t26, t27, t28, t29, t30,
											   t31, t32));
		
		
		tr.showGroups();
		
	}
	
	
	public void tournamentSimulator() {
				//tr.createMatch();
				//tr.getMatches().stream().forEach(x -> x.playMatch());
				//tr.getClassification();
				//tr.playFinal();
	}
	
	
}
