package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_OfcCertCRLMngntPage;
import Page_Factory.pf_OfcrUserCertMangntPage;

public class OfcrUserCertEnroll_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(OfcrCACertEnrollCA_Script.class);

	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void caCertMangmt() throws Exception{

		pf_OfcrUserCertMangntPage u = new pf_OfcrUserCertMangntPage(w);
		et =  es.startTest("User Certificate Management");
		u.userCertificateMngmnt();
	}

	/*@Test(dataProvider= "userEnroll_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=2,groups={"SMK","REG"})
	public void userCertEnroll(Map hm) throws Exception{	

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
		String keyStore = hm.get("KeyStore_Type").toString();
		String password = hm.get("Password").toString();
		String cPassword = hm.get("Confrm_Password").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		String shtName="OffUserEnroll";
		pf_OfcrUserCertMangntPage u = new pf_OfcrUserCertMangntPage(w);
		if(scriptName.equalsIgnoreCase("UserEnrollSftToken")) {	
			et =  es.startTest("User Cert Enroll-SftTkn");
			u.userEnrollSftToken(selectType,certPrfle,commonName,country,houseIdentifr,org,orgUnit,postalCode,pseudonym,serialNo,state,street,telNo,title,uniqueidentfr,oid,keyAlgo,keyStore,password,cPassword,aEmail,aPswrd,shtName,scriptName);
		}
	}

	@Test(dataProvider= "userEnroll_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=3,groups={"SMK","REG"})
	public void userCertEnrollHrdTkn(Map hm) throws Exception{	

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
		String keyStore = hm.get("KeyStore_Type").toString();
		String password = hm.get("Password").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		String shtName="OffUserEnroll";
		pf_OfcrUserCertMangntPage u = new pf_OfcrUserCertMangntPage(w);
		if(scriptName.equalsIgnoreCase("UserEnrollHrdToken")) {	
			et =  es.startTest("User Cert Enroll-HrdTkn");
			u.userEnrollHrdToken(selectType,certPrfle,commonName,country,houseIdentifr,org,orgUnit,postalCode,pseudonym,serialNo,state,street,telNo,title,uniqueidentfr,oid,keyAlgo,keyStore,password,aEmail,aPswrd,shtName,scriptName);
		}
	}
	
	@Test(dataProvider= "userEnroll_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=4,groups={"SMK","REG"})
	public void userCertSearch(Map hm) throws Exception{
		String commonName = hm.get("Common_Name").toString();

		pf_OfcrUserCertMangntPage u = new pf_OfcrUserCertMangntPage(w);
		et =  es.startTest("Search for user Cert");
		u.searchUserCert(commonName);

	}*/

	/*@Test(dataProvider= "userEnroll_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=5,groups={"SMK","REG"})
	public void crlManagment(Map hm) throws Exception{
		String commonName = hm.get("Common_Name").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		pf_OfcCertCRLMngntPage u = new pf_OfcCertCRLMngntPage(w);
		u.certCRLManagement();

		u.activateCRL(commonName,aEmail,aPswrd);

	}*/
	@Test(enabled=true,priority=6,groups={"SMK","REG"})
	public void crlManagment() throws Exception{
		
		pf_OfcCertCRLMngntPage u = new pf_OfcCertCRLMngntPage(w);
		et =  es.startTest("CRL Management");
		u.certCRLManagement();

	}

	@Test(dataProvider= "caEnroll_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=7,groups={"SMK","REG"})
	public void actvecrlManagment(Map hm) throws Exception{

		String commonName = hm.get("Common_Name").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		pf_OfcCertCRLMngntPage u = new pf_OfcCertCRLMngntPage(w);	
		
		String scriptName = hm.get("Script_Name").toString();
		if(scriptName.equalsIgnoreCase("InternalEnrollCA")) {
			et =  es.startTest("Activate CRL");
		u.activateCRL(commonName,aEmail,aPswrd);
		}
	}

	@Test(dataProvider= "userEnroll_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=8,groups={"SMK","REG"})
	public void userCertRevoke(Map hm) throws Exception{

		pf_OfcrUserCertMangntPage u = new pf_OfcrUserCertMangntPage(w);
		u.userCertificateMngmnt();
		String commonName = hm.get("Common_Name").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		//		pf_OfcrUserCertMangntPage u = new pf_OfcrUserCertMangntPage(w);
		et =  es.startTest("User Cert revocation");
		u.userCertRevocation(commonName,aEmail,aPswrd);

	}

}
