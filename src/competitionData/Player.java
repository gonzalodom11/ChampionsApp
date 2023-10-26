package competitionData;

public class Player {
	
	private String name;
	private Position position;
	private Team team;
	private String citizenship;
	private Integer rating;
	
	public Player(String name, Position position, Team team, String citizenship, Integer rating) {
		this.name = name;
		this.position = position;
		this.team = team;
		this.citizenship = citizenship;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	
	
	
	
	
	
	
}
