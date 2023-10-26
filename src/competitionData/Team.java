package competitionData;

import java.util.Objects;

public class Team {
	private String name;
	private String citizenship;
	private Integer points;
	
	
	public Team(String name, String citizenship) {
	    
		this.name = name;
	    this.citizenship = citizenship;
	    this.points = 0;
	    
	    
	}
	
	


	@Override
	public int hashCode() {
		return Objects.hash(citizenship, name);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		return Objects.equals(citizenship, other.citizenship) && Objects.equals(name, other.name);
	}











	@Override
	public String toString() {
		return "Team [name=" + name + ", points=" + points + "]";
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}
	
	
	
	
}
