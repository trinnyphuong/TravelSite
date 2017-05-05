package fi.haagahelia.course;

import java.util.ArrayList;
import java.util.List;

public interface IUserRepository {
	
	User saveUser(User user);
	
	Search saveSearch(Search recentSearch);
	
	boolean loginUser(String loginId, String password);
	
	List<User> findAllUser();
	
	int update(User user);
	
	int delete(User user);
	
	ArrayList<String> getRecentSearch(String loginId);
	
}
