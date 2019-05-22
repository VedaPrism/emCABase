package Scripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_admnUserCertMngntPage;

public class AdmnUserCertMngnt_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(AdmnUserCertMngnt_Script.class);

	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void certDetails() throws Exception{	
		pf_admnUserCertMngntPage p = new pf_admnUserCertMngntPage(w);
			et =  es.startTest("User Certificate Management");
			p.usercertDetailsSearch();
	}

}
