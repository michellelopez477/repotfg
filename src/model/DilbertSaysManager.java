package model;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class DilbertSaysManager {
	
	@EJB 
	DilbertSaysDB dilbertsays;
	int random;
	public DilbertSaysManager() {
		
	}
	
	public String getRandomSay() {
		String dites[] = new String[5];
		
		dites = dilbertsays.getSays();
		
		this.random=(int)(Math.random()*4)+1;
		
		return dites[random];
	}
	

}
