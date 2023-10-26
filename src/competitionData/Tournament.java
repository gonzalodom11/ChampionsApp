package competitionData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tournament {
	private String name;
	private List<Team> teams = new ArrayList<>();
	private Set<Match> matches;
	
	
	
	
	public Tournament(String name, List<Team> teams) {
		this.name = name;
		this.teams = teams;
		this.matches = new HashSet<Match>();
	}
	
	
	public void createMatch() {
		for(Team t : this.teams) {
			for (Team t2 : this.teams) {
				if(!(t.equals(t2))) {
					this.matches.add(new Match(t,t2));
				}
			}
		}
	}
	
	public List<Team> getClassification(){
		List<Team>res = this.teams.stream().sorted((t1, t2) -> t2.getPoints().compareTo(t1.getPoints()))
				.toList();
		 res.stream().forEach(x -> {
			 System.out.println(x);
		 });
		 return res;
	}
	
	public Integer getNumberMatches(Team t) {
		
		return (int) this.matches.stream().filter(x -> x.getT1().equals(t) || x.getT2().equals(t)).count();
		
		
	}
	
	public void playFinal() {
		if(this.matches.isEmpty()) {
			System.out.println("League hasn't started yet.");
		}
		else {
			List<Team> ranking = this.getClassification();
			Match finalMatch = new FinalMatch(ranking.get(0), ranking.get(1));
			finalMatch.playMatch();
			System.out.println("\n"+finalMatch);
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Tournament [name=" + name + ", teams=" + teams + "]";
	}


	public List<Team> getTeams() {
		return teams;
	}
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	public Set<Match> getMatches() {
		return matches;
	}
	public void setMatches(Set<Match> matches) {
		this.matches = matches;
	}
	
	
	
}
