package uk.co.mindbadger.footballresultsanalyser.domain;

public class TeamImpl implements Team {

	private Integer teamId;
	private String teamName;
	private String teamShortName;
	
	@Override
	public Integer getTeamId() {
		return this.teamId;
	}

	@Override
	public String getTeamName() {
		return this.teamName;
	}

	@Override
	public String getTeamShortName() {
		return this.teamShortName;
	}

	@Override
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	@Override
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public void setTeamShortName(String teamShortName) {
		this.teamShortName = teamShortName;
	}
}
