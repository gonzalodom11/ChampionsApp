package competitionData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ChampionsLeague extends Tournament {
	
	Map<String, List<Team>> groups;
	
	
	
	public ChampionsLeague(String name, List<Team> teams) {
		super(name, teams);
		if(teams.size()!=32) {
			throw new IllegalArgumentException("32 team are needed to play this tournament");
		}
		this.groups = new HashMap<String, List<Team>>();
		drawGroups(teams);
		// TODO Auto-generated constructor stub
		
	}

	
	
	
	
	
	public void drawGroups(List<Team> teams) {
		
		List<String> groupNames = List.of("A", "B", "C", "D",
									  	  "E", "F", "G", "H");
		
		List<Team> teams2 = new ArrayList<>();
		for(Team t : teams) {
			teams2.add(t);
		}
		
		Collections.shuffle(teams2);
		//,Collections.shuffle(teams);
		
		int index = 0;
		for (String g : groupNames) {
			List<Team> teamsAux = new ArrayList<>();
			while(teamsAux.size()!=4) {
				teamsAux.add(teams2.get(index));
				index ++;
			}
			this.groups.put(g, teamsAux);
			
		}
				
	}

	public Map<String, List<Team>> getGroups() {
		return groups;
	}

	public void setGroups(Map<String, List<Team>> groups) {
		this.groups = groups;
	}

	public void showGroups() {
		if(this.groups != null) {
			for(String s : this.groups.keySet()) {
				System.out.println("Group "+s+": "+this.groups.get(s));
			}
		}
	}
	
}
