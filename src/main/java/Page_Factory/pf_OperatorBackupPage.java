package Page_Factory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import Generic_Library.Basefunctions;
import Generic_Library.Utility;

public class pf_OperatorBackupPage extends pf_genericmethods {

	Basefunctions b = new Basefunctions();

	@FindBy(how = How.ID, using = "backupMenu") WebElement backupMenu;
	@FindBy(how = How.ID, using = "manualbackup") WebElement manualbackup;
	@FindBy(how = How.ID, using = "automaticbackup") WebElement automaticbackup;
	@FindBy(how = How.ID, using = "serverLocal") WebElement serverLocal;
	@FindBy(how = How.ID, using = "remoteSystem") WebElement remoteSystem;
	@FindBy(how = How.ID, using = "backupConfirmBtn") WebElement backupConfirmBtn;
	
	
	@FindBy(how = How.ID, using = "appData") WebElement appData;
	@FindBy(how = How.ID, using = "certData") WebElement certData;
	@FindBy(how = How.ID, using = "failureDiv1") WebElement failureDiv1;//Please select the data you want to backup
	@FindBy(how = How.ID, using = "serverPath") WebElement serverPath;
	@FindBy(how = How.ID, using = "serverPathError") WebElement serverPathError;
	@FindBy(how = How.ID, using = "remoteIp") WebElement remoteIp;
	@FindBy(how = How.ID, using = "remoteFolder") WebElement remoteFolder;
	@FindBy(how = How.ID, using = "remoteUsername") WebElement remoteUsername;
	@FindBy(how = How.ID, using = "remotePwd") WebElement remotePwd;
	@FindBy(how = How.ID, using = "backupTime") WebElement backupTime;
	
	@FindBy(how = How.ID, using = "remoteIpError") WebElement remoteIpError;
	@FindBy(how = How.ID, using = "remoteFolderError") WebElement remoteFolderError;
	@FindBy(how = How.ID, using = "remoteUsernameError") WebElement remoteUsernameError;
	@FindBy(how = How.ID, using = "remotePwdError") WebElement remotePwdError;

	@FindBy(how = How.ID, using = "testConnection") WebElement testConnection;

