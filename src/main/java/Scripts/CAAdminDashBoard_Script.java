package Scripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_OperatorDashbrdPage;

public class CAAdminDashBoard_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(CAAdminDashBoard_Script.class);

	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void caadminActveCert() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("CA Admin DashBoard CA ActveCert");
			p.dashbrdActiveCert();
		
	}

	@Test(enabled=true,priority=2,groups={"SMK","REG"})
	public void caadminActveCertU() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("CA Admin DashBoard User ActveCert");
			p.dashbrdActiveCertUser();
			p.dashbrdActiveCert();		
	}
	
	@Test(enabled=true,priority=3,groups={"SMK","REG"})
	public void caadminRvkeCert() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("CA Admin DashBoard CA RevokeCert");
			p.revokeCerttab();
			p.dashbrdActiveCert();
		
	}

	@Test(enabled=true,priority=4,groups={"SMK","REG"})
	public void caadminRvkeCertU() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("CA Admin DashBoard User RevokeCert");
			p.dashbrdActiveCertUser();
			p.dashbrdActiveCert();		
	}
	
	@Test(enabled=true,priority=5,groups={"SMK","REG"})
	public void caadminExpireCert() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("CA Admin DashBoard CA ExpireSoonCert");
			p.expireCerttab();
			p.dashbrdActiveCert();
		
	}

	@Test(enabled=true,priority=6,groups={"SMK","REG"})
	public void caadminExpireCertU() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("CA Admin DashBoard User ExpireSoonCert");
			p.dashbrdActiveCertUser();
			p.dashbrdActiveCert();		
	}
	
	@Test(enabled=true,priority=7,groups={"SMK","REG"})
	public void caadminCRl() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("CA Admin DashBoard CRL");
			p.crltab();
			p.CrlSearch();	
	}


}
