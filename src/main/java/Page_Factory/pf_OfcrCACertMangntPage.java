package Page_Factory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import Generic_Library.Utility;

public class pf_OfcrCACertMangntPage extends pf_genericmethods  {

	
	@FindBy(how = How.XPATH, using = "//div[@class='sidebar']/div/ul/li[4]/a") WebElement caCertMngmt;
	@FindBy(how = How.XPATH, using = "//div[@id='myNavbar']/ul/li[4]/div[1]/ul/li") WebElement caCertEnroll;
	
	//CA Enrollment
	@FindBy(how = How.XPATH, using = "//div[@class='radioInner']/input[1]") WebElement selectTypeIntrnl;
	@FindBy(how = How.XPATH, using = "//div[@class='radioInner']/input[2]") WebElement selectTypeCSR;
	@FindBy(how = How.ID, using = "certProfileId") WebElement certificateProfile;
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
	@FindBy(how = How.ID, using = "keyProfileId") WebElement keyProfileId;
	@FindBy(how = How.ID, using = "saveAndProceed") WebElement saveAndProceed;
	@FindBy(how = How.ID, using = "SignAndCreate") WebElement createBtn;
	@FindBy(how = How.ID, using = "certsuccessmsgid") WebElement certsuccessmsgid;
	@FindBy(how = How.ID, using = "failureMsg") WebElement failureMsg;
	
