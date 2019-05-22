package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_OfcrKeyRecoveryPage;

public class OfcrKeyRecovery_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(OfcrKeyRecovery_Script.class);

	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void keyMangmt() throws Exception{

		pf_OfcrKeyRecoveryPage u = new pf_OfcrKeyRecoveryPage(w);
		et =  es.startTest("Key Management");
		u.keyManagement();
	}

	@Test(dataProvider= "keyRecovery_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=2,groups={"SMK","REG"})
	public void keyRecovery(Map hm) throws Exception{
		String scriptName = hm.get("Script_Name").toString();
		String keyStorePw = hm.get("KeystoreNewPw").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		String shtName="keyRecovery";
		pf_OfcrKeyRecoveryPage u = new pf_OfcrKeyRecoveryPage(w);
		if(scriptName.equalsIgnoreCase("keyStoreNewPwCharacter")) {	
			et =  es.startTest("TC: 5305");
			u.keyStoreNewPwCharacter(keyStorePw);
		}
		else if(scriptName.equalsIgnoreCase("keyStoreNewPwSplChar")) {	
			et =  es.startTest("TC: 5306");
			u.keyStoreNewPwSplChar(keyStorePw);
		}
		else if(scriptName.equalsIgnoreCase("keyStoreNewPwNum")) {	
			et =  es.startTest("TC: 5307");
			u.keyStoreNewPwNum(keyStorePw);
		}
		else if(scriptName.equalsIgnoreCase("keyStoreNewPwAlphaNum")) {	
			et =  es.startTest("TC: 5308");
			u.keyStoreNewPwAlphaNum(keyStorePw);
		}
		else if(scriptName.equalsIgnoreCase("keyStoreNewPw")) {	
			et =  es.startTest("TC: 5309");
			u.keyStoreNewPw(keyStorePw,aEmail,aPswrd);
		}
		else if(scriptName.equalsIgnoreCase("InvalidFile")) {	
			et =  es.startTest("TC: 5310");
			u.InvalidFile(keyStorePw,scriptName,shtName);
		}
		else if(scriptName.equalsIgnoreCase("NewPwErr")) {	
			et =  es.startTest("Submit Without Password");
			u.submtWithoutPw(scriptName,shtName);
		}
		else if(scriptName.equalsIgnoreCase("UploadFileErr")) {	
			et =  es.startTest("Submit Without Password&File");
			u.submitWithoutfile(scriptName,shtName);
		}
		else if(scriptName.equalsIgnoreCase("AuthenticWithtEmailNPw")) {	
			et =  es.startTest("Authenticate btn Without Email & pwd");
			u.AuthenticWithtEmailNPw(keyStorePw,scriptName,shtName);
		}
		else if(scriptName.equalsIgnoreCase("RecvryBtnWithoutAuthentic")) {	
			et =  es.startTest("Recovery Btn without Authentication");
			u.RecvryBtnWithoutAuthentic(keyStorePw,scriptName,shtName);
		}
		
		else if(scriptName.equalsIgnoreCase("uploadCerFile")) {	
			et =  es.startTest("Upload cer File");
			u.uploadCerFile(keyStorePw,aEmail,aPswrd,scriptName,shtName);
		}


	}
	
	/*@Test(dataProvider= "keyRecovery_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=3,groups={"SMK","REG"})
	public void keyRecoveryOldPw(Map hm) throws Exception{
		String scriptName = hm.get("Script_Name").toString();
		String keyStorePw = hm.get("KeystoreNewPw").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		String shtName="keyRecovery";
		pf_OfcrKeyRecoveryPage u = new pf_OfcrKeyRecoveryPage(w);
		if(scriptName.equalsIgnoreCase("KeyStreOldPw")) {	
			et =  es.startTest("KeyStore old password");
			u.KeyStreOldPw(keyStorePw,scriptName,shtName);
		}
		
		else if(scriptName.equalsIgnoreCase("KeyStreOldPwInvalidFile")) {	
			et =  es.startTest("KeyStore OldPw Invalid file");
			u.KeyStreOldPwInvalidFile(keyStorePw,scriptName,shtName);
		}
		else if(scriptName.equalsIgnoreCase("KeyStreOldAuthenticWithtEmailNPw")) {	
			et =  es.startTest("KeyStre Oldpw-Authenticate btn Without Email & pwd");
			u.KeyStreOldAuthenticWithtEmailNPw(keyStorePw,scriptName,shtName);
		}
		else if(scriptName.equalsIgnoreCase("KeyStreOldRecvryBtnWithoutAuthentic")) {	
			et =  es.startTest("KeyStre Oldpw-Recovery Btn without Authentication");
			u.RecvryBtnWithoutAuthentic(keyStorePw,scriptName,shtName);
		}
		else if(scriptName.equalsIgnoreCase("KeyStreOldPwvalidFile")) {	
			et =  es.startTest("KeyStore OldPw valid file");
			u.KeyStreOldPwvalidFile(keyStorePw,aEmail,aPswrd,scriptName,shtName);
		}
	}*/
}
