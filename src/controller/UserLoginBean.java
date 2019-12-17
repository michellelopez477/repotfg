package controller;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class UserLoginBean {
	
	
	String login;
	String passwd;
	boolean logged = false;
	
	public UserLoginBean() {
		
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public boolean isLogged() {
		return logged;
	}
	public void setAsLogged(boolean logged) {
		this.logged = logged;
	}
	
	
	
	
	
	

}