	@FindBy(how = How.ID, using = "successDiv1") WebElement successDiv1;

	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[3]/input[1]") WebElement authenticEmail;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[5]/input[1]") WebElement authenticTokenPw;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[6]/input[1]") WebElement authenticBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[6]/i[1]") WebElement tickMark;
	@FindBy(how = How.ID, using = "signFailError0") WebElement signFailError0;
	@FindBy(how = How.ID, using = "backupbtn") WebElement backupbtn;

	@FindBy(how = How.ID, using = "warningMsg") WebElement warningMsg;
	@FindBy(how = How.XPATH, using = "//div[@id='alertWindow']/div/div/div/button") WebElement warningMsgClseButton;
	public pf_OperatorBackupPage(WebDriver driver){

		PageFactory.initElements(driver, this);
	}
	public void backup() throws Exception {
		cl_click(backupMenu);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"operator Backup in menu is clicked- passed");
		if(manualbackup.isSelected() && serverLocal.isSelected()) {
			System.out.println("By default Manualbackup and Local Server is selected");
			et.log(LogStatus.PASS,"By default Manualbackup and Local Server is selected- passed");
		}else {
			System.out.println("By default Manualbackup and Local Server not selected");
			et.log(LogStatus.FAIL,"By default Manualbackup and Local Server not selected");
		}
	}
	public void bckupCnfrmCheck(String shtName, String scriptName) throws Exception  {
		cl_click(backupConfirmBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Backup confirm button is clicked- passed");
		String msg=failureDiv1.getText();
		System.out.println(msg);
		Utility.comparelogic(msg, shtName, scriptName);
	}
	
	public void CnfrmWithoutpath(String shtName, String scriptName) throws Exception {
		cl_click(appData);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"App data Checkbox is clicked- passed");
		cl_click(certData);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"Cert data Checkbox is clicked- passed");
		cl_click(backupConfirmBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Backup confirm button is clicked- passed");
		String msg=serverPathError.getText();
		System.out.println(msg);
		Utility.comparelogic(msg, shtName, scriptName);
	}
	
	public void BackupWithAuthentic(String aEmail,String aPswrd,String shtName, String scriptName) throws Exception {
		Thread.sleep(2000);
		cl_entertext(authenticEmail, aEmail);
		cl_entertext(authenticTokenPw, aPswrd);
		cl_click(authenticBtn);
		Thread.sleep(6000);
		et.log(LogStatus.PASS,"Authentic button is clicked- passed");
		boolean b = tickMark.isDisplayed();
		System.out.println("Green tick mark is displayed? "+b);
		Thread.sleep(2000);
		cl_click(backupbtn);
		Thread.sleep(30000);
		et.log(LogStatus.PASS,"Backup button is clicked- passed");
		try {
			String msg1=successDiv1.getText();
			System.out.println(msg1);
		}catch(Exception e)
		{
			String msg2=failureDiv1.getText();
			System.out.println(msg2);
		}
		
	}
	
	public void WithoutAuthentication(String path,String shtName, String scriptName) throws Exception {
		cl_entertext(serverPath, path);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Server path is entered- passed");
		cl_click(backupConfirmBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Backup button is clicked- passed");
		cl_click(authenticBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Authentic button is clicked- passed");
		String msg1=signFailError0.getText();
		Thread.sleep(1000);
		Utility.comparelogic(msg1, shtName, scriptName);
	}

	public void testConnwithBlnkValue(String ipEmsg,String pthEMSg,String usrEMsg,String pwdEMsg) throws Exception {
		cl_click(backupMenu);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Backup tab in menu is clicked- passed");
		cl_click(remoteSystem);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Remote system RadioBtn is clicked- passed");
		cl_click(testConnection);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Test Connection is clicked- passed");
		String ipMsg=remoteIpError.getText();
		String pathMsg=remoteFolderError.getText();
		String usrMsg=remoteUsernameError.getText();
		String pwMsg=remotePwdError.getText();
		if(ipMsg.equals(ipEmsg)) {
			System.out.println("Actual and Expected message of ip Address matches");
			et.log(LogStatus.PASS,"Actual and Expected message of ip Address matches- passed");
		}else {
			System.out.println("Actual and Expected message of ip Address not matches");
			et.log(LogStatus.FAIL,"Actual and Expected message of ip Address not matches");
		}

		if(pathMsg.equals(pthEMSg)) {
			System.out.println("Actual and Expected message of path matches");
			et.log(LogStatus.PASS,"Actual and Expected message of path matches- passed");
		}else {
			System.out.println("Actual and Expected message of path not matches");
			et.log(LogStatus.FAIL,"Actual and Expected message of path not matches");
		}
		if(usrMsg.equals(usrEMsg)) {
			System.out.println("Actual and Expected message of Username matches");
			et.log(LogStatus.PASS,"Actual and Expected message of Username matches- passed");
		}else {
			System.out.println("Actual and Expected message of Username not matches");
			et.log(LogStatus.FAIL,"Actual and Expected message of Username not matches");
		}
		if(pwMsg.equals(pwdEMsg)) {
			System.out.println("Actual and Expected message of Password matches");
			et.log(LogStatus.PASS,"Actual and Expected message of Password matches- passed");
		}else {
			System.out.println("Actual and Expected message of Password not matches");
			et.log(LogStatus.FAIL,"Actual and Expected message of Password not matches");
		}
	}
	public void RemoteBckup(String ipadd, String path, String usrName, String pwd) throws Exception {
		cl_click(backupMenu);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Backup tab in menu is clicked- passed");
		cl_click(appData);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"App data checkbox is clicked- passed");
		cl_click(certData);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Cert data checkbox is clicked- passed");
		cl_click(remoteSystem);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Remote system RadioBtn is clicked- passed");
		cl_entertext(remoteIp, ipadd);
		cl_entertext(remoteFolder, path);
		cl_entertext(remoteUsername, usrName);
		cl_entertext(remotePwd, pwd);

		cl_click(testConnection);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Test Connection is clicked- passed");
		try {
			try {
				String msg=successDiv1.getText();
				System.out.println(msg);
			}catch(Exception e)
			{
				String msg=failureDiv1.getText();
				System.out.println(msg);
			}}catch(Exception ex) {
				if(remoteIpError.isDisplayed()) {
					System.out.println(remoteIpError.getText());
				}
				if(remoteFolderError.isDisplayed()) {
					System.out.println(remoteFolderError.getText());
				}
				if(remoteUsernameError.isDisplayed()) {
					System.out.println(remoteUsernameError.getText());
				}
				if(remotePwdError.isDisplayed()) {
					System.out.println(remotePwdError.getText());
				}
			}
	}
	public void remoteServer() throws Exception {
		cl_click(backupMenu);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Backup tab in menu is clicked- passed");
		cl_click(appData);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"App data checkbox is clicked- passed");
		cl_click(certData);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Cert data checkbox is clicked- passed");
		cl_click(remoteSystem);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Remote system RadioBtn is clicked- passed");
	}
	public void AuthenticWithoutEmailNPw(String ipadd, String path, String usrName, String pwd,String shtNmae,String scriptname) throws Exception {
		remoteServer();
		Thread.sleep(2000);
		cl_entertext(remoteIp, ipadd);
		cl_entertext(remoteFolder, path);
		cl_entertext(remoteUsername, usrName);
		cl_entertext(remotePwd, pwd);

		cl_click(testConnection);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Test Connection is clicked- passed");
		try {
			String msg=successDiv1.getText();
			System.out.println(msg);
			cl_click(backupConfirmBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Confirm button is clicked- passed");
			cl_click(authenticBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Authentic button is clicked- passed");
			String msg1=signFailError0.getText();
			Thread.sleep(1000);
			Utility.comparelogic(msg1, shtNmae, scriptname);
		}catch(Exception e)
		{
			String msg=failureDiv1.getText();
			System.out.println(msg);
		}
	}
	public void BackupWithoutAuthentic(String shtNmae,String scriptname) throws Exception {

		cl_click(backupbtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Backup button is clicked- passed");
		String msg=warningMsg.getText();
		Thread.sleep(1000);
		cl_click(warningMsgClseButton);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"Warning popup close button is clicked- passed");
		Utility.comparelogic(msg, shtNmae, scriptname);

	}
	public void BackupWithAuthentic(String ipadd, String path, String usrName, String pwd,String aEmail, String aPswrd) throws Exception {
		remoteServer();
		Thread.sleep(2000);
		cl_entertext(remoteIp, ipadd);
		cl_entertext(remoteFolder, path);
		cl_entertext(remoteUsername, usrName);
		cl_entertext(remotePwd, pwd);

		cl_click(testConnection);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Test connection button is clicked- passed");
		try {
			String msg=successDiv1.getText();
			System.out.println(msg);
			cl_click(backupConfirmBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Confirm button is clicked- passed");
			cl_entertext(authenticEmail, aEmail);
			cl_entertext(authenticTokenPw, aPswrd);
			cl_click(authenticBtn);
			Thread.sleep(6000);
			et.log(LogStatus.PASS,"Authentic button is clicked- passed");
			boolean b = tickMark.isDisplayed();
			System.out.println("Green tick mark is displayed? "+b);
			Thread.sleep(2000);
			cl_click(backupbtn);
			Thread.sleep(30000);
			et.log(LogStatus.PASS,"Backup button is clicked- passed");
			try {
				String msg1=successDiv1.getText();
				System.out.println(msg1);
			}catch(Exception e)
			{
				String msg2=failureDiv1.getText();
				System.out.println(msg2);
			}
		}catch(Exception e)
		{
			String msg=failureDiv1.getText();
			System.out.println(msg);
		}

	}
	public void AutomaticBackup(String bFrequency, String ipadd, String path, String usrName, String pwd, String aEmail,
			String aPswrd) throws Exception {
		cl_click(backupMenu);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Backup tab in menu is clicked- passed");
		cl_click(automaticbackup);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"Automatic backup radiobtn is clicked- passed");
		cl_click(appData);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"App data checkbox is clicked- passed");
		cl_click(certData);
		et.log(LogStatus.PASS,"Cert data checkbox is clicked- passed");
		String[] exp= {"--Select--","Hourly","Daily","Weekly","Monthly"};
		Select s=new Select(backupTime);
		List<WebElement> options = s.getOptions(); 
		cl_dropdownCheck(exp,options);
		Thread.sleep(2000);
		s.selectByVisibleText(bFrequency);
		cl_click(remoteSystem);
		Thread.sleep(2000);
		cl_entertext(remoteIp, ipadd);
		cl_entertext(remoteFolder, path);
		cl_entertext(remoteUsername, usrName);
		cl_entertext(remotePwd, pwd);

		cl_click(testConnection);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Test connection button is clicked- passed");
		try {
			String msg=successDiv1.getText();
			System.out.println(msg);
			cl_click(backupConfirmBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Confirm button is clicked- passed");
			cl_entertext(authenticEmail, aEmail);
			cl_entertext(authenticTokenPw, aPswrd);
			cl_click(authenticBtn);
			Thread.sleep(6000);
			et.log(LogStatus.PASS,"Authentic button is clicked- passed");
			boolean b = tickMark.isDisplayed();
			System.out.println("Green tick mark is displayed? "+b);
			Thread.sleep(2000);
			cl_click(backupbtn);
			Thread.sleep(30000);
			try {
				String msg1=successDiv1.getText();
				System.out.println(msg1);
			}catch(Exception e)
			{
				String msg2=failureDiv1.getText();
				System.out.println(msg2);
			}
		}catch(Exception e)
		{
			String msg=failureDiv1.getText();
			System.out.println(msg);
		}
	}
	public void AutoBackupWithoutFreqncy(String bFrequency, String ipadd, String path, String usrName, String pwd,String shtname,String Scriptname) throws Exception {
		cl_click(backupMenu);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Backup tab in menu is clicked- passed");
		cl_click(automaticbackup);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"Automatic backup radiobtn is clicked- passed");
		cl_click(appData);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"App data checkbox is clicked- passed");
		cl_click(certData);
		et.log(LogStatus.PASS,"Cert data checkbox is clicked- passed");
		cl_click(remoteSystem);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Remote system radioBtn is clicked- passed");
		cl_entertext(remoteIp, ipadd);
		cl_entertext(remoteFolder, path);
		cl_entertext(remoteUsername, usrName);
		cl_entertext(remotePwd, pwd);

		cl_click(testConnection);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"test connection button is clicked- passed");
		cl_click(backupConfirmBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Confirm button is clicked- passed");
		String msg2=failureDiv1.getText();
		System.out.println(msg2);
		Utility.comparelogic(msg2, shtname, Scriptname);
	}
	public void AutomtcBckupLocal(String bFrequency,String path,String aEmail, String aPswrd) throws Exception {
		cl_click(backupMenu);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Backup tab in menu is clicked- passed");
		cl_click(automaticbackup);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"Automatic backup radiobtn is clicked- passed");
		cl_click(appData);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"App data checkbox is clicked- passed");
		cl_click(certData);
		et.log(LogStatus.PASS,"Cert data checkbox is clicked- passed");
		String[] exp= {"--Select--","Hourly","Daily","Weekly","Monthly"};
		Select s=new Select(backupTime);
		List<WebElement> options = s.getOptions(); 
		cl_dropdownCheck(exp,options);
		Thread.sleep(2000);
		s.selectByVisibleText(bFrequency);
		cl_entertext(serverPath, path);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Server path is entered- passed");
		cl_click(backupConfirmBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Backup button is clicked- passed");
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Confirm button is clicked- passed");
		cl_entertext(authenticEmail, aEmail);
		cl_entertext(authenticTokenPw, aPswrd);
		cl_click(authenticBtn);
		Thread.sleep(6000);
		et.log(LogStatus.PASS,"Authentic button is clicked- passed");
		boolean b = tickMark.isDisplayed();
		System.out.println("Green tick mark is displayed? "+b);
		Thread.sleep(2000);
		cl_click(backupbtn);
		Thread.sleep(30000);
		et.log(LogStatus.PASS,"Backup button is clicked- passed");
		try {
			String msg1=successDiv1.getText();
			System.out.println(msg1);
		}catch(Exception e)
		{
			String msg2=failureDiv1.getText();
			System.out.println(msg2);
		}
	}
	
	
	



}
