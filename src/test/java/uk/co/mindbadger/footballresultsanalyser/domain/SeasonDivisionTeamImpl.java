package uk.co.mindbadger.footballresultsanalyser.domain;

public class SeasonDivisionTeamImpl implements SeasonDivisionTeam {
	private static final long serialVersionUID = 8734891062572848257L;
	
	private SeasonDivisionTeamId seasonDivisionTeamId;
	private SeasonDivision seasonDivision;
	private Team team;
	
	public SeasonDivisionTeamImpl (SeasonDivision seasonDivision, Team team) {
		this.seasonDivision = seasonDivision;
		this.team = team;
	}
	
	@Override
	public SeasonDivisionTeamId getPrimaryKey() {
		return this.seasonDivisionTeamId;
	}

	@Override
	public SeasonDivision getSeasonDivision() {
		return this.seasonDivision;
	}

	@Override
	public Team getTeam() {
		return this.team;
	}

	@Override
	public void setPrimaryKey(SeasonDivisionTeamId seasonDivisionTeamId) {
		this.seasonDivisionTeamId = seasonDivisionTeamId;
	}

	@Override
	public void setSeasonDivision(SeasonDivision seasonDivision) {
		this.seasonDivision = seasonDivision;
	}

	@Override
	public void setTeam(Team team) {
		this.team = team;
	}
}
