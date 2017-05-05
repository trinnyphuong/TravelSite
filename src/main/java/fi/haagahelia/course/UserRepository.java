package fi.haagahelia.course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements IUserRepository {

	private JdbcOperations jdbc;

	//sql query 
	private static final String SQL_INSERT = "INSERT INTO User (loginId, password) values (?, ?)";
	private static final String SQL_INSERT_2 = "INSERT INTO Search (loginId, location) values(?, ?)";
	private static final String SQL_LOGIN = "SELECT * FROM User WHERE loginId = ?";
	private static final String SQL_FIND_ALL = "SELECT * FROM User ORDER BY loginId";
	private static final String SQL_FIND_ONE = "SELECT * FROM User WHERE loginId = ?";
	private static final String SQL_UPDATE = "UPDATE User SET password = ? WHERE loginId = ?";
	private static final String SQL_DELETE = "DELETE FROM User WHERE loginId = ?";
	private static final String SQL_RECENT = "SELECT * FROM Search WHERE loginId = ?";

	@Autowired
	public UserRepository(JdbcOperations jdbc) {
		this.jdbc = jdbc;
	}

	
	//save a user in the database
	@Override
	public User saveUser(User user) {
		
		if (jdbc.update(SQL_INSERT, user.getLoginId(), user.getPassword()) != 0) {
			return user;
		} else
			return null;
	}
	
	//save the recent searchs of a user in the database
	@Override
	public Search saveSearch(Search recentSearch) {
		
		if (jdbc.update(SQL_INSERT_2, recentSearch.getLoginId(), recentSearch.getLocation()) != 0) {
			return recentSearch;
		}
		else
			return null;
	}

	
	//check if a user is login or not
	@SuppressWarnings("finally")
	@Override
	public boolean loginUser(String loginId, String password) {
		boolean isLogin = false;
		try {
			User userFound = jdbc.queryForObject(SQL_LOGIN, new UserRowMapper(), loginId);
			if (userFound.getPassword().equals(password)) {
					isLogin = true;
					return isLogin;
				} else {
					isLogin = false;
					return isLogin;
				}
		}
		finally {
			if (isLogin == true) 
				return true;
			else return false;
		}

	}

	@Override
	public List<User> findAllUser() {
		return jdbc.query(SQL_FIND_ALL, new UserRowMapper());
	}

	@Override
	public int update(User user) {
		return jdbc.update(SQL_UPDATE, user.getPassword(), user.getLoginId());
	}

	@Override
	public int delete(User user) {
		return jdbc.update(SQL_DELETE, user.getLoginId());
	}

	
	//get the recent searchs of a user 
	@Override
	public ArrayList<String> getRecentSearch(String loginId) {
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<jdbc.query(SQL_RECENT, new SearchRowMapper(), loginId).size();i++){
			list.add(jdbc.query(SQL_RECENT, new SearchRowMapper(), loginId).get(i).getLocation());
		}
		return list;
	}

	
	//2 RowMappers (one for user table, one for search table)
	private static class UserRowMapper implements RowMapper<User> {
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new User(rs.getString("loginId"), rs.getString("password"));
		}
	}

	private static class SearchRowMapper implements RowMapper<Search> {
		public Search mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Search(rs.getInt("searchId"), rs.getString("loginId"), rs.getString("location"));
		}
	}



}
