package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_admnPfleMngntCertPrflePage;

public class AdmnCertifctPrfleUser_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(AdmnCertifctPrfleUser_Script.class);

	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void prfleManagment() throws Exception{	
		pf_admnPfleMngntCertPrflePage c=new pf_admnPfleMngntCertPrflePage(w);
		et =  es.startTest("Profile Management");
		c.profileMngmtClick();
	}


	@Test(dataProvider= "certificatePrfle_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=2,groups={"SMK","REG"})
	public void certificateProfileCA(Map hm) throws Exception{	
		String scriptName = hm.get("Script_Name").toString();
		String shtName="certificateProfile";

		String pType = hm.get("Profile_Type").toString();
		String pName = hm.get("Profile_Name").toString();
		String vDay = hm.get("Validity_Days").toString();
		String vHours = hm.get("Validity_hours").toString();
		String vMin = hm.get("Validity_min").toString();
		String vSec = hm.get("Validity_sec").toString();
		String ICA = hm.get("Issuing_CA").toString();
		String signAlg = hm.get("Sign_Algo").toString();
		String OID = hm.get("Subject_OID").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();	
		pf_admnPfleMngntCertPrflePage c=new pf_admnPfleMngntCertPrflePage(w);
		if(scriptName.equalsIgnoreCase("certPrfleUser")) {
			et =  es.startTest("User profile under CA");
			c.createRootCert(pType,pName,vDay,vHours,vMin,vSec,ICA,signAlg,OID,aEmail,aPswrd,shtName,scriptName);

		}
	}

}
