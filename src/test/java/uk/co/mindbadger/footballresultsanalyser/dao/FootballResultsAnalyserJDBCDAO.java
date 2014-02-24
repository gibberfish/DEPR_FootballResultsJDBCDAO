package uk.co.mindbadger.footballresultsanalyser.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import uk.co.mindbadger.footballresultsanalyser.domain.Division;
import uk.co.mindbadger.footballresultsanalyser.domain.DomainObjectFactory;
import uk.co.mindbadger.footballresultsanalyser.domain.Fixture;
import uk.co.mindbadger.footballresultsanalyser.domain.Season;
import uk.co.mindbadger.footballresultsanalyser.domain.SeasonDivision;
import uk.co.mindbadger.footballresultsanalyser.domain.SeasonDivisionTeam;
import uk.co.mindbadger.footballresultsanalyser.domain.SeasonImpl;
import uk.co.mindbadger.footballresultsanalyser.domain.Team;

public class FootballResultsAnalyserJDBCDAO implements FootballResultsAnalyserDAO {

	Logger logger = Logger.getLogger(FootballResultsAnalyserJDBCDAO.class);
	
	private DomainObjectFactory domainObjectFactory;
	private DataSource dataSource;
	private Map<Thread, Connection> connections = new HashMap<Thread, Connection>();
	
	@Override
	public void startSession() {
		logger.debug("About to open a JDBC connection...");
		
		Connection connection;
		
		try {
			connection = dataSource.getConnection();
			logger.debug("Connection open, about to attach it to current thread: " + Thread.currentThread());
			
			connections.put(Thread.currentThread(), connection);
		} catch (SQLException e) {
			throw new RuntimeException (e);
		}
	}

	@Override
	public void closeSession() {
		logger.debug("About to close JDBC connection...");
		
		Connection connection = connections.get(Thread.currentThread());
		if (connection != null) {
			try {
					connection.close();
					logger.debug("JDBC connection closed, removing from connections list...");
					connections.remove(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Division addDivision(String divisionName) {
		Division division = domainObjectFactory.createDivision(divisionName);
		
		Connection connection = connections.get(Thread.currentThread());
		
		String sql = "INSERT INTO division (DIV_NAME) VALUES (?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	        ps.setString(1, divisionName);
	        ps.executeUpdate();
	        ResultSet results = ps.getGeneratedKeys();
	        results.next();
	        division.setDivisionId(results.getInt(1));
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		return division;
	}

	@Override
	public Fixture addFixture(Season season, Calendar fixtureDate, Division division, Team homeTeam, Team awayTeam, Integer homeGoals, Integer awayGoals) {
		
		return null;
	}

	@Override
	public Season addSeason(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team addTeam(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, Division> getAllDivisions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, Team> getAllTeams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<SeasonDivision> getDivisionsForSeason(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fixture> getFixturesForTeamInDivisionInSeason(int arg0,
			int arg1, int arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fixture> getFixturesWithNoFixtureDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Season getSeason(Integer arg0) {
		return null;
	}

	@Override
	public List<Season> getSeasons() {
		List<Season> seasons = new ArrayList<Season> ();
		
		Connection connection = connections.get(Thread.currentThread());
		
		String sql = "SELECT ssn_num FROM SEASON";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
	        ResultSet results = ps.executeQuery();
	        
	        while (results.next()) {
	        	Season season = new SeasonImpl ();
	        }
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		return seasons;
	}

	@Override
	public Set<SeasonDivisionTeam> getTeamsForDivisionInSeason(int arg0,
			int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fixture> getUnplayedFixturesBeforeToday() {
		// TODO Auto-generated method stub
		return null;
	}

	public DomainObjectFactory getDomainObjectFactory() {
		return domainObjectFactory;
	}

	public void setDomainObjectFactory(DomainObjectFactory domainObjectFactory) {
		this.domainObjectFactory = domainObjectFactory;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}
