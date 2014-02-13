package uk.co.mindbadger.footballresultsanalyser.domain;

import java.util.Set;

public class DivisionImpl implements Division {
	private static final long serialVersionUID = 4238358515209754464L;

	private Integer divisionId;
	private String divisionName;
	private Set<SeasonDivision> seasonsForDivision;
	
	@Override
	public Integer getDivisionId() {
		return this.divisionId;
	}

	@Override
	public String getDivisionName() {
		return this.divisionName;
	}

	@Override
	public Set<SeasonDivision> getSeasonsForDivision() {
		return this.seasonsForDivision;
	}

	@Override
	public void setDivisionId(Integer divisionId) {
		this.divisionId = divisionId;
	}

	@Override
	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	@Override
	public void setSeasonsForDivision(Set<SeasonDivision> seasonsForDivision) {
		this.seasonsForDivision = seasonsForDivision;
	}
}
