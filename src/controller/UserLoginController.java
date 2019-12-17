package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import model.UserManager;

@ManagedBean
public class UserLoginController {
	
	private static final String s1 = "USER_NOT_EXIST";
	
	@ManagedProperty(value="#{userLoginBean}")
	UserLoginBean userLoginBean;

	@EJB
	UserManager usermanager;
	
	public UserLoginController() {
		
	}
	
	
	public UserLoginBean getUserLoginBean() {
		return userLoginBean;
	}


	public void setUserLoginBean(UserLoginBean userloginbean) {
		this.userLoginBean = userloginbean;
	}

	public static String getS1() {
		return s1;
	}
	

	public UserManager getUsermanager() {
		return usermanager;
	}

	public void setUsermanager(UserManager usermanager) {
		this.usermanager = usermanager;
	}

	public String verifyUser() {
		if (usermanager.isARegisteredUser(userLoginBean.login, userLoginBean.passwd)) {
			userLoginBean.logged = true;
			return "Welcome.xhtml";
		}else  {
			return "index.xhtml";
		}
		
	}
	

	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		userLoginBean.setAsLogged(false);
		return "index.xhtml";
	}

}
