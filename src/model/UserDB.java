package model;

import java.util.Hashtable;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

@Singleton
public class UserDB {
	
	Hashtable<String, String> authorizedUsers = new Hashtable<String, String>(); 
	
	public UserDB () {
		
	}
	
	@PostConstruct
	private void init() {
		
		authorizedUsers.put("Michelle", "1234");
		authorizedUsers.put("Hanks", "1234");
		authorizedUsers.put("test1", "1114");
		
	}
	
	public Hashtable<String,String> getAuthorizedUsers() {
		
		return this.authorizedUsers;
		
		
	}
	
	public void setAuthorizedUsers(Hashtable<String, String> authorizedUsers){
		this.authorizedUsers = authorizedUsers;
	}

}
