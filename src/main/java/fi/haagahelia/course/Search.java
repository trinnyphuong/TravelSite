package fi.haagahelia.course;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Search extends User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int searchId;
	private String location; 

	public Search() {

	}

	public Search(int searchId, String loginId, String location) {
		super(loginId);
		this.searchId = searchId;
		this.location = location;
	}
	
	public Search(String loginId, String location) {
		super(loginId);
		this.location = location;
	}

	public int getSearchId() {
		return searchId;
	}

	public void setSearchId(int searchId) {
		this.searchId = searchId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
