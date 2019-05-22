package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_CreateUserPage;
import Page_Factory.pf_OfcrCACertMangntPage;
import Page_Factory.pf_OfcrOCSPMangntPage;

public class OfcrOCSPMangnt_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(OfcrCACertEnrollCA_Script.class);
	
	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void OSCPMangment() throws Exception{
	
		pf_OfcrOCSPMangntPage u = new pf_OfcrOCSPMangntPage(w);
		et =  es.startTest("OCSP Management");
		u.oscpManagement();
	}
	
	@Test(dataProvider= "manageOSCPErrCheck",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=2,groups={"SMK","REG"})
	public void NewOSCPMangment(Map hm) throws Exception{
	
		pf_OfcrOCSPMangntPage err = new pf_OfcrOCSPMangntPage(w);
		String scriptName = hm.get("Script_Name").toString();
		String certPrfle = hm.get("Certificate_Profile").toString();
		String shtName="OffOCSPErrCheck";
		if(scriptName.equalsIgnoreCase("certProfileError")) {
			err.CertProfileErrorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("commonNameError")) {
			System.out.println(scriptName);
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
			err.keySizeErrorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("keyProfileError")) {
			err.keyProfileErrorCheck(shtName,scriptName);
		}
	}
	
	@Test(dataProvider= "manageOSCP_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=3,groups={"SMK","REG"})
	public void manageOscp(Map hm) throws Exception{	

		String scriptName = hm.get("Script_Name").toString();
		
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
		String keyStore = hm.get("Key_Profile").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		String shtName="OffOSCPMnge";
		pf_OfcrOCSPMangntPage u = new pf_OfcrOCSPMangntPage(w);	
		if(scriptName.equalsIgnoreCase("manageOCSPAuthentic")) {	
			et =  es.startTest("Manage OCSP-New btn Authentic check ");
			u.manageOCSPAuthentic(certPrfle,commonName,country,houseIdentifr,org,orgUnit,postalCode,pseudonym,serialNo,state,street,telNo,title,uniqueidentfr,oid,keyAlgo,keyStore,aEmail,aPswrd,shtName,scriptName);
		}
		if(scriptName.equalsIgnoreCase("manageOCSPwithoutAutnctn")) {	
			et =  es.startTest("Manage OCSP-New btn without Authentic check  ");
			u.manageOCSPwithoutAutnctn(shtName,scriptName);
		}
		if(scriptName.equalsIgnoreCase("manageOCSP")) {	
			et =  es.startTest("Manage OCSP-New btn ");
			u.mngeOSCP(certPrfle,commonName,country,houseIdentifr,org,orgUnit,postalCode,pseudonym,serialNo,state,street,telNo,title,uniqueidentfr,oid,keyAlgo,keyStore,aEmail,aPswrd,shtName,scriptName);
		}
	}
	
	@Test(dataProvider= "manageOSCP_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=4,groups={"SMK","REG"})
	public void searchOscp(Map hm) throws Exception{
		String scriptName = hm.get("Script_Name").toString();
		String commonName = hm.get("Common_Name").toString();
		pf_OfcrOCSPMangntPage u = new pf_OfcrOCSPMangntPage(w);
		if(scriptName.equalsIgnoreCase("searchOCSP")) {	
			et =  es.startTest("Search OCSP");
		u.searchOSCP(commonName);
		}
	}
	
	@Test(dataProvider= "manageOSCP_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=5,groups={"SMK","REG"})
	public void configreOscp(Map hm) throws Exception{	
		String scriptName = hm.get("Script_Name").toString();
		String rCA = hm.get("Registered_CA").toString();
		String commonName = hm.get("Common_Name").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		String shtName="OffOSCPMnge";
		pf_OfcrOCSPMangntPage u = new pf_OfcrOCSPMangntPage(w);

		if(scriptName.equalsIgnoreCase("regCAErrCheck")) {	
			et =  es.startTest("Configure OCSP-Rgr CA err Check");
			u.regCAErrCheck(shtName,scriptName);
			}
		else if(scriptName.equalsIgnoreCase("OCSPURLErrCheck")) {
			et =  es.startTest("Configure OCSP-OCSP URl err Check");
			u.OCSPURLErrCheck(shtName,scriptName);
			}
		else if(scriptName.equalsIgnoreCase("OCSPCertErrChck")) {
			et =  es.startTest("Configure OCSP-OCSP Cert err Check");
			u.OCSPCertErrChck(shtName,scriptName);
			}
		else if(scriptName.equalsIgnoreCase("configureOCSP")) {
			et =  es.startTest("Configure OCSP");
		u.configureOSCP(rCA,commonName,aEmail,aPswrd);
		}
	}
	
	@Test(enabled=true,priority=6,groups={"SMK","REG"})
	public void OCSPExprtExcl() throws Exception{
	
		pf_OfcrOCSPMangntPage u = new pf_OfcrOCSPMangntPage(w);
		et =  es.startTest("Export To Excel");
		u.exportToExcel();
	}
}
