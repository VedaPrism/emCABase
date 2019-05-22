package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_admnReportsPage;

public class AdmnReports_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(AdmnReports_Script.class);

	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void admnReport() throws Exception{
		pf_admnReportsPage c=new pf_admnReportsPage(w);
		et =  es.startTest("Admin Reports");
		c.report();
		
	}
	@Test(enabled=true,priority=2,groups={"SMK","REG"})
	public void admnCRLReport() throws Exception{
		pf_admnReportsPage c=new pf_admnReportsPage(w);
		et =  es.startTest("Admin CRL Reports");
		c.crlReport();
		
	}

	@Test(enabled=true,priority=3,groups={"SMK","REG"})
	public void admnCertStat() throws Exception{
		pf_admnReportsPage c=new pf_admnReportsPage(w);
		et =  es.startTest("Admin Reports-Cert statistics");
		c.certStatistics();
		
	}
	
	@Test(dataProvider= "reports_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=4,groups={"SMK","REG"})
	public void activeCertificates(Map hm) throws Exception{
		String scriptName = hm.get("Script_Name").toString();
		String srchBy = hm.get("SearchWithoutSearchBy").toString();
		String ScrchFor = hm.get("SearchWithoutSearchFor").toString();
		String InvldSlNo = hm.get("InvalidSrlNo").toString();
		String NoRcrdsMsg = hm.get("NoRecords").toString();
		pf_admnReportsPage c=new pf_admnReportsPage(w);
		if(scriptName.equals("ActiveCertificate")) {
			et =  es.startTest("Admin Reports-active Cert");
		c.activeCert(srchBy,ScrchFor,InvldSlNo,NoRcrdsMsg);
		}	
	}
	
	@Test(dataProvider= "reports_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=5,groups={"SMK","REG"})
	public void revokeCertificates(Map hm) throws Exception{
		String scriptName = hm.get("Script_Name").toString();
		String srchBy = hm.get("SearchWithoutSearchBy").toString();
		String ScrchFor = hm.get("SearchWithoutSearchFor").toString();
		String InvldSlNo = hm.get("InvalidSrlNo").toString();
		String NoRcrdsMsg = hm.get("NoRecords").toString();
		pf_admnReportsPage c=new pf_admnReportsPage(w);
		if(scriptName.equals("RevokeCertificate")) {
			et =  es.startTest("Admin Reports-revoke Cert");
		c.revokeCert(srchBy,ScrchFor,InvldSlNo,NoRcrdsMsg);
		}	
	}
	
	@Test(dataProvider= "reports_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=6,groups={"SMK","REG"})
	public void expiredCertificates(Map hm) throws Exception{
		String scriptName = hm.get("Script_Name").toString();
		String srchBy = hm.get("SearchWithoutSearchBy").toString();
		String ScrchFor = hm.get("SearchWithoutSearchFor").toString();
		String InvldSlNo = hm.get("InvalidSrlNo").toString();
		String NoRcrdsMsg = hm.get("NoRecords").toString();
		pf_admnReportsPage c=new pf_admnReportsPage(w);
		if(scriptName.equals("ExpiredCertificate")) {
			et =  es.startTest("Admin Reports-Expired Cert");
		c.expiryCert(srchBy,ScrchFor,InvldSlNo,NoRcrdsMsg);
		}
		
	}
}
