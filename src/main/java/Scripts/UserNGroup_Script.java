package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_UserGroupPage;

public class UserNGroup_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(UserNGroup_Script.class);

	@Test(dataProvider= "userGroup_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=1,groups={"SMK","REG"})
	public void searchErr(Map hm) throws Exception{	

		String scriptName = hm.get("Script_Name").toString();
		String searchBy = hm.get("Search_By").toString();
		String shtName="UserNGroup";
		pf_UserGroupPage u = new pf_UserGroupPage(w);
		if(scriptName.equalsIgnoreCase("searchByErr")) {	
			et =  es.startTest("Search By Err Check");
			u.searchByErr(shtName,scriptName);
		}
		else if(scriptName.equalsIgnoreCase("searchForErr")) {	
			et =  es.startTest("Search for Err Check");
			u.searchForErr(searchBy,shtName,scriptName);
		}
	}
	@Test(dataProvider= "userGroup_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=2,groups={"SMK","REG"})
	public void searchOfcr(Map hm) throws Exception{	

		String scriptName = hm.get("Script_Name").toString();
		String searchBy = hm.get("Search_By").toString();
		String searchFor = hm.get("Search_For").toString();
		String shtName="UserNGroup";
		pf_UserGroupPage u = new pf_UserGroupPage(w);
		if(scriptName.equalsIgnoreCase("searchOfficer")) {	
			et =  es.startTest("Search for Officer in UserNGroup");
			u.searchRole(searchBy,searchFor,shtName,scriptName);
		}
	}
	
	@Test(dataProvider= "userGroup_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=3,groups={"SMK","REG"})
	public void searchAuditr(Map hm) throws Exception{	

		String scriptName = hm.get("Script_Name").toString();
		String searchBy = hm.get("Search_By").toString();
		String searchFor = hm.get("Search_For").toString();
		String shtName="UserNGroup";
		pf_UserGroupPage u = new pf_UserGroupPage(w);	
		if(scriptName.equalsIgnoreCase("searchAuditotr")) {	
			et =  es.startTest("Search for Auditor in UserNGroup");
			u.searchRole(searchBy,searchFor,shtName,scriptName);
		}
	}
	
	@Test(dataProvider= "userGroup_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=4,groups={"SMK","REG"})
	public void searchOperatr(Map hm) throws Exception{	

		String scriptName = hm.get("Script_Name").toString();
		String searchBy = hm.get("Search_By").toString();
		String searchFor = hm.get("Search_For").toString();
		String shtName="UserNGroup";
		pf_UserGroupPage u = new pf_UserGroupPage(w);
		if(scriptName.equalsIgnoreCase("searchOperator")) {
			et =  es.startTest("Search for Operator in UserNGroup");
			u.searchRole(searchBy,searchFor,shtName,scriptName);
		}
	}
	
	@Test(enabled=true,priority=5,groups={"SMK","REG"})
	public void homeLink() throws Exception{	
		pf_UserGroupPage u = new pf_UserGroupPage(w);
			et =  es.startTest("HomeLink Check");
			u.homeLinkCheck();
		
	}
}
