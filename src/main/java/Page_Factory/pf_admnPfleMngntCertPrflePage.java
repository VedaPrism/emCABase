package Page_Factory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import Generic_Library.Basefunctions;
import Generic_Library.Utility;

public class pf_admnPfleMngntCertPrflePage extends pf_genericmethods {
	Basefunctions b = new Basefunctions();
	@FindBy(how = How.XPATH, using = "//ul[@id='accordion']/li[2]/a") WebElement profileMngmnt;
	@FindBy(how = How.XPATH, using = "//div[@id='myNavbar']/ul/li[2]/div[1]/ul/li[1]/a") WebElement certProfile;

	//certificate profile
	@FindBy(how = How.XPATH, using = "//div[@class='exbtnBlk']/a") WebElement newUserBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='exbtnBlk']/a[2]") WebElement exprtExclBtn;
	//profile type
	@FindBy(how = How.ID, using = "ROOTProfType") WebElement rBtnRoot;
	@FindBy(how = How.ID, using = "CAProfType") WebElement rBtnCA;
	@FindBy(how = How.ID, using = "USERProfType") WebElement rBtnUser;
	@FindBy(how = How.ID, using = "OCSPProfType") WebElement rBtnOCS;

	@FindBy(how = How.ID, using = "profileNATId") WebElement profileName;
	@FindBy(how = How.ID, using = "profileNAT_error") WebElement profileNAT_error;
	@FindBy(how = How.ID, using = "validity_error") WebElement validity_error;
	@FindBy(how = How.ID, using = "iCAId_error") WebElement iCAId_error;
	@FindBy(how = How.ID, using = "signAlg_error") WebElement signAlg_error;
	@FindBy(how = How.ID, using = "KU_error") WebElement KU_error;
	@FindBy(how = How.ID, using = "errorEnhancedKeyUsage") WebElement errorEnhancedKeyUsage;
	
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='bdp-input']/div[1]/input") WebElement vDays;
	@FindBy(how = How.XPATH, using = "//div[@class='bdp-input']/div[2]/input") WebElement vHours;
	@FindBy(how = How.XPATH, using = "//div[@class='bdp-input']/div[3]/input") WebElement vMinutes;
	@FindBy(how = How.XPATH, using = "//div[@class='bdp-input']/div[4]/input") WebElement vSeconds;

	@FindBy(how = How.ID, using = "iCAId") WebElement issuingCA;
	@FindBy(how = How.ID, using = "signAlg") WebElement signAlg;
	@FindBy(how = How.ID, using = "bConstraintId") WebElement bConstraint1;
	@FindBy(how = How.ID, using = "bConstraintForCAId") WebElement bConstraint2;

	@FindBy(how = How.ID, using = "KUUseId") WebElement KUUse;
	@FindBy(how = How.XPATH, using = "KUCriticalId") WebElement KUCritical;
	//	@FindBy(how = How.XPATH, using = "//span[@class='multiselect-native-select']/select[@id='keyUsage']") WebElement selctkeyUsge;
	@FindBy(how = How.CLASS_NAME, using ="slctdbox") WebElement selectkey;
	@FindAll({@FindBy(how = How.XPATH, using = "//select[@id='keyUsage']/following-sibling::div/ul/li")}) public List<WebElement> keyUsageCount;
	String keyUsage="//select[@id='keyUsage']/following-sibling::div/ul/li[#DELIM#]/a/label/input";
	@FindBy(how = How.ID, using = "EKUUseId") WebElement EKUUse;
	@FindBy(how = How.ID, using = "EKUCriticalId") WebElement EKUCritical;
	@FindAll({@FindBy(how = How.XPATH, using = "//select[@id='enhancedkeyUsage']/following-sibling::div/ul/li")}) public List<WebElement> EkeyUsageCount;
	String EkeyUsage="//select[@id='enhancedkeyUsage']/following-sibling::div/ul/li[#DELIM#]/a/label/input";
	@FindBy(how = How.XPATH, using = "//*[@id='enhancedkeyUsage']/following-sibling::div[1]/div[1]/span/div/span") WebElement selctEkeyUsge;
	@FindAll({@FindBy(how = How.XPATH, using = "//select[@id='subjctDNDetails']/following-sibling::div/ul/li")}) public List<WebElement> subDNCount;
	String subDNDetails="//select[@id='subjctDNDetails']/following-sibling::div/ul/li[#DELIM#]/a/label/input";
	@FindBy(how = How.XPATH, using = "//*[@id='subjctDNDetails']/following-sibling::div[1]/div[1]/span/div/span") WebElement selctsbjctDN;


	@FindBy(how = How.ID, using = "addSubjectDN") WebElement addSubjectDN;
	@FindBy(how = How.XPATH, using = "//ul[@id='customODITab']/li/input[1]") WebElement sbjctOID;
	@FindBy(how = How.ID, using = "saveId") WebElement saveProcdBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[3]/input[1]") WebElement authenticEmail;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[5]/input[1]") WebElement authenticTokenPw;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[6]/input[1]") WebElement authenticBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[6]/i[1]") WebElement tickMark;

	//	@FindBy(how = How.XPATH, using = "//span[text()='Couldn't not find your account']") WebElement wrngEmail;
	//	@FindBy(how = How.ID, using = "warningMsg") WebElement warningMsg;

	@FindBy(how = How.ID, using = "createProfileSignAndConfirm") WebElement cnfrmBtn;
	@FindBy(how = How.ID, using = "certProfSucMsg") WebElement successMsg;

	@FindBy(how = How.XPATH, using = "//div[@class='pageBtnBlk']/a[contains(text(),' View')]") WebElement viewAll;

	@FindBy(how = How.XPATH, using = "//*[@id=\"search_grid\"]/div/span") WebElement searchBtn;

	@FindBy(how = How.XPATH, using = "//td[@class='fields']/select") WebElement searchDrpBtn;
	@FindBy(how = How.XPATH, using = "//*[@id=\"fbox_grid\"]/table/tbody/tr[1]/td[3]/input") WebElement searchinput;
	@FindBy(how = How.XPATH, using = "//*[@id=\"fbox_grid\"]/table/tfoot/tr/td[1]/span[2]/span/i") WebElement findBtn;
	@FindBy(how = How.XPATH, using = "//td[@id='pager_right']/div/b") WebElement noDataMSg;
	@FindBy(how = How.XPATH, using = "//*[@id=\"refresh_grid\"]/div/span") WebElement resetBtn;

	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[2]") WebElement prfleName;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[3]") WebElement prfleType;
	@FindAll({@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr")}) public List<WebElement> certProfileSize;

	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[6]/ul/li[1]") WebElement viewBtn;
	@FindBy(how = How.XPATH, using = "//div[@id='viewCertificateDetails2']/div/div/div[1]/button") WebElement viewClseBtn;

	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[6]/ul/li[3]") WebElement deleteBtn;
	@FindBy(how = How.ID, using = "yesDelete") WebElement yesDelete;
	@FindBy(how = How.ID, using = "actionBtnTxt") WebElement deleteactionBtnTxt;
	@FindBy(how = How.XPATH, using = "//div[@id='alertWindow']/div/div/div[2]/p[1]/span") WebElement succesMsg;

	public pf_admnPfleMngntCertPrflePage(WebDriver driver){

		PageFactory.initElements(driver, this);

	}

	public void profileMngmtClick() throws Exception {
		cl_click(profileMngmnt);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Profile Management is clicked- passed");

	}
	
	public void prfleNameErrCheck(String shtName, String scriptName) throws Exception {
		cl_click(certProfile);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Certificate profile is clicked- passed");
		cl_click(newUserBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"New profile is clicked- passed");
		cl_click(saveProcdBtn);
		Thread.sleep(4000);
		et.log(LogStatus.PASS,"Save and Proceed button is clicked- passed");
		String msg=profileNAT_error.getText();
		Utility.comparelogic(msg, shtName, scriptName);
		
	}

	public void validityErrCheck(String shtName, String scriptName) throws Exception {
		String msg=validity_error.getText();
		Utility.comparelogic(msg, shtName, scriptName);
		
	}

	public void issuingCAErrCheck(String shtName, String scriptName) throws Exception {
		
		String msg=iCAId_error.getText();
		Utility.comparelogic(msg, shtName, scriptName);
	}

	public void signalgoErrCheck(String shtName, String scriptName) throws Exception {
		
		String msg=signAlg_error.getText();
		Utility.comparelogic(msg, shtName, scriptName);
	}

	public void keyUsageErrCheck(String shtName, String scriptName) throws Exception {
		String msg=KU_error.getText();
		Utility.comparelogic(msg, shtName, scriptName);
		
	}

	public void EnhnceKeyUsageErrCheck(String shtName, String scriptName) throws Exception {
		
		String msg=errorEnhancedKeyUsage.getText();
		Utility.comparelogic(msg, shtName, scriptName);
	}
	public void createRootCert(String pType, String pName, String vDay, String vHours2, String vMin, String vSec,
			String iCA, String signAlg2, String OID,String aEmail,String aPswrd, String shtName, String scriptName) throws Exception {

		Thread.sleep(2000);
		cl_click(certProfile);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Certificate profile is clicked- passed");
		cl_click(newUserBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"New profile is clicked- passed");
		if(pType.equalsIgnoreCase("CA")) {
			cl_click(rBtnCA);
			et.log(LogStatus.PASS,"CA radioBtn is clicked- passed");
		}
		else if(pType.equalsIgnoreCase("User")) {
			cl_click(rBtnUser);
			et.log(LogStatus.PASS,"User radioBtn is clicked- passed");
		}
		else if(pType.equalsIgnoreCase("OCSP")){
			cl_click(rBtnOCS);
			et.log(LogStatus.PASS,"OCSP radioBtn is clicked- passed");
		}

		cl_entertext(profileName, pName);
		vDays.clear();
		cl_entertext(vDays, vDay);
		vHours.clear();
		if(profileNAT_error.isDisplayed()) {
			System.out.println("Profile name exists message: "+profileNAT_error.getText());
			et.log(LogStatus.PASS,"Profile name exists");
		}else {
			cl_entertext(vHours, vHours2);
			vMinutes.clear();
			cl_entertext(vMinutes, vMin);
			Thread.sleep(1000);
			vSeconds.clear();
			cl_entertext(vSeconds, vSec);
			System.out.println(iCA);
			Thread.sleep(2000);
			Select s=new Select(issuingCA);
			s.selectByVisibleText(iCA);
			Thread.sleep(2000);
			Select s1=new Select(signAlg);
			s1.selectByVisibleText(signAlg2);
			Thread.sleep(2000);
			//		//cl_click(KUUse);
			boolean b2 = KUUse.isSelected();
			System.out.println(b2);
			//		Thread.sleep(1000);
			//		cl_click(KUCritical);
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor)w;
			js.executeScript("window.scrollBy(0,100)");
			Thread.sleep(2000);
			cl_click(selectkey);
			Thread.sleep(2000);
			int siz = keyUsageCount.size();
			System.out.println(siz);
			for(int i=1;i<=siz;i++) {
				cl_click(b.w.findElement(By.xpath(keyUsage.replace("#DELIM#",String.valueOf(i)))));
				Thread.sleep(1000);
			}

			cl_click(selectkey);
			Thread.sleep(2000);
			cl_click(EKUUse);
			Thread.sleep(2000);
			cl_click(selctEkeyUsge);
			int eSiz=EkeyUsageCount.size();
			System.out.println(eSiz);
			for(int i=1;i<=eSiz;i++) {
				cl_click(b.w.findElement(By.xpath(EkeyUsage.replace("#DELIM#",String.valueOf(i)))));
				Thread.sleep(1000);
			}
			cl_click(selctEkeyUsge);
			Thread.sleep(2000);

			cl_click(selctsbjctDN);
			int DNSiz=subDNCount.size();
			System.out.println(DNSiz);
			for(int i=1;i<=DNSiz;i++) {
				cl_click(b.w.findElement(By.xpath(subDNDetails.replace("#DELIM#",String.valueOf(i)))));
				Thread.sleep(1000);
			}
			cl_click(selctsbjctDN);
			Thread.sleep(2000);

			cl_click(addSubjectDN);
			cl_entertext(sbjctOID, OID);
			cl_click(saveProcdBtn);
			Thread.sleep(4000);
			et.log(LogStatus.PASS,"Save and Proceed button is clicked- passed");
			cl_entertext(authenticEmail, aEmail);		
			cl_entertext(authenticTokenPw, aPswrd);
			cl_click(authenticBtn);
			Thread.sleep(6000);
			et.log(LogStatus.PASS,"Authentic button is clicked- passed");
			boolean b = tickMark.isDisplayed();
			System.out.println("Green tick mark is displayed? "+b);
			Thread.sleep(2000);
			cl_click(cnfrmBtn);
			Thread.sleep(6000);
			et.log(LogStatus.PASS,"Confirm button is clicked- passed");
			String msg=successMsg.getText();
			System.out.println("Success msg: "+msg);
			Thread.sleep(2000);
			cl_click(viewAll);
			Thread.sleep(3000);
			et.log(LogStatus.PASS,"View All button is clicked- passed");
		}
	}

	public void createOCSPPrfle(String pType, String pName, String vDay, String vHours2, String vMin, String vSec,
			String iCA, String signAlg2, String oID, String aEmail, String aPswrd, String shtName, String scriptName) throws Exception {

		cl_click(certProfile);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"Certificate profile is clicked- passed");
		cl_click(newUserBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"New profile is clicked- passed");
		if(pType.equalsIgnoreCase("OCSP")){
			cl_click(rBtnOCS);
			et.log(LogStatus.PASS,"OCSP radioBtn is clicked- passed");
		}
		cl_entertext(profileName, pName);
		vDays.clear();
		cl_entertext(vDays, vDay);
		vHours.clear();
		cl_entertext(vHours, vHours2);
		vMinutes.clear();
		cl_entertext(vMinutes, vMin);
		Thread.sleep(1000);
		vSeconds.clear();
		cl_entertext(vSeconds, vSec);
		System.out.println(iCA);
		Thread.sleep(2000);
		Select s=new Select(issuingCA);
		s.selectByVisibleText(iCA);
		Thread.sleep(2000);
		Select s1=new Select(signAlg);
		s1.selectByVisibleText(signAlg2);
		Thread.sleep(2000);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)w;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		cl_click(selctsbjctDN);
		int DNSiz=subDNCount.size();
		System.out.println(DNSiz);
		for(int i=1;i<=DNSiz;i++) {
			cl_click(b.w.findElement(By.xpath(subDNDetails.replace("#DELIM#",String.valueOf(i)))));
			Thread.sleep(1000);
		}
		cl_click(selctsbjctDN);
		Thread.sleep(2000);

		cl_click(addSubjectDN);
		cl_entertext(sbjctOID, oID);
		cl_click(saveProcdBtn);
		Thread.sleep(4000);
		et.log(LogStatus.PASS,"Save and Proceed button is clicked- passed");
		cl_entertext(authenticEmail, aEmail);
		cl_entertext(authenticTokenPw, aPswrd);
		cl_click(authenticBtn);
		Thread.sleep(6000);	
		et.log(LogStatus.PASS,"Authentic button is clicked- passed");
		boolean b = tickMark.isDisplayed();
		System.out.println("Green tick mark is displayed? "+b);
		Thread.sleep(2000);
		cl_click(cnfrmBtn);
		Thread.sleep(6000);
		et.log(LogStatus.PASS,"Confirm button is clicked- passed");
		String msg=successMsg.getText();
		System.out.println("Success msg: "+msg);
		Thread.sleep(2000);
		cl_click(viewAll);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"View All button is clicked- passed");
	}

	public void exportExcel() throws Exception {

		cl_click(exprtExclBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Export to Excel button is clicked- passed");
	}

	public void searchProfile(String pName,String aEmail,String aPswrd) throws Exception {
		cl_click(certProfile);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Certificate profile tab is clicked- passed");
		cl_click(searchBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Search button is clicked- passed");
		cl_entertext(searchinput, pName);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Enter the profile name in the search txtbox");
		cl_click(findBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Find button is clicked- passed");
		int s=certProfileSize.size();
		if(s==1) {
			System.out.println("Searched Profile Name is present");
			cl_click(viewBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"View button is clicked- passed");
			cl_click(viewClseBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"View close button is clicked- passed");
			cl_click(searchBtn);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			cl_entertext(searchinput, pName);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Enter the profile name in the search txtbox");
			cl_click(findBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Find button is clicked- passed");
			cl_click(deleteBtn);
			et.log(LogStatus.PASS,"Delete button is clicked- passed");
			cl_click(yesDelete);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Delete yes button is clicked- passed");
			cl_entertext(authenticEmail, aEmail);
			cl_entertext(authenticTokenPw, aPswrd);
			cl_click(authenticBtn);
			Thread.sleep(3000);
			et.log(LogStatus.PASS,"Authentic button is clicked- passed");
			cl_click(deleteactionBtnTxt);
			System.out.println("Delete success message: "+succesMsg.getText());
			Thread.sleep(2000);
		}else {
			System.out.println("Searched Profile Name not present: "+noDataMSg.getText());
			et.log(LogStatus.PASS,"Searched profile name is not present- passed");
		}
		cl_click(resetBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Reset button is clicked- passed");
	}

	


}
