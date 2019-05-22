package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_LoginPage;

public class LoginOperator_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(LoginOperator_Script.class);

	@Test(dataProvider= "valid_login",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=1,groups={"SMK","REG"})
	public void Login(Map hm) throws Exception{	
		
		//login
		String scriptName = hm.get("Script_Name").toString();
		et =  es.startTest("Login as Operator");
		log.info("this is login information");
		String uid = hm.get("Uname").toString();
		String pas = hm.get("Pwd").toString();
		pf_LoginPage pl = new pf_LoginPage(w);

		log.info("Username picked from Excel is "+uid);
		log.info("Username picked from Excel is "+pas);
		if(scriptName.equalsIgnoreCase("ValidLoginOperator")) {
		pl.logincredentials(uid,pas);
		}
		log.info("Logged in successfully");
	}


}
