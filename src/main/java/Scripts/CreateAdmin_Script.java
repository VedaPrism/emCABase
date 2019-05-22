package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_CreateUserPage;

public class CreateAdmin_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(CreateAdmin_Script.class);

	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void roleMngnt() throws Exception{
		pf_CreateUserPage err = new pf_CreateUserPage(w);
		err.rollMangmnt();
	}
	@Test(dataProvider= "createAdmin_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=2,groups={"SMK","REG"})
	public void crteAdmin(Map hm) throws Exception{	
		String scriptName = hm.get("Script_Name").toString();
		String grp = hm.get("Select_Group").toString();
		String cName = hm.get("Common_name").toString();
		String email = hm.get("Email").toString();
		String orgName = hm.get("Org_Name").toString();
		String telNo = hm.get("Tel_no").toString();
		String city = hm.get("city").toString();
		String state = hm.get("State").toString();
		String Zip = hm.get("Zip").toString();
		String country = hm.get("Country").toString();
		String role = hm.get("Role").toString();
		String tPswd = hm.get("Token_password").toString();
		String signAlgo = hm.get("Sign_algorithm").toString();
		String keyAlgo = hm.get("KeyAlgorithmSize").toString();
		String vDay = hm.get("Validity_Days").toString();
		String vHours = hm.get("Validity_hours").toString();
		String vMin = hm.get("Validity_min").toString();
		String vSec = hm.get("Validity_sec").toString();
		String IssurTknPswd = hm.get("IssuerToken_Pswd").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		String shtName="CreateAdmin";
		pf_CreateUserPage err = new pf_CreateUserPage(w);
		if(scriptName.equalsIgnoreCase("createAdmin")) {
			et =  es.startTest("Create Admin");
			err.createAdmin(grp,cName,email,orgName,telNo,city,state,Zip,country,role,tPswd,signAlgo,keyAlgo,vDay,vHours,vMin,vSec,IssurTknPswd,aEmail,aPswrd,shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("createAdminInvalidCheck")) {
			et =  es.startTest("Create Admin with Invalid values");
			err.createAdmin(grp,cName,email,orgName,telNo,city,state,Zip,country,role,tPswd,signAlgo,keyAlgo,vDay,vHours,vMin,vSec,IssurTknPswd,aEmail,aPswrd,shtName,scriptName);
		}
		
		else if(scriptName.equalsIgnoreCase("createAdminDeleteCheck")) {
			et =  es.startTest("Create Admin to check View/Delete");
			err.createAdmin(grp,cName,email,orgName,telNo,city,state,Zip,country,role,tPswd,signAlgo,keyAlgo,vDay,vHours,vMin,vSec,IssurTknPswd,aEmail,aPswrd,shtName,scriptName);
			err.searchViewDeleteAdmin(cName,aEmail,aPswrd);
		}
	}
}
