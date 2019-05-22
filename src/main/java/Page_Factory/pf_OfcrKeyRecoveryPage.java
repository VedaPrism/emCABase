package Page_Factory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import Generic_Library.Utility;

public class pf_OfcrKeyRecoveryPage extends pf_genericmethods  {


	@FindBy(how = How.XPATH, using = "//div[@class='sidebar']/div/ul/li[7]/a") WebElement keyMngmt;
	@FindBy(how = How.XPATH, using = "//div[@id='myNavbar']/ul/li[7]/div[1]/ul/li") WebElement keyRecovery;
	@FindBy(how = How.XPATH, using = "//div[@class='radioInner']/label[1]") WebElement keyStoreNewPw;
	@FindBy(how = How.XPATH, using = "//div[@class='radioInner']/label[2]") WebElement keyStoreOldPw;

	@FindBy(how = How.ID, using = "newPin") WebElement newPassword;
	@FindBy(how = How.ID, using = "certFile") WebElement uploadPublicKey;
	@FindBy(how = How.ID, using = "RecoveryKeyConfirmBtn") WebElement RecoveryKeyConfirmBtn;

	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[3]/input[1]") WebElement authenticEmail;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[5]/input[1]") WebElement authenticTokenPw;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[6]/input[1]") WebElement authenticBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[6]/i[1]") WebElement tickMark;

	@FindBy(how = How.ID, using = "RecoveryKeyBtn") WebElement RecoveryKeyBtn;
	
	@FindBy(how = How.ID, using = "warningMsg") WebElement warningMsg;
	@FindBy(how = How.XPATH, using = "//div[@id='alertWindow']/div/div/div/button") WebElement warningMsgClseButton;
	
	//submit button without password and file
	@FindBy(how = How.ID, using = "newPinError") WebElement newPinError;
	@FindBy(how = How.ID, using = "certFileError") WebElement certFileError;
	
	//Error message without email and password in authentication
	
	@FindBy(how = How.ID, using = "signFailError0") WebElement signFailError0;
	
	//key Recovery error message without authentication
	@FindBy(how = How.XPATH, using = "//div[@id='alertWindow']/div/div/div[2]/p[3]/span") WebElement rcvryWithtAuthntcMSg;
	
	//error msg-if KRS Dissabled while creating profile
	@FindBy(how = How.ID, using = "failureMsg") WebElement failureMsg;
	@FindBy(how = How.ID, using = "successMsg") WebElement successMsg;

	public pf_OfcrKeyRecoveryPage(WebDriver driver){

		PageFactory.initElements(driver, this);		
	}

	public void keyManagement() throws Exception {
		cl_click(keyMngmt);
		Thread.sleep(2000);
		et.log(LogStatus.PASS, "Key Management is clicked");
	}

	public void keyStoreNewPwCharacter(String keyStorePw) throws Exception {
		cl_click(keyRecovery);
		Thread.sleep(2000);	
		cl_entertext(newPassword,keyStorePw);
		Thread.sleep(2000);	
		et.log(LogStatus.PASS, "New Password accept characters");
	}

	public void keyStoreNewPwSplChar(String keyStorePw) throws Exception {
		newPassword.clear();
		cl_entertext(newPassword,keyStorePw);
		Thread.sleep(2000);	
		et.log(LogStatus.PASS, "New Password accept Special characters");
	}

	public void keyStoreNewPwNum(String keyStorePw) throws Exception {
		newPassword.clear();
		cl_entertext(newPassword,keyStorePw);
		Thread.sleep(2000);	
		et.log(LogStatus.PASS, "New Password accept Number");
	}

	public void keyStoreNewPwAlphaNum(String keyStorePw) throws Exception {
		newPassword.clear();
		cl_entertext(newPassword,keyStorePw);
		Thread.sleep(2000);	
		et.log(LogStatus.PASS, "New Password accept Alphanumeric");
	}

	public void keyStoreNewPw(String keyStorePw, String aEmail, String aPswrd) throws Exception {
		newPassword.clear();
		cl_entertext(newPassword,keyStorePw);
		Thread.sleep(2000);
		et.log(LogStatus.PASS, "New Password accept valid Password");
	}

	public void InvalidFile(String keyStorePw,String scriptName,String shtName) throws Exception {
		newPassword.clear();
//		cl_entertext(newPassword,keyStorePw);
//		Thread.sleep(2000);
		String path=Utility.getpropertydetails("InvalidKeyRcvryCerPath");
		cl_entertext(uploadPublicKey,path);
		Thread.sleep(3000);
		String msg1=warningMsg.getText();
		System.out.println("warning msg"+msg1);
		cl_click(warningMsgClseButton);
		Thread.sleep(2000);
		Utility.comparelogic(msg1, shtName, scriptName);
		Thread.sleep(2000);
		
	}

	public void submtWithoutPw(String scriptName,String shtName) throws Exception {
		newPassword.clear();
		cl_click(RecoveryKeyConfirmBtn);
		Thread.sleep(2000);
		String msg=newPinError.getText();
		Utility.comparelogic(msg, shtName, scriptName);
		
	}

	public void submitWithoutfile(String scriptName,String shtName) throws Exception {
		
		Thread.sleep(2000);
		String msg=certFileError.getText();
		Utility.comparelogic(msg, shtName, scriptName);
	}

	public void AuthenticWithtEmailNPw(String keyStorePw,String scriptName, String shtName) throws Exception {
		cl_entertext(newPassword,keyStorePw);
		String path=Utility.getpropertydetails("KeyRcvryCerPath");
		cl_entertext(uploadPublicKey,path);
		Thread.sleep(3000);
		cl_click(RecoveryKeyConfirmBtn);
		Thread.sleep(3000);
		cl_click(authenticBtn);
		Thread.sleep(6000);
		((JavascriptExecutor)w).executeScript("arguments[0].scrollIntoView();", signFailError0);
		String msg=signFailError0.getText();
		Utility.comparelogic(msg, shtName, scriptName);
	}

	public void RecvryBtnWithoutAuthentic(String keyStorePw,String scriptName, String shtName) throws Exception {	
		Thread.sleep(2000);
		cl_click(RecoveryKeyBtn);
		Thread.sleep(2000);
		String msg1=rcvryWithtAuthntcMSg.getText();
		cl_click(warningMsgClseButton);
		Thread.sleep(2000);
		Utility.comparelogic(msg1, shtName, scriptName);
		Thread.sleep(2000);
	}

	public void uploadCerFile(String keyStorePw, String aEmail, String aPswrd, String scriptName, String shtName) throws Exception {
		cl_click(keyRecovery);
		Thread.sleep(2000);	
		cl_entertext(newPassword,keyStorePw);
		String path=Utility.getpropertydetails("KeyRcvryCerPath");
		cl_entertext(uploadPublicKey,path);
		Thread.sleep(3000);
		cl_click(RecoveryKeyConfirmBtn);
		Thread.sleep(3000);
		cl_entertext(authenticEmail, aEmail);
		cl_entertext(authenticTokenPw, aPswrd);
		cl_click(authenticBtn);
		Thread.sleep(6000);
		et.log(LogStatus.PASS,"Authentic button is clicked- passed");
		boolean b = tickMark.isDisplayed();
		System.out.println("Green tick mark is displayed? "+b);
		Thread.sleep(2000);
		cl_click(RecoveryKeyBtn);
		Thread.sleep(10000);
		if(successMsg.isDisplayed()) {
			String successMsg1=successMsg.getText();
			System.out.println("successMsg: "+successMsg1);
		}
		else if(failureMsg.isDisplayed()) {
			String failureMsg1=failureMsg.getText();
			System.out.println("FailureMsg: "+failureMsg1);
		}
	}

	public void KeyStreOldPw(String keyStorePw, String scriptName, String shtName) throws Exception {
		cl_click(keyRecovery);
		Thread.sleep(2000);
		cl_click(keyStoreOldPw);
		Thread.sleep(2000);
		cl_click(RecoveryKeyConfirmBtn);
		String msg=certFileError.getText();
		Utility.comparelogic(msg, shtName, scriptName);
	}

	public void KeyStreOldPwInvalidFile(String keyStorePw, String scriptName, String shtName) throws Exception {
		
		String path=Utility.getpropertydetails("InvalidKeyRcvryCerPath");
		cl_entertext(uploadPublicKey,path);
		Thread.sleep(2000);
		String msg1=rcvryWithtAuthntcMSg.getText();
		System.out.println("Message when we upload invalid file: "+msg1);
		cl_click(warningMsgClseButton);
		Thread.sleep(2000);
		Utility.comparelogic(msg1, shtName, scriptName);
		Thread.sleep(2000);
	}

	public void KeyStreOldPwvalidFile(String keyStorePw, String aEmail, String aPswrd, String scriptName,
			String shtName) throws Exception {
		cl_click(keyRecovery);
		Thread.sleep(2000);
		cl_click(keyStoreOldPw);
		Thread.sleep(2000);
		String path=Utility.getpropertydetails("KeyRcvryCerPathOldPw");
		cl_entertext(uploadPublicKey,path);
		Thread.sleep(3000);
		cl_click(RecoveryKeyConfirmBtn);
		Thread.sleep(3000);
		cl_entertext(authenticEmail, aEmail);
		cl_entertext(authenticTokenPw, aPswrd);
		cl_click(authenticBtn);
		Thread.sleep(6000);
		et.log(LogStatus.PASS,"Authentic button is clicked- passed");
		boolean b = tickMark.isDisplayed();
		System.out.println("Green tick mark is displayed? "+b);
		Thread.sleep(2000);
		cl_click(RecoveryKeyBtn);
		Thread.sleep(10000);
		if(successMsg.isDisplayed()) {
			String successMsg1=successMsg.getText();
			System.out.println("successMsg: "+successMsg1);
		}
		else if(failureMsg.isDisplayed()) {
			String failureMsg1=failureMsg.getText();
			System.out.println("FailureMsg: "+failureMsg1);
		}
		
	}

	public void KeyStreOldAuthenticWithtEmailNPw(String keyStorePw, String scriptName, String shtName) throws Exception {
		
		String path=Utility.getpropertydetails("KeyRcvryCerPathOldPw");
		cl_entertext(uploadPublicKey,path);
		Thread.sleep(3000);
		cl_click(RecoveryKeyConfirmBtn);
		Thread.sleep(3000);
		cl_click(authenticBtn);
		Thread.sleep(6000);
		Thread.sleep(6000);
		((JavascriptExecutor)w).executeScript("arguments[0].scrollIntoView();", signFailError0);
		String msg=signFailError0.getText();
		Utility.comparelogic(msg, shtName, scriptName);
	
	}

	


}
