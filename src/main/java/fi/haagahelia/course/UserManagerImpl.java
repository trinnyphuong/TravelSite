package fi.haagahelia.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserManagerImpl implements UserManager{

	@Autowired
	private IUserRepository repo;
	
	//save a user with its loginId and password
	@Override
	public User saveUser(String loginId, String password) {
		System.out.println(password);
		User userAccount = repo.saveUser(new User(loginId, password));
		return userAccount;
	}
	
	//save a recent search of a user
	@Override
	public Search saveSearch(String loginId, String location) {
		System.out.println(location);
		Search recentSearch = repo.saveSearch(new Search(loginId, location));
		return recentSearch;
	}

	//check if a user is login or not
	@Override
	public boolean loginUser(String loginId, String password) {
		if (repo.loginUser(loginId, password) == true){
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public List<User> findAllUser() {
		return repo.findAllUser();
	}

	@Override
	public int update(User user) {
		return repo.update(user);
	}

	@Override
	public int delete(User user) {
		return repo.delete(user);
	}

	//get all the recent searchs of a user
	@Override
	public ArrayList<String> getRecentSearch(String loginId) {
		return repo.getRecentSearch(loginId);
	}

	@Override
	public boolean findByLoginId(String loginId) {
		for(User u: findAllUser()) {
			if (u.getLoginId().equalsIgnoreCase(loginId)) {
				return false;
			}
		}
		return true;
	}

	

}
