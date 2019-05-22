package Page_Factory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import Generic_Library.Basefunctions;

public class pf_OfcrUserCertMangntPage extends pf_genericmethods  {

	Basefunctions b = new Basefunctions();
	@FindBy(how = How.XPATH, using = "//div[@class='sidebar']/div/ul/li[3]/a") WebElement userCertMngmt;
	@FindBy(how = How.XPATH, using = "//div[@id='myNavbar']/ul/li[3]/div[1]/ul/li") WebElement userCertEnroll;
	@FindBy(how = How.ID, using ="softToken") WebElement softToken;
	@FindBy(how = How.ID, using ="hardToken") WebElement hardToken;
	@FindBy(how = How.ID, using ="certPflId") WebElement certPfle;
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
	@FindBy(how = How.ID, using = "keystoreTypeId") WebElement keystoreType;
	@FindBy(how = How.ID, using = "password") WebElement password;
	@FindBy(how = How.ID, using = "cpassword") WebElement cpassword;
	@FindBy(how = How.ID, using = "saveAndProceed") WebElement saveAndProceed;
	@FindBy(how = How.ID, using = "keyProfileId") WebElement keyProfile;
	@FindBy(how = How.ID, using = "tokenPin") WebElement tokenPin;
	
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[3]/input[1]") WebElement authenticEmail;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[5]/input[1]") WebElement authenticTokenPw;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[6]/input[1]") WebElement authenticBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[6]/i[1]") WebElement tickMark;
	
	@FindBy(how = How.ID, using = "SignAndCreate") WebElement createBtn;
	@FindBy(how = How.ID, using = "pfxsuccessmsgid") WebElement pfxsuccessmsgid;
	@FindBy(how = How.ID, using = "failureMsg") WebElement failureMsg;
	
	@FindBy(how = How.ID, using = "cersuccessmsgid") WebElement cersuccessmsgid;
	
	//search
	@FindBy(how = How.XPATH, using = "//div[@id='myNavbar']/ul/li[3]/div[1]/ul/li[4]") WebElement userCertSearch;
	
	@FindBy(how = How.ID, using = "casearchID") WebElement casearchBy;
	@FindBy(how = How.ID, using = "casearchTxtbox") WebElement casearchFor;
	@FindBy(how = How.ID, using = "casearchdropdwn") WebElement casearchdropdwn;
	@FindBy(how = How.ID, using = "searchGridValues") WebElement searchBtn;
	@FindBy(how = How.ID, using = "resetbtn") WebElement resetbtn;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr")}) public List<WebElement> userCertSize;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[2]") WebElement certSlNo;
	String cm="//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[#DELIM#]/td[3]";
	String IssrName="//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[#DELIM#]/td[4]";
	
	//Revocation
	
	@FindBy(how = How.XPATH, using = "//div[@id='myNavbar']/ul/li[3]/div[1]/ul/li[2]") WebElement userCertRevoke;
	
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[6]/ul/li[2]") WebElement revokeBtn;
	
	@FindBy(how = How.ID, using = "reason") WebElement reason;
	@FindBy(how = How.ID, using = "remarks") WebElement remarks;
	@FindBy(how = How.ID, using = "revokeConfirm") WebElement revokeConfirm;
	@FindBy(how = How.ID, using = "saveId") WebElement revokeSaveBtn;
	
	@FindBy(how = How.ID, using = "succesMsg") WebElement succesMsg;
	@FindBy(how = How.XPATH, using = "//div[@id='alertWindow']/div/div/div/button") WebElement alrtCloseBtn;
	
	public pf_OfcrUserCertMangntPage(WebDriver driver){

		PageFactory.initElements(driver, this);		

	}

	public void userCertificateMngmnt() throws Exception {
		cl_click(userCertMngmt);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"User certificate management is clicked- passed");
	}

	public void userEnrollSftToken(String selectType, String certPrfle, String commonName2, String country2,
			String houseIdentifr, String org, String orgUnit, String postalCode2, String pseudonym2, String serialNo,
			String state, String street2, String telNo, String title2, String uniqueidentfr, String oid,
			String keyAlgo2, String keyStore, String password2, String cPassword2, String aEmail, String aPswrd,
			String shtName, String scriptName) throws Exception {
		
		cl_click(userCertEnroll);
		Thread.sleep(2000);
		if(selectType.equalsIgnoreCase("Hard Token")) {
			cl_click(hardToken);
			et.log(LogStatus.PASS,"HardToken radio button is clicked- passed");
		}
		Select s=new Select(certPfle);
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
		Select s2=new Select(keystoreType);
		s2.selectByVisibleText(keyStore);
		Thread.sleep(2000);
		cl_entertext(password, password2);
		cl_entertext(cpassword, cPassword2);
		Thread.sleep(2000);
		cl_click(saveAndProceed);
		Thread.sleep(5000);
		et.log(LogStatus.PASS,"Save and proceed button is clicked- passed");
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
		et.log(LogStatus.PASS,"Create button is clicked- passed");
		if(pfxsuccessmsgid.isDisplayed()) {
		String msg=pfxsuccessmsgid.getText();
		Thread.sleep(2000);
		System.out.println("Certificate create success msg: "+msg);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Certificate created successfully- passed");
		}else if(failureMsg.isDisplayed()) {
			String fmsg=failureMsg.getText();
			Thread.sleep(2000);
			System.out.println("Certificate create failure msg: "+fmsg);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Failed to create certificate");
		}
	}

	public void searchUserCert(String commonName2) throws Exception {
		
		cl_click(userCertSearch);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"User Cert-Search tab is clicked-Passed");
		Select s1=new Select(casearchBy);
		s1.selectByVisibleText("Common Name");
		cl_entertext(casearchFor, commonName2);
		et.log(LogStatus.PASS,"Enter common name-Passed");
		cl_click(searchBtn);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"Search button is clicked- passed");
