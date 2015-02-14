package uk.co.mindbadger.footballresultsanalyser.domain;

public class SeasonDivisionTeamIdImpl implements SeasonDivisionTeamId<Integer> {
	private static final long serialVersionUID = -7353557958085478618L;
	
	private SeasonDivisionTeam<Integer> seasonDivisionTeam;
	
	public SeasonDivisionTeamIdImpl (SeasonDivisionTeam<Integer> seasonDivisionTeam) {
		this.seasonDivisionTeam = seasonDivisionTeam;
	}
	
	@Override
	public SeasonDivision<Integer> getSeasonDivision() {
		return this.seasonDivisionTeam.getSeasonDivision();
	}

	@Override
	public Team<Integer> getTeam() {
		return this.seasonDivisionTeam.getTeam();
	}

	@Override
	public void setSeasonDivision(SeasonDivision<Integer> seasonDivision) {
		throw new IllegalArgumentException("You cannot change the SeasonDivision");
	}

	@Override
	public void setTeam(Team<Integer> team) {
		throw new IllegalArgumentException("You cannot change the Team");
	}

}
