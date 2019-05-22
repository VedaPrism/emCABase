package Scripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_OperatorDashbrdPage;

public class AuditorDashBoard_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(AuditorDashBoard_Script.class);

	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void AuditrActveCert() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Auditor DashBoard CA ActveCert");
			p.dashbrdActiveCert();
		
	}

	@Test(enabled=true,priority=2,groups={"SMK","REG"})
	public void AuditrActveCertU() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Auditor DashBoard User ActveCert");
			p.dashbrdActiveCertUser();
			p.dashbrdActiveCert();		
	}
	
	@Test(enabled=true,priority=3,groups={"SMK","REG"})
	public void AuditrRvkeCert() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Auditor DashBoard CA RevokeCert");
			p.revokeCerttab();
			p.dashbrdActiveCert();
		
	}

	@Test(enabled=true,priority=4,groups={"SMK","REG"})
	public void AuditrRvkeCertU() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Auditor DashBoard User RevokeCert");
			p.dashbrdActiveCertUser();
			p.dashbrdActiveCert();		
	}
	
	@Test(enabled=true,priority=5,groups={"SMK","REG"})
	public void AuditrExpireCert() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Auditor DashBoard CA ExpireSoonCert");
			p.expireCerttab();
			p.dashbrdActiveCert();
		
	}

	@Test(enabled=true,priority=6,groups={"SMK","REG"})
	public void AuditrExpireCertU() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Auditor DashBoard User ExpireSoonCert");
			p.dashbrdActiveCertUser();
			p.dashbrdActiveCert();		
	}
	
	@Test(enabled=true,priority=7,groups={"SMK","REG"})
	public void AuditrCRl() throws Exception{	
		pf_OperatorDashbrdPage p = new pf_OperatorDashbrdPage(w);
			et =  es.startTest("Auditor DashBoard CRL");
			p.crltab();
			p.CrlSearch();	
	}

}
