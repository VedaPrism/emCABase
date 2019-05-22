package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_LoginPage;

public class LoginCaAdministrator_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(LoginCaAdministrator_Script.class);

	@Test(dataProvider= "valid_loginCAAdmin",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=1,groups={"SMK","REG"})
	public void Login(Map hm) throws Exception{	
		
		//login
		String scriptName = hm.get("Script_Name").toString();
		String shtName="CredentialsCAAdmin";
		log.info("this is login information");
		String uid = hm.get("Uname").toString();
		String pas = hm.get("Pwd").toString();
		pf_LoginPage pl = new pf_LoginPage(w);

		if(scriptName.equalsIgnoreCase("LoginWithoutEmail")) {
			et =  es.startTest("Email Err Check");
			pl.loginWthOutEmail(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("LoginWithoutPIN")) {
			et =  es.startTest("PIN Err Check");
			pl.loginWthOutPIN(shtName,scriptName);
		}
		
		else if(scriptName.equalsIgnoreCase("LoginWithInvalidEmail")) {
			et =  es.startTest("Login with InvalidEmail");
			pl.loginWthinvdEmail(uid,pas,shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("LoginWithInvalidPIN")) {
			et =  es.startTest("Login with InvalidPIN");
			pl.loginWthinvdPIN(uid,pas,shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("ValidLoginAdmin")) {
			et =  es.startTest("Valid Login");
			pl.logincredentials(uid,pas);
		}
		
	
		
		
		
		
		
		
		

	}

}
