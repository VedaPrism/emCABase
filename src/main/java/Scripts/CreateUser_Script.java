package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_CreateUserPage;

public class CreateUser_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(CreateUser_Script.class);

	@Test(dataProvider= "createUserErrMsg_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=1,groups={"SMK","REG"})
	public void crteUserErrorMsgCheck(Map hm) throws Exception{	

		//et =  es.startTest("Create User Error Message Check");
		String scriptName = hm.get("Script_Name").toString();
		String shtName="createUserErrMsg";
		pf_CreateUserPage err = new pf_CreateUserPage(w);
		if(scriptName.equalsIgnoreCase("commonNameError")) {
			err.commonNameErrorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("emailError")) {
			err.emailErrorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("organizationError")) {
			err.organizationErrorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("countryError")) {
			err.countryErrorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("roleError")) {
			err.roleErrorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("tokenPwdError")) {
			err.tokenPwdErrorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("signatureAlgError")) {
			err.signatureAlgErrorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("keySizeError")) {
			err.keySizeErrorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("validity_error")) {
			err.validity_errorCheck(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("issuerTokenPwdError")) {
			err.issuerTokenPwdErrorCheck(shtName,scriptName);
		}
	}
	
	
	
	@Test(dataProvider= "createOfcr_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=2,groups={"SMK","REG"})
	public void crteUserOfficer(Map hm) throws Exception{	
		String scriptName = hm.get("Script_Name").toString();
		String cName = hm.get("common_name").toString();
		String email = hm.get("Email").toString();
		String orgName = hm.get("Org_name").toString();
		String telNo = hm.get("Telphone_No").toString();
		String city = hm.get("Locality").toString();
		String state = hm.get("State").toString();
		String Zip = hm.get("Zip").toString();
		String country = hm.get("Country").toString();
		String role = hm.get("Role").toString();
		String tPswd = hm.get("Token_pswd").toString();
		String signAlgo = hm.get("Sign_algorithm").toString();
		String keyAlgo = hm.get("KeyAlgorithmSize").toString();
		String vDay = hm.get("Validity_Days").toString();
		String vHours = hm.get("Validity_hours").toString();
		String vMin = hm.get("Validity_min").toString();
		String vSec = hm.get("Validity_sec").toString();
		String IssurTknPswd = hm.get("IssuerToken_Pswd").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		String shtName="createOfficer";
		pf_CreateUserPage err = new pf_CreateUserPage(w);
		if(scriptName.equalsIgnoreCase("createOfficer")) {
			et =  es.startTest("Create Officer Check");
			err.createUser(cName,email,orgName,telNo,city,state,Zip,country,role,tPswd,signAlgo,keyAlgo,vDay,vHours,vMin,vSec,IssurTknPswd,aEmail,aPswrd,shtName,scriptName);
		}
	}

	@Test(dataProvider= "createAuditr_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=3,groups={"SMK","REG"})
	public void crteUserAuditor(Map hm) throws Exception{	
		String scriptName = hm.get("Script_Name").toString();
		String cName = hm.get("common_name").toString();
		String email = hm.get("Email").toString();
		String orgName = hm.get("Org_name").toString();
		String telNo = hm.get("Telphone_No").toString();
		String city = hm.get("Locality").toString();
		String state = hm.get("State").toString();
		String Zip = hm.get("Zip").toString();
		String country = hm.get("Country").toString();
		String role = hm.get("Role").toString();
		String tPswd = hm.get("Token_pswd").toString();
		String signAlgo = hm.get("Sign_algorithm").toString();
		String keyAlgo = hm.get("KeyAlgorithmSize").toString();
		String vDay = hm.get("Validity_Days").toString();
		String vHours = hm.get("Validity_hours").toString();
		String vMin = hm.get("Validity_min").toString();
		String vSec = hm.get("Validity_sec").toString();
		String IssurTknPswd = hm.get("IssuerToken_Pswd").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		String shtName="createAuditor";
		pf_CreateUserPage err = new pf_CreateUserPage(w);
		 if(scriptName.equalsIgnoreCase("createAuditor")) {
			 et =  es.startTest("Create Auditor Check");
				err.createUser(cName,email,orgName,telNo,city,state,Zip,country,role,tPswd,signAlgo,keyAlgo,vDay,vHours,vMin,vSec,IssurTknPswd,aEmail,aPswrd,shtName,scriptName);
			}
	}
	
	@Test(dataProvider= "createOperator_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=4,groups={"SMK","REG"})
	public void crteUserOperator(Map hm) throws Exception{	
		String scriptName = hm.get("Script_Name").toString();
		String cName = hm.get("common_name").toString();
		String email = hm.get("Email").toString();
		String orgName = hm.get("Org_name").toString();
		String telNo = hm.get("Telphone_No").toString();
		String city = hm.get("Locality").toString();
		String state = hm.get("State").toString();
		String Zip = hm.get("Zip").toString();
		String country = hm.get("Country").toString();
		String role = hm.get("Role").toString();
		String tPswd = hm.get("Token_pswd").toString();
		String signAlgo = hm.get("Sign_algorithm").toString();
		String keyAlgo = hm.get("KeyAlgorithmSize").toString();
		String vDay = hm.get("Validity_Days").toString();
		String vHours = hm.get("Validity_hours").toString();
		String vMin = hm.get("Validity_min").toString();
		String vSec = hm.get("Validity_sec").toString();
		String IssurTknPswd = hm.get("IssuerToken_Pswd").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		String shtName="createOperator";
		pf_CreateUserPage err = new pf_CreateUserPage(w);
		 if(scriptName.equalsIgnoreCase("createOperator")) {
			 et =  es.startTest("Create Operator Check");
				err.createUser(cName,email,orgName,telNo,city,state,Zip,country,role,tPswd,signAlgo,keyAlgo,vDay,vHours,vMin,vSec,IssurTknPswd,aEmail,aPswrd,shtName,scriptName);
			}
	}

	@Test(dataProvider= "createUserNegtve_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=5,groups={"SMK","REG"})
	public void crteUserNegative(Map hm) throws Exception{	
		String scriptName = hm.get("Script_Name").toString();
		String cName = hm.get("common_name").toString();
		String email = hm.get("Email").toString();
		String orgName = hm.get("Org_name").toString();
		String telNo = hm.get("Telphone_No").toString();
		String city = hm.get("Locality").toString();
		String state = hm.get("State").toString();
		String Zip = hm.get("Zip").toString();
		String country = hm.get("Country").toString();
		String role = hm.get("Role").toString();
		String tPswd = hm.get("Token_pswd").toString();
		String signAlgo = hm.get("Sign_algorithm").toString();
		String keyAlgo = hm.get("KeyAlgorithmSize").toString();
		String vDay = hm.get("Validity_Days").toString();
		String vHours = hm.get("Validity_hours").toString();
		String vMin = hm.get("Validity_min").toString();
		String vSec = hm.get("Validity_sec").toString();
		String IssurTknPswd = hm.get("IssuerToken_Pswd").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		String shtName="CreateUserNgtive";
		pf_CreateUserPage err = new pf_CreateUserPage(w);
		 if(scriptName.equalsIgnoreCase("createUserNegtve")) {
			 et =  es.startTest("Create User invalid value Check");
				err.createUser(cName,email,orgName,telNo,city,state,Zip,country,role,tPswd,signAlgo,keyAlgo,vDay,vHours,vMin,vSec,IssurTknPswd,aEmail,aPswrd,shtName,scriptName);
			}
	}
	
	@Test(enabled=true,priority=6,groups={"SMK","REG"})
	public void exprtExcl() throws Exception{	
		pf_CreateUserPage err = new pf_CreateUserPage(w);
			et =  es.startTest("Export to Excel");
			err.exportToExcel();
		
	}
}