//		int csize=userCertSize.size();
//		for(int j=1;j<=csize;j++) {
		int j=1;
			WebElement a = b.w.findElement(By.xpath(cm.replace("#DELIM#",String.valueOf(j))));	
			String cName=a.getText();
			WebElement aa = b.w.findElement(By.xpath(IssrName.replace("#DELIM#",String.valueOf(j))));	
			String IsrName=aa.getText();
			
			if(commonName2.equalsIgnoreCase(cName)) {
				System.out.println("Search for common name matches");
				et.log(LogStatus.PASS,"Search for common name matches- passed");
			}else {
				System.out.println("Search for common name is not matching");
				et.log(LogStatus.FAIL,"Search for common name is not matching");
			}
//		}
		cl_click(resetbtn);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"Reset button is clicked- passed");
		Select s2=new Select(casearchBy);
		s2.selectByVisibleText("Issuer Name");
		//cl_entertext(casearchFor, issName);
		Select s3=new Select(casearchdropdwn);
		s3.selectByVisibleText(IsrName);
		et.log(LogStatus.PASS,"Enter Issuer name-Passed");
		cl_click(searchBtn);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"Search button is clicked- passed");
		int isize=userCertSize.size();
		for(int i=1;i<=isize;i++) {
			WebElement ab = b.w.findElement(By.xpath(IssrName.replace("#DELIM#",String.valueOf(i))));	
			String iName=ab.getText();
			if(iName.equalsIgnoreCase(IsrName)) {
				System.out.println("Search for Issuer name matches");
				et.log(LogStatus.PASS,"Search for Issuer name matches- passed");
			}else {
				System.out.println("Search for Issuer name is not matching");
				et.log(LogStatus.FAIL,"Search for Issuer name is not matching");
			}
		}
		cl_click(resetbtn);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"Reset button is clicked- passed");
	}

	public void userCertRevocation(String commonName2,String aEmail,String aPswrd) throws Exception {
		cl_click(userCertRevoke);
		Thread.sleep(2000);
		Select s1=new Select(casearchBy);
		s1.selectByVisibleText("Common Name");
		cl_entertext(casearchFor, commonName2);
		cl_click(searchBtn);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"Search button is clicked- passed");
		
		cl_click(revokeBtn);
		Thread.sleep(2000);
		Select s=new Select(reason);
		s.selectByVisibleText("Affiliation changed");
		Thread.sleep(2000);
		cl_entertext(remarks, "test");
		cl_click(revokeConfirm);
		Thread.sleep(4000);
		cl_entertext(authenticEmail, aEmail);
		cl_entertext(authenticTokenPw, aPswrd);
		cl_click(authenticBtn);
		Thread.sleep(6000);
		et.log(LogStatus.PASS,"Authentic button is clicked- passed");
		boolean b = tickMark.isDisplayed();
		System.out.println("Green tick mark is displayed? "+b);
		Thread.sleep(2000);
		cl_click(revokeSaveBtn);
		Thread.sleep(3000);
		String msg=succesMsg.getText();
		System.out.println("Revoke success message: "+msg);
		cl_click(alrtCloseBtn);
		Thread.sleep(2000);
	}

	public void userEnrollHrdToken(String selectType, String certPrfle, String commonName2, String country2,
			String houseIdentifr, String org, String orgUnit, String postalCode2, String pseudonym2, String serialNo,
			String state, String street2, String telNo, String title2, String uniqueidentfr, String oid,
			String keyAlgo2, String keyStore, String password2, String aEmail, String aPswrd, String shtName,
			String scriptName) throws Exception {


		cl_click(userCertEnroll);
		Thread.sleep(2000);
		
		cl_click(hardToken);
		Thread.sleep(2000);
		Select s=new Select(certPfle);
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
		cl_entertext(tokenPin, password2);
		Thread.sleep(2000);
		cl_click(saveAndProceed);
		Thread.sleep(5000);
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
		String msg=cersuccessmsgid.getText();
		Thread.sleep(2000);
		System.out.println("Certificate create success msg: "+msg);
		Thread.sleep(2000);
		
	}

	
	
}
