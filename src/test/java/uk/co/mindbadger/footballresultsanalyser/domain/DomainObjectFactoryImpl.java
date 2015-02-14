package uk.co.mindbadger.footballresultsanalyser.domain;

public class DomainObjectFactoryImpl implements DomainObjectFactory<Integer> {

	@Override
	public Division<Integer> createDivision(String divisionName) {
		Division<Integer> division =  new DivisionImpl ();
		division.setDivisionName(divisionName);
		return division;
	}

	@Override
	public Fixture<Integer> createFixture(Season<Integer> season, Team<Integer> homeTeam, Team<Integer> awayTeam) {
		Fixture<Integer> fixture = new FixtureImpl ();
		fixture.setSeason(season);
		fixture.setHomeTeam(homeTeam);
		fixture.setAwayTeam(awayTeam);
		return fixture;
	}

	@Override
	public Season<Integer> createSeason(Integer seasonNumber) {
		Season<Integer> season = new SeasonImpl ();
		season.setSeasonNumber(seasonNumber);
		return season;
	}

	@Override
	public SeasonDivision<Integer> createSeasonDivision(Season<Integer> season, Division<Integer> division) {
		SeasonDivision<Integer> seasonDivision = new SeasonDivisionImpl (season, division);
		return seasonDivision;
	}

	@Override
	public SeasonDivisionId<Integer> createSeasonDivisionId(Season<Integer> arg0, Division<Integer> arg1) {
		throw new IllegalArgumentException("Can't implement a separate id for seasonDivision");
	}

	@Override
	public SeasonDivisionTeam<Integer> createSeasonDivisionTeam(SeasonDivision<Integer> seasonDivision, Team<Integer> team) {
		SeasonDivisionTeam<Integer> seasonDivisionTeam = new SeasonDivisionTeamImpl(seasonDivision, team);
		return seasonDivisionTeam;
	}

	@Override
	public SeasonDivisionTeamId<Integer> createSeasonDivisionTeamId(SeasonDivision<Integer> arg0, Team<Integer> arg1) {
		throw new IllegalArgumentException("Can't implement a separate id for seasonDivisionTeam");
	}

	@Override
	public Team<Integer> createTeam(String teamName) {
		Team<Integer> team = new TeamImpl ();
		team.setTeamName(teamName);
		return team;
	}
}
