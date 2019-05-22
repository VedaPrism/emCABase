package Scripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_LoginPage;

public class Logout_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(Logout_Script.class);
	
	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void Logout() throws Exception{	
		
		//logout
		
		et =  es.startTest("Logout");
		
		pf_LoginPage pl = new pf_LoginPage(w);

		pl.logout();
	}
		
		

}
