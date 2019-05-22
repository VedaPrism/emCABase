package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_OfcrCACertMangntPage;
import Page_Factory.pf_OfcrOCSPMangntPage;


public class OfcrCACertEnroll_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(OfcrCACertEnroll_Script.class);

	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void caCertMangmt() throws Exception{

		pf_OfcrCACertMangntPage u = new pf_OfcrCACertMangntPage(w);
		et =  es.startTest("CA Certificate Management");
		u.caCertificateMngmnt();
	}

	@Test(dataProvider= "CAEnrollErrCheck",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=2,groups={"SMK","REG"})
	public void errMsgCheck(Map hm) throws Exception{

		pf_OfcrCACertMangntPage err1 = new pf_OfcrCACertMangntPage(w);
		pf_OfcrOCSPMangntPage err=new pf_OfcrOCSPMangntPage(w);
		String scriptName = hm.get("Script_Name").toString();
		String certPrfle = hm.get("Certificate_Profile").toString();
		String shtName="CAEnrollErrCheck";
		if(scriptName.equalsIgnoreCase("certProfileError")) {
			err1.CertProfileErrorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("commonNameError")) {

			err.commonNameErrorCheck(certPrfle,shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("countryError")) {
			err.countryErrorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("HouseIdnfrError")) {
			err.HouseIdnfrErrorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("organizationError")) {
			err.organizationErrorCheck(shtName,scriptName);
		}		
		else if(scriptName.equalsIgnoreCase("organizationUnitError")) {
			err.organizationUnitErrorCheck(shtName,scriptName);
		}		
		else if(scriptName.equalsIgnoreCase("PostalCodeError")) {
			err.PostalCodeErrorCheck(shtName,scriptName);
		}		
		else if(scriptName.equalsIgnoreCase("pseudonymError")) {
			err.pseudonymErrorCheck(shtName,scriptName);
		}		
		else if(scriptName.equalsIgnoreCase("serialNumError")) {
			err.serialNumErrorCheck(shtName,scriptName);
		}	
		else if(scriptName.equalsIgnoreCase("stateError")) {
			err.stateErrorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("streetError")) {
			err.streetErrorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("TelNumError")) {
			err.TelNumErrorCheck(shtName,scriptName);
		}		
		else if(scriptName.equalsIgnoreCase("TitleError")) {
			err.titleErrorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("uniqueIdenfrError")) {
			err.uniqueIdenfrErrorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("keySizeError")) {
			err1.keySizeErrorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("keyProfileError")) {
			err.keyProfileErrorCheck(shtName,scriptName);
		}
	}

	@Test(dataProvider= "caEnroll_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=3,groups={"SMK","REG"})
	public void caEnroll(Map hm) throws Exception{	

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
		String signAlgo = hm.get("Sign_algo").toString();	
		String shtName="OffCAEnroll";
		pf_OfcrCACertMangntPage u = new pf_OfcrCACertMangntPage(w);
		if(scriptName.equalsIgnoreCase("InternalEnroll")) {	
			et =  es.startTest("CA Enroll-Internal-Root");
			u.caEnrollInternl(selectType,certPrfle,commonName,country,houseIdentifr,org,orgUnit,postalCode,pseudonym,serialNo,state,street,telNo,title,uniqueidentfr,oid,keyAlgo,keyPrfle,aEmail,aPswrd,shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("CSREnroll")) {	
			et =  es.startTest("CA Enroll-CSR");
			u.csr(selectType,commonName,country,houseIdentifr,org,orgUnit,postalCode,pseudonym,serialNo,state,street,telNo,title,uniqueidentfr,oid,keyAlgo,keyPrfle,aEmail,aPswrd,signAlgo,shtName,scriptName);
		}
	}

	@Test(dataProvider= "caEnroll_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=4,groups={"SMK","REG"})
	public void caCertSearch(Map hm) throws Exception{
		String commonName = hm.get("Common_Name").toString();
		String scriptName = hm.get("Script_Name").toString();
		pf_OfcrCACertMangntPage u = new pf_OfcrCACertMangntPage(w);
		if(scriptName.equalsIgnoreCase("InternalEnroll")) {	
			et =  es.startTest("CA Certificate");
			u.CACert(commonName);
		}
	}
	@Test(dataProvider= "caEnroll_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=5,groups={"SMK","REG"})
	public void caSearch(Map hm) throws Exception{
		String commonName = hm.get("Common_Name").toString();
		String scriptName = hm.get("Script_Name").toString();
		String srchBy = hm.get("SearchByMsg").toString();
		String srchFor = hm.get("SearchForMsg").toString();	
		pf_OfcrCACertMangntPage u = new pf_OfcrCACertMangntPage(w);
		if(scriptName.equalsIgnoreCase("SearchCACert")) {	
			et =  es.startTest("CA Cert Search");
			u.searchRootCert(commonName,srchBy,srchFor);
		}
	}
}

