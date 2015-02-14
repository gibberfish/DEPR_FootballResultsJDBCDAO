package uk.co.mindbadger.footballresultsanalyser.domain;

public class SeasonDivisionIdImpl implements SeasonDivisionId<Integer> {
	private static final long serialVersionUID = 3977933421261775703L;

	private SeasonDivisionImpl seasonDivisionImpl;
	
	public SeasonDivisionIdImpl (SeasonDivisionImpl seasonDivisionImpl) {
		this.seasonDivisionImpl = seasonDivisionImpl;
	}
	
	@Override
	public Division<Integer> getDivision() {
		return this.seasonDivisionImpl.getDivision();
	}

	@Override
	public Season<Integer> getSeason() {
		return this.seasonDivisionImpl.getSeason();
	}

	@Override
	public void setDivision(Division<Integer> division) {
		throw new IllegalArgumentException("You cannot change the Division");
	}

	@Override
	public void setSeason(Season<Integer> season) {
		throw new IllegalArgumentException("You cannot change the Season");
	}
}
