package Scripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_admnCACertMngntPage;


public class AdmnCACertMngnt_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(AdmnCACertMngnt_Script.class);

	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void certDetails() throws Exception{	
		pf_admnCACertMngntPage p = new pf_admnCACertMngntPage(w);
			et =  es.startTest("CA Certificate Management");
			p.certDetailsSearch();
		
	}

}
