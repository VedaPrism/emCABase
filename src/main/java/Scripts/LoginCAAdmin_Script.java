package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_LoginPage;

public class LoginCAAdmin_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(LoginCAAdmin_Script.class);

	@Test(dataProvider= "valid_loginCAAdmin",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=1,groups={"SMK","REG"})
	public void Login(Map hm) throws Exception{	
		
		//login
		String scriptName = hm.get("Script_Name").toString();
		String shtName="CredentialsCAAdmin";
		et =  es.startTest("valid Login as CAAdmin");
		log.info("this is login information");
		String uid = hm.get("Uname").toString();
		String pas = hm.get("Pwd").toString();
		pf_LoginPage pl = new pf_LoginPage(w);
		if(scriptName.equalsIgnoreCase("ValidLoginAdmin")) {
		//	et =  es.startTest("valid Login as CAAdmin");
			pl.logincredentials(uid,pas);
		}
	}

}
