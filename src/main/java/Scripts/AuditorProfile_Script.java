package Scripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_MyProfilePage;

public class AuditorProfile_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(AuditorProfile_Script.class);

	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void admnPrfle() throws Exception{	
		pf_MyProfilePage p = new pf_MyProfilePage(w);
			et =  es.startTest("Auditor Profile Details");
			p.adminProfileDetail();
		
	}

}
