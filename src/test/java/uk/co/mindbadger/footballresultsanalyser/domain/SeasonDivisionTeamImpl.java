package uk.co.mindbadger.footballresultsanalyser.domain;

public class SeasonDivisionTeamImpl implements SeasonDivisionTeam<Integer> {
	private static final long serialVersionUID = 8734891062572848257L;
	
	private SeasonDivisionTeamId<Integer> seasonDivisionTeamId;
	private SeasonDivision<Integer> seasonDivision;
	private Team<Integer> team;
	
	public SeasonDivisionTeamImpl (SeasonDivision<Integer> seasonDivision, Team<Integer> team) {
		this.seasonDivision = seasonDivision;
		this.team = team;
	}
	
	@Override
	public SeasonDivisionTeamId<Integer> getPrimaryKey() {
		return this.seasonDivisionTeamId;
	}

	@Override
	public SeasonDivision<Integer> getSeasonDivision() {
		return this.seasonDivision;
	}

	@Override
	public Team<Integer> getTeam() {
		return this.team;
	}

	@Override
	public void setPrimaryKey(SeasonDivisionTeamId<Integer> seasonDivisionTeamId) {
		this.seasonDivisionTeamId = seasonDivisionTeamId;
	}

	@Override
	public void setSeasonDivision(SeasonDivision<Integer> seasonDivision) {
		this.seasonDivision = seasonDivision;
	}

	@Override
	public void setTeam(Team<Integer> team) {
		this.team = team;
	}
}
