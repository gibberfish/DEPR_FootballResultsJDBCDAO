package uk.co.mindbadger.footballresultsanalyser.domain;

import java.util.Calendar;

public class FixtureImpl implements Fixture {
	private static final long serialVersionUID = -4023266982899204217L;
	
	private Integer fixtureId;
	private Calendar fixtureDate;
	private Season season;
	private Division division;
	private Team homeTeam;
	private Team awayTeam;
	private Integer homeGoals;
	private Integer awayGoals;
	
	@Override
	public Integer getAwayGoals() {
		return this.awayGoals;
	}

	@Override
	public Team getAwayTeam() {
		return this.awayTeam;
	}

	@Override
	public Division getDivision() {
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
	public Team getHomeTeam() {
		return this.homeTeam;
	}

	@Override
	public Season getSeason() {
		return this.season;
	}

	@Override
	public void setAwayGoals(Integer arg0) {
		this.awayGoals = arg0;
	}

	@Override
	public void setAwayTeam(Team arg0) {
		this.awayTeam = arg0;
	}

	@Override
	public void setDivision(Division arg0) {
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
	public void setHomeTeam(Team arg0) {
		this.homeTeam = arg0;
	}

	@Override
	public void setSeason(Season arg0) {
		this.season = arg0;
	}
}
