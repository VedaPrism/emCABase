package Page_Factory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import Generic_Library.Basefunctions;
import Generic_Library.Utility;

public class pf_admnPfleMngntKeyPrflePage  extends pf_genericmethods {
	Basefunctions b = new Basefunctions();
	@FindBy(how = How.XPATH, using = "//ul[@id='accordion']/li[2]/a") WebElement profileMngmnt;
	@FindBy(how = How.XPATH, using = "//div[@id='myNavbar']/ul/li[2]/div[1]/ul/li[2]/a") WebElement keyProfile;
	@FindBy(how = How.XPATH, using = "//div[@class='exbtnBlk']/a") WebElement newProfileBtn;
	@FindBy(how = How.ID, using = "prof_name") WebElement profileName;
	@FindBy(how = How.ID, using = "prof_type") WebElement profileType;
	@FindBy(how = How.ID, using = "tknpwd") WebElement hsmPswd;

	@FindBy(how = How.XPATH, using = "//div[@class='formBlk']/ul/li[4]/input") WebElement pkcs11File;
	@FindBy(how = How.ID, using = "createkeyprofilepageone") WebElement createkeyprofilepageone;

	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[3]/input[1]") WebElement authenticEmail;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[5]/input[1]") WebElement authenticTokenPw;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[6]/input[1]") WebElement authenticBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[6]/i[1]") WebElement tickMark;

	@FindBy(how = How.ID, using = "signAndConfirm") WebElement signAndConfirm;
	@FindBy(how = How.ID, using = "successMsg") WebElement successMsg;
	@FindBy(how = How.ID, using = "failureMsg") WebElement failureMsg;

	@FindBy(how = How.XPATH, using = "//div[@class='clearfix titleBlk']/ol/li[2]/a") WebElement keyProfileLink;

	@FindBy(how = How.XPATH, using = "//div[@class='pageBtnBlk']/a[contains(text(),' View')]") WebElement viewAll;

	//export to excel
	@FindBy(how = How.XPATH, using = "//div[@class='exbtnBlk']/button") WebElement exprtExcelBtn;

	//err msg check
	@FindBy(how = How.ID, using = "prof_nameId_error") WebElement prof_nameId_error;
	@FindBy(how = How.ID, using = "prof_typeId_error") WebElement prof_typeId_error;
	@FindBy(how = How.ID, using = "pkcs11FileId_error") WebElement pkcs11FileId_error;
	public pf_admnPfleMngntKeyPrflePage(WebDriver driver){

		PageFactory.initElements(driver, this);

	}



	public void keyProfile() throws Exception {
		cl_click(profileMngmnt);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Profile Management is clicked- passed");


	}

	public void prflenameErrCheck(String shtName, String scriptName) throws Exception {
		cl_click(keyProfile);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"key Profile is clicked- passed");
		cl_click(newProfileBtn);
		Thread.sleep(2000);	
		et.log(LogStatus.PASS,"New profile is clicked- passed");
		cl_click(createkeyprofilepageone);
		Thread.sleep(2000);
		String msg=prof_nameId_error.getText();
		Utility.comparelogic(msg, shtName, scriptName);

	}

	public void prfleTypeErrCheck(String shtName, String scriptName) throws Exception {
		String msg=prof_typeId_error.getText();
		Utility.comparelogic(msg, shtName, scriptName);

	}

	public void uploadFileErrCheck(String shtName, String scriptName) throws Exception {

		String msg=pkcs11FileId_error.getText();
		Utility.comparelogic(msg, shtName, scriptName);
	}

	public void keyPrfleHardTknType(String pName, String pType,String hsmPw, String path,String aEmail,String aPswrd, String shtName, String scriptName) throws Exception {

		cl_click(keyProfile);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"key Profile is clicked- passed");
		cl_click(newProfileBtn);
		Thread.sleep(2000);	
		et.log(LogStatus.PASS,"New profile is clicked- passed");
		cl_entertext(profileName, pName);
		Select s=new Select(profileType);
		s.selectByVisibleText(pType);
		if(pType.equalsIgnoreCase("HSM")) {
			cl_entertext(hsmPswd, hsmPw);
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		cl_entertext(pkcs11File, path);
		Thread.sleep(2000);
		try {
		cl_click(createkeyprofilepageone);
		Thread.sleep(4000);
		cl_entertext(authenticEmail, aEmail);
		cl_entertext(authenticTokenPw, aPswrd);
		cl_click(authenticBtn);
		Thread.sleep(6000);
		et.log(LogStatus.PASS,"Authentic button is clicked- passed");
		boolean b = tickMark.isDisplayed();
		System.out.println("Green tick mark is displayed? "+b);
		Thread.sleep(2000);
		cl_click(signAndConfirm);
		Thread.sleep(20000);
		et.log(LogStatus.PASS,"Confirm button is clicked- passed");
		((JavascriptExecutor) w).executeScript("arguments[0].scrollIntoView(true);", successMsg);
		if(successMsg.isDisplayed()) {
			String successMsg1=successMsg.getText();
			System.out.println("successMsg: "+successMsg1);
		}
		else if(failureMsg.isDisplayed()) {
			String failureMsg1=failureMsg.getText();
			System.out.println("FailureMsg: "+failureMsg1);
		}
		/*String msg=successMsg.getText();
		System.out.println("Message: "+msg);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Success message is displayed- passed");*/
		cl_click(viewAll);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"View All button is clicked- passed");
		}catch(Exception e) {
			String msg=prof_nameId_error.getText();
			System.out.println(msg);
		}
	}

	public void exptToExcel() throws Exception {
		cl_click(keyProfile);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"key Profile is clicked- passed");
		cl_click(exprtExcelBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Export to Excel button is clicked- passed");

	}








}
