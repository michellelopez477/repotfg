package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.DilbertSaysManager;

@ManagedBean
@SessionScoped
public class DilbertSaysController {


	@EJB 
	DilbertSaysManager dilbertsays;
	
	@ManagedProperty (value="#{userLoginBean}")
	UserLoginBean userLoginBean;
	
	public DilbertSaysController() {
		
	}

	
	public UserLoginBean getUserLoginBean() {
		return userLoginBean;
	}


	public void setUserLoginBean(UserLoginBean userLoginBean) {
		this.userLoginBean = userLoginBean;
	}

	public DilbertSaysManager getDilbertsays() {
		return dilbertsays;
	}

	public void setDilbertsays(DilbertSaysManager dilbertsays) {
		this.dilbertsays = dilbertsays;
	}
	
	public String getRandomSay() {
		return dilbertsays.getRandomSay();
	}
	
}