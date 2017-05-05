package fi.haagahelia.course;

import java.util.ArrayList;
import java.util.List;

public interface UserManager {
	
	public User saveUser(String loginId, String password);
	
	public Search saveSearch(String loginId, String location);
	
	public boolean loginUser(String loginId, String password);
	
	public List<User> findAllUser();
	
	public boolean findByLoginId(String loginId);
	
	public int update(User user);
	
	public int delete(User user);
	
	public ArrayList<String> getRecentSearch(String loginId);
	
}

