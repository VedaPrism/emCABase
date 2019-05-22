package Page_Factory;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import Generic_Library.Utility;

public class pf_OfcrOCSPMangntPage extends pf_genericmethods  {

	@FindBy(how = How.XPATH, using = "//div[@class='sidebar']/div/ul/li[6]/a") WebElement OSCPMngmt;
	@FindBy(how = How.XPATH, using = "//div[@id='myNavbar']/ul/li[6]/div[1]/ul/li") WebElement manageOSCP;
	@FindBy(how = How.XPATH, using = "//div[@class='exbtnBlk']/a") WebElement newBtn;
	
	@FindBy(how = How.ID, using ="certProfileId") WebElement certProfile;
	@FindBy(how = How.ID, using ="txt_1CommonName") WebElement commonName;
	@FindBy(how = How.ID, using = "txt_1Country") WebElement country;
	@FindBy(how = How.ID, using = "txt_1HouseIdentifier") WebElement houseIdentifier;
	@FindBy(how = How.ID, using = "txt_1Organisation") WebElement organisation;
	@FindBy(how = How.ID, using = "txt_1OrganisationUnit") WebElement organisationUnit;
	@FindBy(how = How.ID, using = "txt_1PostalCode") WebElement postalCode;
	@FindBy(how = How.ID, using = "txt_1Pseudonym") WebElement pseudonym;
	@FindBy(how = How.ID, using = "txt_1SerialNumber") WebElement serialNumber;
	@FindBy(how = How.ID, using = "txt_1StateOrProvince") WebElement stateOrProvince;
	@FindBy(how = How.ID, using = "txt_1Street") WebElement street;
	@FindBy(how = How.ID, using = "txt_1TelephoneNumber") WebElement telephoneNumber;
	@FindBy(how = How.ID, using = "txt_1Title") WebElement title;
	@FindBy(how = How.ID, using = "txt_1UniqueIdentifier") WebElement uniqueIdentifier;
	@FindBy(how = How.ID, using = "oidVal_0") WebElement oidVal;
	@FindBy(how = How.ID, using = "keyAlgo") WebElement keyAlgo;
	@FindBy(how = How.ID, using = "keyProfileId") WebElement keyProfile;
	@FindBy(how = How.ID, using = "saveAndProceed") WebElement saveAndProceed;
	@FindBy(how = How.ID, using = "SignAndCreate") WebElement createBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[3]/input[1]") WebElement authenticEmail;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[5]/input[1]") WebElement authenticTokenPw;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[6]/input[1]") WebElement authenticBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[6]/i[1]") WebElement tickMark;
	
	@FindBy(how = How.XPATH, using = "//div[@class='exbtnBlk']/a[2]") WebElement cnfgreOCSP;
	
	@FindBy(how = How.ID, using = "registerdCAId") WebElement registerdCAId;
	@FindBy(how = How.ID, using = "OcspUrlId") WebElement OcspUrlId;
	@FindBy(how = How.ID, using = "OCSPCertificateId") WebElement OCSPCertificateId;
	@FindBy(how = How.ID, using = "SignAndMap") WebElement SignAndMap;
	
	@FindBy(how = How.ID, using = "successMsg") WebElement successMsg;
	
	@FindBy(how = How.XPATH, using = "//div[@class='exbtnBlk']/a[3]") WebElement exprtOCSP;
	
	//error messsages
	@FindBy(how = How.ID, using = "certProfileId_error") WebElement certProfileId_error;
	@FindBy(how = How.ID, using = "CommonName_1error") WebElement CommonName_1error;
	@FindBy(how = How.ID, using = "Country_1error") WebElement Country_1error;
	@FindBy(how = How.ID, using = "HouseIdentifier_1error") WebElement HouseIdentifier_1error;
	@FindBy(how = How.ID, using = "Organisation_1error") WebElement Organisation_1error;
	@FindBy(how = How.ID, using = "OrganisationUnit_1error") WebElement OrganisationUnit_1error;
	@FindBy(how = How.ID, using = "PostalCode_1error") WebElement PostalCode_1error;
	@FindBy(how = How.ID, using = "Pseudonym_1error") WebElement Pseudonym_1error;
	@FindBy(how = How.ID, using = "SerialNumber_1error") WebElement SerialNumber_1error;
	@FindBy(how = How.ID, using = "StateOrProvince_1error") WebElement StateOrProvince_1error;
	@FindBy(how = How.ID, using = "Street_1error") WebElement Street_1error;
	@FindBy(how = How.ID, using = "TelephoneNumber_1error") WebElement TelephoneNumber_1error;	
	@FindBy(how = How.ID, using = "Title_1error") WebElement Title_1error;
	@FindBy(how = How.ID, using = "UniqueIdentifier_1error") WebElement UniqueIdentifier_1error;
	@FindBy(how = How.ID, using = "keyAlgo_error") WebElement keyAlgo_error;
	@FindBy(how = How.ID, using = "keyProfileId_error") WebElement keyProfileId_error;

	@FindBy(how = How.ID, using = "warningMsg") WebElement warningMsg;
	@FindBy(how = How.ID, using = "signFailError0") WebElement signFailError0;
	@FindBy(how = How.XPATH, using = "//div[@id='alertWindow']/div/div/div/button") WebElement warningMsgClseButton;
	
	@FindBy(how = How.ID, using = "failureMsg") WebElement failureMsg;
	
	//search button
	@FindBy(how = How.XPATH, using = "//td[@id='pager_left']/table/tbody/tr/td[1]") WebElement searchBtn;
	@FindBy(how = How.XPATH, using = "//td[@id='pager_left']/table/tbody/tr/td[2]") WebElement resetBtn;
	@FindBy(how = How.XPATH, using = "//td[@class='fields']/select") WebElement searchByField;
	@FindBy(how = How.XPATH, using = "//td[@class='data']/input") WebElement searchField;
	@FindBy(how = How.XPATH, using = "//span[@class='ui-icon-search']") WebElement findBtn;
	@FindAll({@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr")}) public List<WebElement> OCSPCount;
	@FindBy(how = How.XPATH, using = "//td[@id='pager_right']/div/b") WebElement noDataMSg;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr/td[7]/ul/li[1]") WebElement viewBtn;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr/td[7]/ul/li[2]") WebElement dwnldBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@id='viewCertificateDetails']/div/div/div[1]/button[1]") WebElement viewClose;
	@FindBy(how = How.ID, using = "downloadCertBtxId") WebElement downloadCertBtxId;
	
	//Error message in config OCSP
	@FindBy(how = How.ID, using = "registerdCAId_error") WebElement registerdCAId_error;
	@FindBy(how = How.ID, using = "OcspUrlId_error") WebElement OcspUrlId_error;
	@FindBy(how = How.ID, using = "OCSPCertificateId_error") WebElement OCSPCertificateId_error;
	
	public pf_OfcrOCSPMangntPage(WebDriver driver){

		PageFactory.initElements(driver, this);		

	}


	public void oscpManagement() throws Exception {

		cl_click(OSCPMngmt);
		Thread.sleep(2000);
		
	}

	public void oscpManagementsaveProcdBtn() throws Exception {

		cl_click(OSCPMngmt);
		Thread.sleep(2000);
		
	}
	public void mngeOSCP(String certPrfle, String commonName2, String country2, String houseIdentifr, String org,
			String orgUnit, String postalCode2, String pseudonym2, String serialNo, String state, String street2,
			String telNo, String title2, String uniqueidentfr, String oid, String keyAlgo2, String keyStore,
			String aEmail, String aPswrd, String shtName, String scriptName) throws Exception {
		
		cl_click(manageOSCP);
		Thread.sleep(2000);
		cl_click(newBtn);
		Thread.sleep(2000);
		Select s=new Select(certProfile);
		s.selectByVisibleText(certPrfle);
		Thread.sleep(2000);
		cl_entertext(commonName, commonName2);
		cl_entertext(country, country2);
		cl_entertext(houseIdentifier, houseIdentifr);
		cl_entertext(organisation, org);		
		cl_entertext(organisationUnit, orgUnit);
		cl_entertext(postalCode, postalCode2);
		cl_entertext(pseudonym, pseudonym2);
		cl_entertext(serialNumber, serialNo);	
		cl_entertext(stateOrProvince, state);
		cl_entertext(street, street2);
		cl_entertext(telephoneNumber, telNo);
		cl_entertext(title, title2);
		cl_entertext(uniqueIdentifier, uniqueidentfr);
		cl_entertext(oidVal, oid);
		Select s1=new Select(keyAlgo);
		s1.selectByVisibleText(keyAlgo2);
		Thread.sleep(2000);
		Select s2=new Select(keyProfile);
		s2.selectByVisibleText(keyStore);
		Thread.sleep(2000);
		cl_click(saveAndProceed);
		Thread.sleep(4000);
		cl_entertext(authenticEmail, aEmail);
		cl_entertext(authenticTokenPw, aPswrd);
		cl_click(authenticBtn);
		Thread.sleep(6000);
		et.log(LogStatus.PASS,"Authentic button is clicked- passed");
		boolean b = tickMark.isDisplayed();
		System.out.println("Green tick mark is displayed? "+b);
		Thread.sleep(2000);
		cl_click(createBtn);
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

	public void exportToExcel() throws Exception{
		cl_click(manageOSCP);
		Thread.sleep(2000);
		cl_click(exprtOCSP);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Export to Excel button is clicked- passed");
	}


	public void CertProfileErrorCheck(String shtName, String scriptName) throws Exception {
		cl_click(manageOSCP);
		Thread.sleep(2000);
		cl_click(newBtn);
		Thread.sleep(2000);
		cl_click(saveAndProceed);
		Thread.sleep(2000);
		String msg=certProfileId_error.getText();
		System.out.println(msg);
		Utility.comparelogic(msg, shtName, scriptName);
	}


	public void commonNameErrorCheck(String certPrfle,String shtName, String scriptName) throws Exception {
		Select s=new Select(certProfile);
		s.selectByVisibleText(certPrfle);
		Thread.sleep(2000);
		((JavascriptExecutor)w).executeScript("arguments[0].scrollIntoView();", saveAndProceed);
		cl_click(saveAndProceed);
		Thread.sleep(2000);
		String msg=CommonName_1error.getText();
		Utility.comparelogic(msg, shtName, scriptName);
	}


	public void countryErrorCheck(String shtName, String scriptName) throws Exception {
		String msg=Country_1error.getText();
		et =  es.startTest("Country Error Check");
		Utility.comparelogic(msg, shtName, scriptName);		
	}

	public void HouseIdnfrErrorCheck(String shtName, String scriptName) throws Exception {
		String msg=HouseIdentifier_1error.getText();
		et =  es.startTest("House Identifier Error Check");
		Utility.comparelogic(msg, shtName, scriptName);	
		
	}
	public void organizationErrorCheck(String shtName, String scriptName) throws Exception {
		String msg=Organisation_1error.getText();
		et =  es.startTest("Organization Error Check");
		Utility.comparelogic(msg, shtName, scriptName);	
		
	}


	public void organizationUnitErrorCheck(String shtName, String scriptName) throws Exception {
		String msg=OrganisationUnit_1error.getText();
		et =  es.startTest("OrganisationUnit Error Check");
		Utility.comparelogic(msg, shtName, scriptName);	
		
	}


	public void PostalCodeErrorCheck(String shtName, String scriptName) throws Exception {
		String msg=PostalCode_1error.getText();
		et =  es.startTest("PostalCode Error Check");
		Utility.comparelogic(msg, shtName, scriptName);	
		
	}


	public void pseudonymErrorCheck(String shtName, String scriptName) throws Exception {
		String msg=Pseudonym_1error.getText();
		et =  es.startTest("Pseudonym Error Check");
		Utility.comparelogic(msg, shtName, scriptName);	
		
	}


	public void serialNumErrorCheck(String shtName, String scriptName) throws Exception {
		String msg=SerialNumber_1error.getText();
		et =  es.startTest("SerialNumber Error Check");
		Utility.comparelogic(msg, shtName, scriptName);	
		
	}


	public void stateErrorCheck(String shtName, String scriptName) throws Exception {
		String msg=StateOrProvince_1error.getText();
		et =  es.startTest("StateOrProvince Error Check");
		Utility.comparelogic(msg, shtName, scriptName);	
		
	}


	public void streetErrorCheck(String shtName, String scriptName) throws Exception {
		String msg=Street_1error.getText();
		et =  es.startTest("Street Error Check");
		Utility.comparelogic(msg, shtName, scriptName);	
		
	}


	public void TelNumErrorCheck(String shtName, String scriptName) throws Exception {
		String msg=TelephoneNumber_1error.getText();
		et =  es.startTest("TelephoneNumber Error Check");
		Utility.comparelogic(msg, shtName, scriptName);	
		
	}


	public void titleErrorCheck(String shtName, String scriptName) throws Exception {
		String msg=Title_1error.getText();
		et =  es.startTest("Title Error Check");
		Utility.comparelogic(msg, shtName, scriptName);	
		
	}


	public void uniqueIdenfrErrorCheck(String shtName, String scriptName) throws Exception {
		String msg=UniqueIdentifier_1error.getText();
		et =  es.startTest("UniqueIdentifier Error Check");
		Utility.comparelogic(msg, shtName, scriptName);	
		
	}


	public void keySizeErrorCheck(String shtName, String scriptName) throws Exception {
		String msg=keyAlgo_error.getText();
		et =  es.startTest("keyAlgo Error Check");
		Utility.comparelogic(msg, shtName, scriptName);	
		
	}


	public void keyProfileErrorCheck(String shtName, String scriptName) throws Exception {
		String msg=keyProfileId_error.getText();
		et =  es.startTest("keyProfile Error Check");
		Utility.comparelogic(msg, shtName, scriptName);	
		
	}


	public void manageOCSPAuthentic(String certPrfle, String commonName2, String country2, String houseIdentifr,
			String org, String orgUnit, String postalCode2, String pseudonym2, String serialNo, String state,
			String street2, String telNo, String title2, String uniqueidentfr, String oid, String keyAlgo2,
			String keyStore, String aEmail, String aPswrd, String shtName, String scriptName) throws Exception {
		cl_click(manageOSCP);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Manage OCSP tab is clicked- passed");
		cl_click(newBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"New button is clicked- passed");
		Select s=new Select(certProfile);
		s.selectByVisibleText(certPrfle);
		Thread.sleep(2000);
		cl_entertext(commonName, commonName2);
		cl_entertext(country, country2);
		cl_entertext(houseIdentifier, houseIdentifr);
		cl_entertext(organisation, org);		
		cl_entertext(organisationUnit, orgUnit);
		cl_entertext(postalCode, postalCode2);
		cl_entertext(pseudonym, pseudonym2);
		cl_entertext(serialNumber, serialNo);	
		cl_entertext(stateOrProvince, state);
		cl_entertext(street, street2);
		cl_entertext(telephoneNumber, telNo);
		cl_entertext(title, title2);
		cl_entertext(uniqueIdentifier, uniqueidentfr);
		cl_entertext(oidVal, oid);
		Select s1=new Select(keyAlgo);
		s1.selectByVisibleText(keyAlgo2);
		Thread.sleep(2000);
		Select s2=new Select(keyProfile);
		s2.selectByVisibleText(keyStore);
		Thread.sleep(2000);
		cl_click(saveAndProceed);
		et.log(LogStatus.PASS,"Save and proceed button is clicked- passed");
		cl_click(authenticBtn);
		Thread.sleep(6000);
		et.log(LogStatus.PASS,"Authentic button without email&pwd is clicked- passed");
		String msg=signFailError0.getText();
		Utility.comparelogic(msg, shtName, scriptName);
		
	}


	public void manageOCSPwithoutAutnctn(String shtName, String scriptName) throws Exception {
	
		Thread.sleep(2000);
		cl_click(createBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Create button without authentic is clicked- passed");
		String msg=warningMsg.getText();
		cl_click(warningMsgClseButton);
		et.log(LogStatus.PASS,"Warning msg close button is clicked- passed");
		Utility.comparelogic(msg, shtName, scriptName);
		
	}


	public void searchOSCP(String commonName2) throws Exception {
		cl_click(manageOSCP);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Manage OCSP tab is clicked- passed");
		cl_click(searchBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Search button is clicked- passed");
		Select s=new Select(searchByField);
		s.selectByVisibleText("Common Name");
		cl_entertext(searchField, commonName2);
		cl_click(findBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Find button present in search box is clicked- passed");
		int size=OCSPCount.size();
		if(size >= 1) {
			System.out.println("Searched OCSP is present");
			cl_click(viewBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"View button is clicked- passed");
			cl_click(viewClose);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"View Close button is clicked- passed");
			cl_click(dwnldBtn);
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Download button present in Actions is clicked- passed");
			cl_click(downloadCertBtxId);
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Download button is clicked- passed");
		}else if(noDataMSg.isDisplayed()) {
			System.out.println("Searched OCSP not present: "+noDataMSg.getText());
			et.log(LogStatus.PASS,"Searched OCSP not present- passed");
		}
		cl_click(resetBtn);
		et.log(LogStatus.PASS,"Reset button is clicked- passed");
		Thread.sleep(2000);
	}


	public void regCAErrCheck(String shtName,String scriptName) throws Exception {
		cl_click(manageOSCP);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Manage OCSP tab is clicked- passed");
		cl_click(cnfgreOCSP);
		et.log(LogStatus.PASS,"Configure OCSP button is clicked- passed");
		cl_click(saveAndProceed);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Save and proceed button is clicked- passed");
		String msg=registerdCAId_error.getText();
		Thread.sleep(2000);
		Utility.comparelogic(msg, shtName, scriptName);
	}


	public void OCSPURLErrCheck(String shtName,String scriptName) throws Exception {
		
		String msg=OcspUrlId_error.getText();
		Thread.sleep(2000);
		
		Utility.comparelogic(msg, shtName, scriptName);
		
	}

	public void OCSPCertErrChck(String shtName,String scriptName) throws Exception {
		
		String msg=OCSPCertificateId_error.getText();
		Thread.sleep(2000);
		Utility.comparelogic(msg, shtName, scriptName);
	}
	
	public void configureOSCP(String rCA,String commonName,String aEmail,String aPswrd) throws Exception {
		
		Select s=new Select(registerdCAId);
		s.selectByVisibleText(rCA);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Enter registered CA id- passed");
		String url=Utility.getpropertydetails("OCSPURL");
		cl_entertext(OcspUrlId, url);
		et.log(LogStatus.PASS,"Enter OCSP URl- passed");
		Select s1=new Select(OCSPCertificateId);
		s1.selectByVisibleText(commonName);
		Thread.sleep(2000);
		cl_click(saveAndProceed);
		Thread.sleep(4000);
		et.log(LogStatus.PASS,"Save and proceed button is clicked- passed");
		cl_entertext(authenticEmail, aEmail);
		cl_entertext(authenticTokenPw, aPswrd);
		cl_click(authenticBtn);
		Thread.sleep(6000);
		et.log(LogStatus.PASS,"Authentic button is clicked- passed");
		boolean b = tickMark.isDisplayed();
		System.out.println("Green tick mark is displayed? "+b);
		Thread.sleep(2000);
		cl_click(SignAndMap);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"Sign and map button is clicked- passed");
		if(successMsg.isDisplayed()) {
			String successMsg1=successMsg.getText();
			System.out.println("successMsg: "+successMsg1);
			et.log(LogStatus.PASS,"Configure OCSP success- passed");
		}
		else if(failureMsg.isDisplayed()) {
			String failureMsg1=failureMsg.getText();
			System.out.println("FailureMsg: "+failureMsg1);
			et.log(LogStatus.PASS,"Failed to Configure OCSP");
		}
	}
	
}
