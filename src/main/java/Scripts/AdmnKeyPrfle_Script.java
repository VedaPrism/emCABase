package Scripts;


import java.io.File;
import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Generic_Library.Utility;
import Page_Factory.pf_admnPfleMngntKeyPrflePage;

public class AdmnKeyPrfle_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(AdmnKeyPrfle_Script.class);

	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void keyProfile() throws Exception{
		pf_admnPfleMngntKeyPrflePage c=new pf_admnPfleMngntKeyPrflePage(w);
		et =  es.startTest("Key Profile");
		c.keyProfile();
		
	}
	@Test(dataProvider= "keyPrfleHrdToken_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=2,groups={"SMK","REG"})
	public void keyProfilehrdTkn(Map hm) throws Exception{	
		String scriptName = hm.get("Script_Name").toString();
		String shtName="keyProfileHardTkn";		
		String pName = hm.get("Profile_Name").toString();
		String pType = hm.get("Profile_Type").toString();
		String hsmPwd = hm.get("HSMPassword").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		pf_admnPfleMngntKeyPrflePage c=new pf_admnPfleMngntKeyPrflePage(w);
		if(scriptName.equalsIgnoreCase("prflenameErrCheck")) {
			et =  es.startTest("Profile Name error Check");
			c.prflenameErrCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("prfleTypeErrCheck")) {
			et =  es.startTest("Profile Type error Check");
			c.prfleTypeErrCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("uploadFileErrCheck")) {
			et =  es.startTest("Upload file error Check");
			c.uploadFileErrCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("keyProfileHardToken")) {
			String path=Utility.getpropertydetails("HardTokenKeyProfile");
			et =  es.startTest("Key Profile-HardToken");
			c.keyPrfleHardTknType(pName,pType,hsmPwd,path,aEmail,aPswrd,shtName,scriptName);
		}
	}
	
	@Test(dataProvider= "keyPrfleHSM_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=3,groups={"SMK","REG"})
	public void keyProfileHSM(Map hm) throws Exception{	
		String scriptName = hm.get("Script_Name").toString();
		String shtName="keyProfileHSM";		
		String pName = hm.get("Profile_Name").toString();
		String pType = hm.get("Profile_Type").toString();
		String hsmPwd = hm.get("HSMPassword").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		pf_admnPfleMngntKeyPrflePage c=new pf_admnPfleMngntKeyPrflePage(w);
		if(scriptName.equalsIgnoreCase("keyProfileHSM")) {
			String path=Utility.getpropertydetails("keyProfileHSM");
			et =  es.startTest("Key Profile-HSM");
			c.keyPrfleHardTknType(pName,pType,hsmPwd,path,aEmail,aPswrd,shtName,scriptName);
		}
	}

	@Test(enabled=true,priority=4,groups={"SMK","REG"})
	public void keyProfileExprtExcel() throws Exception{
		pf_admnPfleMngntKeyPrflePage c=new pf_admnPfleMngntKeyPrflePage(w);
		et =  es.startTest("Key Profile-Export Excel");
		c.exptToExcel();
		
	}
}
