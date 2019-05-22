package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_OfcrCACertMangntPage;

public class OfcrCACertEnrollCA_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(OfcrCACertEnrollCA_Script.class);
	
	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void caCertMangmt() throws Exception{
	
		pf_OfcrCACertMangntPage u = new pf_OfcrCACertMangntPage(w);
		et =  es.startTest("CA Certificate Management");
		u.caCertificateMngmnt();
	}
	
	@Test(dataProvider= "caEnroll_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=2,groups={"SMK","REG"})
	public void caEnrollCACert(Map hm) throws Exception{	

		String scriptName = hm.get("Script_Name").toString();
		
		String selectType = hm.get("Select_Type").toString();
		String certPrfle = hm.get("Cert_Profile").toString();
		String commonName = hm.get("Common_Name").toString();
		String country = hm.get("Country").toString();
		String houseIdentifr = hm.get("House_identifier").toString();
		String org = hm.get("Organisation").toString();
		String orgUnit = hm.get("Org_unit").toString();
		String postalCode = hm.get("Postl_Code").toString();
		String pseudonym = hm.get("pseudonym").toString();
		String serialNo = hm.get("Serial_Num").toString();	
		String state = hm.get("State").toString();
		String street = hm.get("Street").toString();
		String telNo = hm.get("Tel_Num").toString();
		String title = hm.get("Title").toString();
		String uniqueidentfr = hm.get("Unique_Identifier").toString();
		String oid = hm.get("2.4.5").toString();
		String keyAlgo = hm.get("KeyAlgo_size").toString();
		String keyPrfle = hm.get("Key_Profile").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		String shtName="OffCAEnroll";
		pf_OfcrCACertMangntPage u = new pf_OfcrCACertMangntPage(w);
		if(scriptName.equalsIgnoreCase("InternalEnrollCA")) {	
			et =  es.startTest("CA Enroll-Internal");
			u.caEnrollInternl(selectType,certPrfle,commonName,country,houseIdentifr,org,orgUnit,postalCode,pseudonym,serialNo,state,street,telNo,title,uniqueidentfr,oid,keyAlgo,keyPrfle,aEmail,aPswrd,shtName,scriptName);
		}
	}

}
