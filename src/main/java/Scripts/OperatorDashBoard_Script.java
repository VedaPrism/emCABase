package Scripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_OperatorDashbrdPage;


public class OperatorDashBoard_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(OperatorDashBoard_Script.class);

	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void operatrActveCert() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Operator DashBoard CA ActveCert");
			p.dashbrdActiveCert();
		
	}

	@Test(enabled=true,priority=2,groups={"SMK","REG"})
	public void operatrActveCertU() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Operator DashBoard User ActveCert");
			p.dashbrdActiveCertUser();
			p.dashbrdActiveCert();		
	}
	
	@Test(enabled=true,priority=3,groups={"SMK","REG"})
	public void operatrRvkeCert() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Operator DashBoard CA RevokeCert");
			p.revokeCerttab();
			p.dashbrdActiveCert();
		
	}

	@Test(enabled=true,priority=4,groups={"SMK","REG"})
	public void operatrRvkeCertU() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Operator DashBoard User RevokeCert");
			p.dashbrdActiveCertUser();
			p.dashbrdActiveCert();		
	}
	
	@Test(enabled=true,priority=5,groups={"SMK","REG"})
	public void operatrExpireCert() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Operator DashBoard CA ExpireSoonCert");
			p.expireCerttab();
			p.dashbrdActiveCert();
		
	}

	@Test(enabled=true,priority=6,groups={"SMK","REG"})
	public void operatrExpireCertU() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Operator DashBoard User ExpireSoonCert");
			p.dashbrdActiveCertUser();
			p.dashbrdActiveCert();		
	}
	
	@Test(enabled=true,priority=7,groups={"SMK","REG"})
	public void operatrCRl() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Operator DashBoard CRL");
			p.crltab();
			p.CrlSearch();	
	}
}
