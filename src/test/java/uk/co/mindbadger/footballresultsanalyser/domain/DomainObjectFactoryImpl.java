package uk.co.mindbadger.footballresultsanalyser.domain;

public class DomainObjectFactoryImpl implements DomainObjectFactory {

	@Override
	public Division createDivision(String divisionName) {
		Division division =  new DivisionImpl ();
		division.setDivisionName(divisionName);
		return division;
	}

	@Override
	public Fixture createFixture(Season season, Team homeTeam, Team awayTeam) {
		Fixture fixture = new FixtureImpl ();
		fixture.setSeason(season);
		fixture.setHomeTeam(homeTeam);
		fixture.setAwayTeam(awayTeam);
		return fixture;
	}

	@Override
	public Season createSeason(Integer seasonNumber) {
		Season season = new SeasonImpl ();
		season.setSeasonNumber(seasonNumber);
		return season;
	}

	@Override
	public SeasonDivision createSeasonDivision(Season season, Division division) {
		SeasonDivision seasonDivision = new SeasonDivisionImpl (season, division);
		return seasonDivision;
	}

	@Override
	public SeasonDivisionId createSeasonDivisionId(Season arg0, Division arg1) {
		throw new IllegalArgumentException("Can't implement a separate id for seasonDivision");
	}

	@Override
	public SeasonDivisionTeam createSeasonDivisionTeam(SeasonDivision seasonDivision, Team team) {
		SeasonDivisionTeam seasonDivisionTeam = new SeasonDivisionTeamImpl(seasonDivision, team);
		return seasonDivisionTeam;
	}

	@Override
	public SeasonDivisionTeamId createSeasonDivisionTeamId(SeasonDivision arg0, Team arg1) {
		throw new IllegalArgumentException("Can't implement a separate id for seasonDivisionTeam");
	}

	@Override
	public Team createTeam(String teamName) {
		Team team = new TeamImpl ();
		team.setTeamName(teamName);
		return team;
	}
}
