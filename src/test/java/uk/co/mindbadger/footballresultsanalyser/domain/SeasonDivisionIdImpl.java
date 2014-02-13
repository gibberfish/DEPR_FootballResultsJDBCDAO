package uk.co.mindbadger.footballresultsanalyser.domain;

public class SeasonDivisionIdImpl implements SeasonDivisionId {
	private static final long serialVersionUID = 3977933421261775703L;

	private SeasonDivisionImpl seasonDivisionImpl;
	
	public SeasonDivisionIdImpl (SeasonDivisionImpl seasonDivisionImpl) {
		this.seasonDivisionImpl = seasonDivisionImpl;
	}
	
	@Override
	public Division getDivision() {
		return this.seasonDivisionImpl.getDivision();
	}

	@Override
	public Season getSeason() {
		return this.seasonDivisionImpl.getSeason();
	}

	@Override
	public void setDivision(Division division) {
		throw new IllegalArgumentException("You cannot change the Division");
	}

	@Override
	public void setSeason(Season season) {
		throw new IllegalArgumentException("You cannot change the Season");
	}
}