	@FindBy(how = How.ID, using = "downloadcer") WebElement downloadcer;
	@FindBy(how = How.ID, using = "sigAlgo") WebElement sigAlgo;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[3]/input[1]") WebElement authenticEmail;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[5]/input[1]") WebElement authenticTokenPw;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[6]/input[1]") WebElement authenticBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[6]/i[1]") WebElement tickMark;
	//CSR
	
	@FindBy(how = How.ID, using = "moreParamsSelectIdSelfSig") WebElement selectDN;
	@FindBy(how = How.ID, using = "moreParamsBtnIdSelfSig") WebElement selectDNAddBtn;
	
	//CA Certificate
	
	@FindBy(how = How.XPATH, using = "//div[@id='myNavbar']/ul/li[4]/div[1]/ul/li[2]") WebElement CACertificates;
	@FindBy(how = How.XPATH, using = "//div[@class='exbtnBlk']/button[1]") WebElement imprtIssrCert;
	@FindBy(how = How.XPATH, using = "//div[@class='exbtnBlk']/button[2]") WebElement exprtExcel;
	
	//search button
	@FindBy(how = How.XPATH, using = "//div[@id='myNavbar']/ul/li[4]/div[1]/ul/li[4]") WebElement searchTab;
	@FindBy(how = How.XPATH, using = "//td[@id='pager_left']/table/tbody/tr/td[1]") WebElement searchBtn;
	@FindBy(how = How.XPATH, using = "//td[@id='pager_left']/table/tbody/tr/td[2]") WebElement resetBtn;
	@FindBy(how = How.XPATH, using = "//td[@class='fields']/select") WebElement searchByField;
	@FindBy(how = How.XPATH, using = "//td[@class='data']/input") WebElement searchField;
	@FindBy(how = How.XPATH, using = "//span[@class='ui-icon-search']") WebElement findBtn;
	@FindAll({@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr")}) public List<WebElement> OCSPCount;
	@FindBy(how = How.XPATH, using = "//td[@id='pager_right']/div/b") WebElement noDataMSg;
	@FindBy(how = How.ID, using = "casearchIDsearcherror") WebElement casearchIDsearcherror;
	@FindBy(how = How.ID, using = "searcherror") WebElement searcherror;
	
	
	
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr/td[5]/ul/li[2]") WebElement viewBtn;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr/td[5]/ul/li[3]") WebElement dwnldBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@id='viewCertificateDetails']/div/div/div[1]/button[1]") WebElement viewClose;
	@FindBy(how = How.ID, using = "downloadCertBtxId") WebElement downloadCertBtxId;
	//Revocation and Search certificate
	@FindBy(how = How.ID, using = "casearchID") WebElement casearchID;
	@FindBy(how = How.ID, using = "casearchTxtbox") WebElement casearchTxtbox;
	@FindBy(how = How.ID, using = "searchGridValues") WebElement searchRevBtn;
	@FindBy(how = How.ID, using = "resetbtn") WebElement resetbtn;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[6]/ul/li[1]/a/i") WebElement searchview;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[6]/ul/li[2]/a/i") WebElement searchdwnld;

	//signing CSR
	
	@FindBy(how = How.XPATH, using = "//div[@id='myNavbar']/ul/li[4]/div[1]/ul/li[5]") WebElement signCSR;
	@FindBy(how = How.ID, using = "csrFile") WebElement csrFile;
	@FindBy(how = How.ID, using = "userCertProfiles") WebElement certPrfle;
	@FindBy(how = How.ID, using = "certifyingAuthority") WebElement certAuthority;
	@FindBy(how = How.ID, using = "btnSubmit") WebElement csrSaveNPrcdBtn;
	@FindBy(how = How.XPATH, using = "//*[@id=\"secondDiv\"]/div[3]/div/form/div/div[4]/div[2]/input") WebElement signCSRBtn;
	
	@FindBy(how = How.ID, using = "certProfileId_error") WebElement certProfileId_error;
	@FindBy(how = How.ID, using = "keyAlgo_error") WebElement keyAlgo_error;
	
	public pf_OfcrCACertMangntPage(WebDriver driver){

		PageFactory.initElements(driver, this);		

	}

	public void caCertificateMngmnt() throws Exception {
		
		cl_click(caCertMngmt);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"CA certificate Management is clicked- passed");
	}
	public void csr(String selectType, String commonName2, String country2,
			String houseIdentifr, String org, String orgUnit, String postalCode2, String pseudonym2, String serialNo,
			String state, String street2, String telNo, String title2, String uniqueidentfr, String oid,
			String keyAlgo2, String keyPrfle,String aEmail, String aPswrd,String signAlgo, String shtName, String scriptName) throws Exception {
		cl_click(caCertEnroll);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"CA Enroll tab is clicked- passed");
		cl_click(selectTypeCSR);
		Thread.sleep(2000);
		Select s=new Select(selectDN);
		List<WebElement> optn = s.getOptions();
		for(int i=0;i<optn.size();i++) {
			
			String a=optn.get(i).getText();
			s.selectByVisibleText(a);
			cl_click(selectDNAddBtn);
			Thread.sleep(2000);
		}
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
			Thread.sleep(2000);
			Select s1=new Select(keyAlgo);
			s1.selectByVisibleText(keyAlgo2);
			Thread.sleep(2000);
			Select s11=new Select(sigAlgo);
			s11.selectByVisibleText(signAlgo);
			Thread.sleep(2000);
			Select s2=new Select(keyProfileId);
			s2.selectByVisibleText(keyPrfle);
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
			Thread.sleep(40000);
			et.log(LogStatus.PASS,"Create button is clicked- passed");
			if(certsuccessmsgid.isDisplayed()) {
				String successMsg1=certsuccessmsgid.getText();
				System.out.println("successMsg: "+successMsg1);
				cl_click(downloadcer);
				Thread.sleep(2000);
				et.log(LogStatus.PASS,"Download certificate button is clicked- passed");
			}
			else if(failureMsg.isDisplayed()) {
				String failureMsg1=failureMsg.getText();
				System.out.println("FailureMsg: "+failureMsg1);
				et.log(LogStatus.PASS,"CSR certificate creation failed");
			}
		
	}

	public void caEnrollInternl(String selectType, String certPrfle2, String commonName2, String country2,
			String houseIdentifr, String org, String orgUnit, String postalCode2, String pseudonym2, String serialNo,
			String state, String street2, String telNo, String title2, String uniqueidentfr, String oid,
			String keyAlgo2, String keyPrfle,String aEmail, String aPswrd, String shtName, String scriptName) throws Exception {
		
		cl_click(caCertEnroll);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"CA certificate Enrollment is clicked- passed");
		Select s=new Select(certificateProfile);
		s.selectByVisibleText(certPrfle2);
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
		Select s2=new Select(keyProfileId);
		s2.selectByVisibleText(keyPrfle);
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
		Thread.sleep(20000);
		et.log(LogStatus.PASS,"Create button is clicked- passed");
		if(certsuccessmsgid.isDisplayed()) {
			String successMsg1=certsuccessmsgid.getText();
			System.out.println("successMsg: "+successMsg1);
			cl_click(downloadcer);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Download certificate button is clicked- passed");
		}
		else if(failureMsg.isDisplayed()) {
			String failureMsg1=failureMsg.getText();
			System.out.println("FailureMsg: "+failureMsg1);
			et.log(LogStatus.PASS,"CSR certificate creation failed");
		}
	}

	public void searchRootCert(String commonName2,String srchBy,String srchFor) throws Exception {
		
		cl_click(searchTab);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Search tab is clicked- passed");
		cl_click(searchRevBtn);
		et.log(LogStatus.PASS,"Search button is clicked- passed");
		String msg1=casearchIDsearcherror.getText();
		if(msg1.equals(srchBy)) {
			System.out.println("Actual and expected result for Search By matches");
			et.log(LogStatus.PASS,"Actual and expected result for Search By matches");
		}else {
			System.out.println("Actual and expected result for Search By not matches");
			et.log(LogStatus.FAIL,"Actual and expected result for Search By not matches");
		}
		Select s=new Select(casearchID);
		s.selectByVisibleText("Common Name");
		et.log(LogStatus.PASS,"Select search by value- passed");
		Thread.sleep(1000);
		cl_click(searchRevBtn);
		et.log(LogStatus.PASS,"Search button is clicked- passed");
		String msg2=searcherror.getText();
		if(msg2.equals(srchFor)) {
			System.out.println("Actual and expected result for Search For matches");
			et.log(LogStatus.PASS,"Actual and expected result for Search For matches");
		}else {
			System.out.println("Actual and expected result for Search For not matches");
			et.log(LogStatus.FAIL,"Actual and expected result for Search For not matches");
		}
		
		cl_entertext(casearchTxtbox, commonName2);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Enter search for value- passed");
		cl_click(searchRevBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Search button is clicked- passed");
		int s1=OCSPCount.size();
		if(s1>=1) {
			System.out.println("Searched certificate present");
			cl_click(searchview);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Search view button is clicked- passed");
			cl_click(viewClose);
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Search view close button is clicked- passed");
			cl_click(searchdwnld);
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Search download button is clicked- passed");
			cl_click(downloadCertBtxId);
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Download button is clicked- passed");
		}else {
			System.out.println("Searched certificate not present");
			et.log(LogStatus.PASS,"Searched certificate not present- passed");
		}
		
	}

	public void signingCSR(String commonName2, String aEmail, String aPswrd) throws Exception {
		cl_click(signCSR);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Sign CSR tab is clicked- passed");
		cl_entertext(csrFile, "");
		Select s=new Select(certPrfle);
		s.selectByVisibleText("");
		cl_click(csrSaveNPrcdBtn);
		Thread.sleep(4000);
		cl_entertext(authenticEmail, aEmail);
		cl_entertext(authenticTokenPw, aPswrd);
		cl_click(authenticBtn);
		Thread.sleep(6000);
		et.log(LogStatus.PASS,"Authentic button is clicked- passed");
		boolean b = tickMark.isDisplayed();
		System.out.println("Green tick mark is displayed? "+b);
		Thread.sleep(2000);
		cl_click(signCSRBtn);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"Sign CSR button is clicked- passed");
	}

	public void CertProfileErrorCheck(String shtName, String scriptName) throws Exception {
		cl_click(caCertEnroll);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"CA certificate Enrollment is clicked- passed");
		cl_click(saveAndProceed);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Save and Proceed button is clicked- passed");
		String msg=certProfileId_error.getText();
		Utility.comparelogic(msg, shtName, scriptName);
	}

	public void keySizeErrorCheck(String shtName, String scriptName) throws Exception {
		
		String msg=keyAlgo_error.getText();
		Utility.comparelogic(msg, shtName, scriptName);
	}

	public void CACert(String commonName2) throws Exception {
		cl_click(CACertificates);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"CA certificate tab is clicked- passed");
		cl_click(exprtExcel);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Export to Excel button is clicked- passed");
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
		}else {
			System.out.println("Searched OCSP not present: "+noDataMSg.getText());
			et.log(LogStatus.PASS,"Searched OCSP not present- passed");
		}
		cl_click(resetBtn);
		et.log(LogStatus.PASS,"Reset button is clicked- passed");
		Thread.sleep(2000);
		
	}


	
}
