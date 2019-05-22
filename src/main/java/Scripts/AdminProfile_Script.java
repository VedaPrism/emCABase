package Scripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_MyProfilePage;

public class AdminProfile_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(AdminProfile_Script.class);

	@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void admnPrfle() throws Exception{	
		pf_MyProfilePage p = new pf_MyProfilePage(w);
			et =  es.startTest("Admin Profile Details");
			p.adminProfileDetail();
		
	}
	
	@Test(enabled=true,priority=2,groups={"SMK","REG"})
	public void admnOpenAll() throws Exception{	
		pf_MyProfilePage p = new pf_MyProfilePage(w);
			et =  es.startTest("Open All Link");
			p.adminOpenAll();
		
	}
	
	@Test(enabled=true,priority=3,groups={"SMK","REG"})
	public void admnLogoCheck() throws Exception{	
		pf_MyProfilePage p = new pf_MyProfilePage(w);
			et =  es.startTest("Admin emCA Logo Check");
			p.emCALogoCheck();
		
	}
}
