package Scripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_OperatorDashbrdPage;

public class OfficrDashBoard_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(OfficrDashBoard_Script.class);

	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void OfficrActveCert() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Officer DashBoard CA ActveCert");
			p.dashbrdActiveCert();
		
	}

	@Test(enabled=true,priority=2,groups={"SMK","REG"})
	public void OfficrActveCertU() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Officer DashBoard User ActveCert");
			p.dashbrdActiveCertUser();
			p.dashbrdActiveCert();		
	}
	
	@Test(enabled=true,priority=3,groups={"SMK","REG"})
	public void OfficrRvkeCert() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Officer DashBoard CA RevokeCert");
			p.revokeCerttab();
			p.dashbrdActiveCert();
		
	}

	@Test(enabled=true,priority=4,groups={"SMK","REG"})
	public void OfficrRvkeCertU() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Officer DashBoard User RevokeCert");
			p.dashbrdActiveCertUser();
			p.dashbrdActiveCert();		
	}
	
	@Test(enabled=true,priority=5,groups={"SMK","REG"})
	public void OfficrExpireCert() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Officer DashBoard CA ExpireSoonCert");
			p.expireCerttab();
			p.dashbrdActiveCert();
		
	}

	@Test(enabled=true,priority=6,groups={"SMK","REG"})
	public void OfficrExpireCertU() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Officer DashBoard User ExpireSoonCert");
			p.dashbrdActiveCertUser();
			p.dashbrdActiveCert();		
	}
	
	@Test(enabled=true,priority=7,groups={"SMK","REG"})
	public void OfficrCRl() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Officer DashBoard CRL");
			p.crltab();
			p.CrlSearch();	
	}


}
