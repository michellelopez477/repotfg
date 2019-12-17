package model;

import javax.ejb.Singleton;

@Singleton
public class DilbertSaysDB {
	
	String says[] = new String[5] ;
	
	public DilbertSaysDB() {
		says[0]="Engineers like to solve problems. If there are no problems handily avialable, they will create their own problems";
		says[1]="An optimist is simply a pessimist with no job experience";
		says[2]="When did ignorance become a point of view?";
		says[3]=" Change is good. You go ﬁrst. ";
		says[4]=" I get mail; therefore I am.";
	}

	public String[] getSays() {
		return says;
	}


}
