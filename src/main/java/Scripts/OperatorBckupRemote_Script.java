package Scripts;

import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_OperatorBackupPage;

public class OperatorBckupRemote_Script extends Basefunctions {
	final static Logger log = Logger.getLogger(OperatorBckupRemote_Script.class);

	
	@Test(dataProvider= "OperatorBackupRmte_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=1,groups={"SMK","REG"})
	public void operatorTestConnectionCheck(Map hm) throws Exception{
		String scriptName = hm.get("Script_Name").toString();
		String ipadd = hm.get("IP_Add").toString();
		String path = hm.get("Path").toString();
		String usrName = hm.get("User_Name").toString();
		String pwd = hm.get("Password").toString();
		
		String IpAdd_msg = hm.get("IpAdd_msg").toString();
		String Path_Msg = hm.get("Path_Msg").toString();
		String Usr_Msg = hm.get("Usr_Msg").toString();
		String Pwd_Msg = hm.get("Pwd_Msg").toString();
					

		String shtName="OperatorBckupRmte";
		pf_OperatorBackupPage p = new pf_OperatorBackupPage(w);
		if(scriptName.equals("ManualRBckupInvdTestConn")) {
			et =  es.startTest("Manual Remote test conn with invalid UN&Pw");
			p.RemoteBckup(ipadd,path,usrName,pwd);
			}
		else if(scriptName.equals("ManualRBckupTestConn")) {
			et =  es.startTest("Manual Remote test conn with valid data");
			p.RemoteBckup(ipadd,path,usrName,pwd);
			}
		else if(scriptName.equals("TestConnWithInvldIP")) {
			et =  es.startTest("Manual Remote test conn with invalid IP");
			p.RemoteBckup(ipadd,path,usrName,pwd);
			}
		else if(scriptName.equals("TestConnWithBlankValue")) {
		et =  es.startTest("Remote server-test Conn-BlnkValue");
		p.testConnwithBlnkValue(IpAdd_msg,Path_Msg,Usr_Msg,Pwd_Msg);
		}
		
		else if(scriptName.equals("BckUp")) {
			et =  es.startTest("Remote server-test Conn-BlnkValue");
			p.testConnwithBlnkValue(IpAdd_msg,Path_Msg,Usr_Msg,Pwd_Msg);
			}
	}
	
	
	@Test(dataProvider= "OperatorBackupRmte_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=2,groups={"SMK","REG"})
	public void operatorBackupManual(Map hm) throws Exception{
		String scriptName = hm.get("Script_Name").toString();
		String ipadd = hm.get("IP_Add").toString();
		String path = hm.get("Path").toString();
		String usrName = hm.get("User_Name").toString();
		String pwd = hm.get("Password").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		String shtName="OperatorBckupRmte";
		
		pf_OperatorBackupPage p = new pf_OperatorBackupPage(w);
		if(scriptName.equals("AuthenticWithoutEmailNPw")) {
			et =  es.startTest("Manual Remote Authentic without email N Pwd");
			p.AuthenticWithoutEmailNPw(ipadd,path,usrName,pwd,shtName,scriptName);
			}
		else if(scriptName.equals("BackupWithoutAuthentic")) {
			et =  es.startTest("Manual Remote Backup without Authentic");
			p.BackupWithoutAuthentic(shtName,scriptName);
			}
		else if(scriptName.equals("BackupWithAuthentic")) {
			et =  es.startTest("Manual Remote Backup with Authentic");
			p.BackupWithAuthentic(ipadd,path,usrName,pwd,aEmail,aPswrd);
			} 
		
	}
	
	
	@Test(dataProvider= "OperatorBackupRmte_Page",dataProviderClass=Dataproviders.dp_login.class,enabled=true,priority=3,groups={"SMK","REG"})
	public void operatorBackupAutomtc(Map hm) throws Exception{
		String scriptName = hm.get("Script_Name").toString();
		String ipadd = hm.get("IP_Add").toString();
		String path = hm.get("Path").toString();
		String usrName = hm.get("User_Name").toString();
		String pwd = hm.get("Password").toString();
		String aEmail = hm.get("Authentic_email").toString();
		String aPswrd = hm.get("Authentic_tPswrd").toString();
		String shtName="OperatorBckupRmte";
		String bFrequency = hm.get("Bckup_frqncy").toString();
		
		pf_OperatorBackupPage p = new pf_OperatorBackupPage(w);
		if(scriptName.equals("AutomaticBackup")) {
			et =  es.startTest("Automatic Remote Backup");
			p.AutomaticBackup(bFrequency,ipadd,path,usrName,pwd,aEmail,aPswrd);
			}
		else if(scriptName.equals("AutoBackupWithoutFreqncy")) {
			et =  es.startTest("Automatic Remote Backup without frequency");
			p.AutoBackupWithoutFreqncy(bFrequency,ipadd,path,usrName,pwd,shtName,scriptName);
		}
	}

}
