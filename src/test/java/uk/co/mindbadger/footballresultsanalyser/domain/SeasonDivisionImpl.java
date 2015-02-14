package uk.co.mindbadger.footballresultsanalyser.domain;

import java.util.Set;

public class SeasonDivisionImpl implements SeasonDivision<Integer> {
	private static final long serialVersionUID = -3421868798331099955L;

	private Set<SeasonDivisionTeam<Integer>> teamsInSeasonDivision;
	private Season<Integer> season;
	private Division<Integer> division;
	private SeasonDivisionId<Integer> seasonDivisionId;
	private int divisionPosition;
	
	public SeasonDivisionImpl (Season<Integer> season, Division<Integer> division) {
		this.season = season;
		this.division = division;
		this.seasonDivisionId = new SeasonDivisionIdImpl (this);
	}
	
	@Override
	public Division<Integer> getDivision() {
		return this.division;
	}

	@Override
	public Season<Integer> getSeason() {
		return this.season;
	}

	@Override
	public void setDivision(Division<Integer> division) {
		this.division = division;
	}

	@Override
	public void setSeason(Season<Integer> season) {
		this.season = season;
	}

	@Override
	public int getDivisionPosition() {
		return this.divisionPosition;
	}

	@Override
	public SeasonDivisionId<Integer> getPrimaryKey() {
		return this.seasonDivisionId;
	}

	@Override
	public Set<SeasonDivisionTeam<Integer>> getTeamsInSeasonDivision() {
		return this.teamsInSeasonDivision;
	}

	@Override
	public void setDivisionPosition(int divisionPosition) {
		this.divisionPosition = divisionPosition;
	}

	@Override
	public void setPrimaryKey(SeasonDivisionId<Integer> seasonDivisionId) {
		this.seasonDivisionId = seasonDivisionId;
	}

	@Override
	public void setTeamsInSeasonDivision(Set<SeasonDivisionTeam<Integer>> teamsInSeasonDivision) {
		this.teamsInSeasonDivision = teamsInSeasonDivision;
	}
}
