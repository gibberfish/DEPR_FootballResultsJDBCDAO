package uk.co.mindbadger.footballresultsanalyser.domain;

public class SeasonDivisionTeamIdImpl implements SeasonDivisionTeamId {
	private static final long serialVersionUID = -7353557958085478618L;
	
	private SeasonDivisionTeam seasonDivisionTeam;
	
	public SeasonDivisionTeamIdImpl (SeasonDivisionTeam seasonDivisionTeam) {
		this.seasonDivisionTeam = seasonDivisionTeam;
	}
	
	@Override
	public SeasonDivision getSeasonDivision() {
		return this.seasonDivisionTeam.getSeasonDivision();
	}

	@Override
	public Team getTeam() {
		return this.seasonDivisionTeam.getTeam();
	}

	@Override
	public void setSeasonDivision(SeasonDivision seasonDivision) {
		throw new IllegalArgumentException("You cannot change the SeasonDivision");
	}

	@Override
	public void setTeam(Team team) {
		throw new IllegalArgumentException("You cannot change the Team");
	}

}
