package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_auditorReportsPage;

public class CAAdminReports_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(CAAdminReports_Script.class);
	
	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void auditorReports() throws Exception{	
		pf_auditorReportsPage p = new pf_auditorReportsPage(w);
			et =  es.startTest("CA admin Report Details");
			p.reportCAADmin();
	}
	
	
	@Test(dataProvider= "Auditorreports_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=2,groups={"SMK","REG"})
	public void auditorLogs(Map hm) throws Exception{
		String scriptName = hm.get("Script_Name").toString();
		String srchBy = hm.get("SearchWithoutSearchBy").toString();
		String ScrchForM = hm.get("SearchWithoutModule").toString();
		String ScrchForE = hm.get("SearchWthoutEvent").toString();
		String ScrchForIp = hm.get("SearchWthoutIpAdd").toString();
		String ScrchForU = hm.get("SearchWthoutUser").toString();
		String ScrchForS = hm.get("SearchWthoutStatus").toString();
		
							
		et =  es.startTest("CA admin Report Logs Details");
		pf_auditorReportsPage p = new pf_auditorReportsPage(w);
		if(scriptName.equals("auditorLog")) {
		p.audtrLog(srchBy,ScrchForM,ScrchForE,ScrchForIp,ScrchForU,ScrchForS);
		}	
	}

}
