package uk.co.mindbadger.footballresultsanalyser.domain;

import java.util.Calendar;

public class FixtureImpl implements Fixture<Integer> {
	private static final long serialVersionUID = -4023266982899204217L;
	
	private Integer fixtureId;
	private Calendar fixtureDate;
	private Season<Integer> season;
	private Division<Integer> division;
	private Team<Integer> homeTeam;
	private Team<Integer> awayTeam;
	private Integer homeGoals;
	private Integer awayGoals;
	
	@Override
	public Integer getAwayGoals() {
		return this.awayGoals;
	}

	@Override
	public Team<Integer> getAwayTeam() {
		return this.awayTeam;
	}

	@Override
	public Division<Integer> getDivision() {
		return this.division;
	}

	@Override
	public Calendar getFixtureDate() {
		return this.fixtureDate;
	}

	@Override
	public Integer getFixtureId() {
		return this.fixtureId;
	}

	@Override
	public Integer getHomeGoals() {
		return this.homeGoals;
	}

	@Override
	public Team<Integer> getHomeTeam() {
		return this.homeTeam;
	}

	@Override
	public Season<Integer> getSeason() {
		return this.season;
	}

	@Override
	public void setAwayGoals(Integer arg0) {
		this.awayGoals = arg0;
	}

	@Override
	public void setAwayTeam(Team<Integer> arg0) {
		this.awayTeam = arg0;
	}

	@Override
	public void setDivision(Division<Integer> arg0) {
		this.division = arg0;
	}

	@Override
	public void setFixtureDate(Calendar arg0) {
		this.fixtureDate = arg0;
	}

	@Override
	public void setFixtureId(Integer arg0) {
		this.fixtureId = arg0;
	}

	@Override
	public void setHomeGoals(Integer arg0) {
		this.homeGoals = arg0;
	}

	@Override
	public void setHomeTeam(Team<Integer> arg0) {
		this.homeTeam = arg0;
	}

	@Override
	public void setSeason(Season<Integer> arg0) {
		this.season = arg0;
	}
}
