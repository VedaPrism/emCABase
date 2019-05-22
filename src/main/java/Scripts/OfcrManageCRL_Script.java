package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_OfcCertCRLMngntPage;


public class OfcrManageCRL_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(OfcrManageCRL_Script.class);

	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void caCertMangmt() throws Exception{

		pf_OfcCertCRLMngntPage u = new pf_OfcCertCRLMngntPage(w);
		et =  es.startTest("CERT/CRL Management");
		u.certCRLManagement();
	}

	@Test(priority=2,groups={"SMK","REG"})
	public void searchCRLCheck() throws Exception{
//		String scriptName = hm.get("Script_Name").toString();
//		String keyStorePw = hm.get("KeystoreNewPw").toString();
//		String aEmail = hm.get("Authentic_email").toString();
//		String aPswrd = hm.get("Authentic_tPswrd").toString();
//		String shtName="keyRecovery";
		pf_OfcCertCRLMngntPage u = new pf_OfcCertCRLMngntPage(w);
		u.searchCRL();
	}
}
