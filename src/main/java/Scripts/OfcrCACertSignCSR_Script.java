package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_OfcrCACertMangntPage;

public class OfcrCACertSignCSR_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(OfcrCACertSignCSR_Script.class);

	@Test(dataProvider= "caEnroll_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=3,groups={"SMK","REG"})
	public void caCertSignCSR(Map hm) throws Exception{
		String commonName = hm.get("Common_Name").toString();
		String scriptName = hm.get("Script_Name").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		pf_OfcrCACertMangntPage u = new pf_OfcrCACertMangntPage(w);
		if(scriptName.equalsIgnoreCase("InternalEnroll")) {	
			et =  es.startTest("CA Enroll-Internal-Root");
			u.signingCSR(commonName,aEmail,aPswrd);
		}
	}
}
