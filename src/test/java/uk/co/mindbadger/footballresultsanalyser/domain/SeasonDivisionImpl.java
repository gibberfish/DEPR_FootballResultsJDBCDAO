package uk.co.mindbadger.footballresultsanalyser.domain;

import java.util.Set;

public class SeasonDivisionImpl implements SeasonDivision {
	private static final long serialVersionUID = -3421868798331099955L;

	private Set<SeasonDivisionTeam> teamsInSeasonDivision;
	private Season season;
	private Division division;
	private SeasonDivisionId seasonDivisionId;
	private int divisionPosition;
	
	public SeasonDivisionImpl (Season season, Division division) {
		this.season = season;
		this.division = division;
		this.seasonDivisionId = new SeasonDivisionIdImpl (this);
	}
	
	@Override
	public Division getDivision() {
		return this.division;
	}

	@Override
	public Season getSeason() {
		return this.season;
	}

	@Override
	public void setDivision(Division division) {
		this.division = division;
	}

	@Override
	public void setSeason(Season season) {
		this.season = season;
	}

	@Override
	public int getDivisionPosition() {
		return this.divisionPosition;
	}

	@Override
	public SeasonDivisionId getPrimaryKey() {
		return this.seasonDivisionId;
	}

	@Override
	public Set<SeasonDivisionTeam> getTeamsInSeasonDivision() {
		return this.teamsInSeasonDivision;
	}

	@Override
	public void setDivisionPosition(int divisionPosition) {
		this.divisionPosition = divisionPosition;
	}

	@Override
	public void setPrimaryKey(SeasonDivisionId seasonDivisionId) {
		this.seasonDivisionId = seasonDivisionId;
	}

	@Override
	public void setTeamsInSeasonDivision(Set<SeasonDivisionTeam> teamsInSeasonDivision) {
		this.teamsInSeasonDivision = teamsInSeasonDivision;
	}
}
