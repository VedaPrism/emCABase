package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_OperatorBackupPage;


public class OperatorBackup_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(OperatorBackup_Script.class);

	/*@Test(enabled=true,priority=1,groups={"SMK","REG"})
	public void operatorbckup() throws Exception{	
		pf_OperatorBackupPage p = new pf_OperatorBackupPage(w);
			et =  es.startTest("Operator Backup Default Check");
			p.backup();
	}
	
	@Test(dataProvider= "OperatorBackup_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=2,groups={"SMK","REG"})
	public void operatrManualLocal(Map hm) throws Exception{
		String scriptName = hm.get("Script_Name").toString();
		String path = hm.get("Path").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		String shtName="OperatorBckup";
		pf_OperatorBackupPage p = new pf_OperatorBackupPage(w);
		if(scriptName.equals("bckupCnfrmCheck")) {
			et =  es.startTest("Manual bckup confirm btn check");
			p.bckupCnfrmCheck(shtName,scriptName);
			}	
		else if(scriptName.equals("CnfrmWithoutpath")) {
			et =  es.startTest("Manual bckup confirm btn without path");
			p.CnfrmWithoutpath(shtName,scriptName);
			}
		else if(scriptName.equals("AuthenticWithoutEmailNPw")) {
			et =  es.startTest("Manual bckup Authentic btn without UN&Pw");
			p.WithoutAuthentication(path,shtName,scriptName);
			}
		else if(scriptName.equals("BackupWithoutAuthentic")) {
			et =  es.startTest("Manual bckup Backup btn without UN&Pw");
			p.BackupWithoutAuthentic(shtName,scriptName);
			}
		else if(scriptName.equals("BackupWithAuthentic")) {
			et =  es.startTest("Manual bckup");
			p.BackupWithAuthentic(aEmail,aPswrd,shtName,scriptName);
			}
	}*/
	
	@Test(dataProvider= "OperatorBackup_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=3,groups={"SMK","REG"})
	public void operatrAutomtcLocal(Map hm) throws Exception{
		String scriptName = hm.get("Script_Name").toString();
		String path = hm.get("Path").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		String bFrequency = hm.get("Bckup_frqncy").toString();
		String shtName="OperatorBckup";
		pf_OperatorBackupPage p = new pf_OperatorBackupPage(w);
		if(scriptName.equals("AutomtcBckupLocal")) {
			et =  es.startTest("Automtc bckup Local server");
			p.AutomtcBckupLocal(bFrequency,path,aEmail,aPswrd);
			}	
	}
}
