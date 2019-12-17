package model;

import java.util.Hashtable;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class UserManager {
	
	@EJB 
	UserDB userdb;
	
	public UserManager() {
		
	}
	
	public Boolean isARegisteredUser(String login, String passwd) {
		Hashtable<String, String> loggin = new Hashtable<String, String>();
		loggin = userdb.getAuthorizedUsers();
		
		if (loggin.containsKey(login)) {
			if (loggin.contains(passwd)) {
				return true;
			}
			return false;
		}
		return false;	
	}

	public UserDB getUserdb() {
		return userdb;
	}

	public void setUserdb(UserDB userdb) {
		this.userdb = userdb;
	}
	

}
