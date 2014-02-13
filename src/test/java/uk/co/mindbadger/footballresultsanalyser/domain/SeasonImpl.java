package uk.co.mindbadger.footballresultsanalyser.domain;

import java.util.Set;

public class SeasonImpl implements Season {
	private static final long serialVersionUID = -8796053571421819221L;
	
	private Set<SeasonDivision> divisionsInSeason;
	private Integer seasonNumber;
	
	@Override
	public Set<SeasonDivision> getDivisionsInSeason() {
		return this.divisionsInSeason;
	}

	@Override
	public Integer getSeasonNumber() {
		return this.seasonNumber;
	}

	@Override
	public void setDivisionsInSeason(Set<SeasonDivision> divisionsInSeason) {
		this.divisionsInSeason = divisionsInSeason;
	}

	@Override
	public void setSeasonNumber(Integer seasonNumber) {
		this.seasonNumber = seasonNumber;
	}

}
