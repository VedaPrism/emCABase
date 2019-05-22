package Page_Factory;


import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import Generic_Library.Utility;

public class pf_CreateUserPage extends pf_genericmethods {

	@FindBy(how = How.XPATH, using = "//div[@id='alertWindow']/div/div/div/button") WebElement alertClseBtn;
	@FindBy(how = How.XPATH, using = "//ul[@id='accordion']/li[8]/a") WebElement roleUserMngmnt;
	@FindBy(how = How.XPATH, using = "//div[@id='myNavbar']/ul/li[8]/div[1]/ul/li[1]/a") WebElement createMngeUser;
	@FindBy(how = How.XPATH, using = "//div[@class='exbtnBlk']/a") WebElement newUserBtn;
	//save and proceed btn
	@FindBy(how = How.ID, using = "createUserSaveAndProceed") WebElement createUserSaveAndProceed;
	//without filling details click on createUserSaveAndProceed
	@FindBy(how = How.ID, using = "commonNameError") WebElement commonNameError;
	@FindBy(how = How.ID, using = "emailError") WebElement emailError;
	@FindBy(how = How.ID, using = "organizationError") WebElement organizationError;
	@FindBy(how = How.ID, using = "countryError") WebElement countryError;
	@FindBy(how = How.ID, using = "roleError") WebElement roleError;
	@FindBy(how = How.ID, using = "tokenPwdError") WebElement tokenPwdError;
	@FindBy(how = How.ID, using = "signatureAlgError") WebElement signatureAlgError;
	@FindBy(how = How.ID, using = "keySizeError") WebElement keySizeError;
	@FindBy(how = How.ID, using = "validity_error") WebElement validity_error;
	@FindBy(how = How.ID, using = "issuerTokenPwdError") WebElement issuerTokenPwdError;
	@FindBy(how = How.ID, using = "postalError") WebElement postalError;
	@FindBy(how = How.ID, using = "telephoneNumberError") WebElement telephoneNumberError;
	@FindBy(how = How.ID, using = "cityError") WebElement cityError;
	@FindBy(how = How.ID, using = "stateError") WebElement stateError;
	
	@FindBy(how = How.ID, using = "commonName") WebElement commonName;
	@FindBy(how = How.ID, using = "email") WebElement email;
	@FindBy(how = How.ID, using = "organization") WebElement organization;
	@FindBy(how = How.ID, using = "telephoneNumber") WebElement telephoneNumber;
	@FindBy(how = How.ID, using = "city") WebElement city;
	@FindBy(how = How.ID, using = "state") WebElement state;
	@FindBy(how = How.ID, using = "postal") WebElement postal;
	@FindBy(how = How.ID, using = "country") WebElement country;
	@FindBy(how = How.ID, using = "role") WebElement role;
	@FindBy(how = How.ID, using = "tokenPwd") WebElement tokenPwd;
	@FindBy(how = How.ID, using = "signatureAlg") WebElement signatureAlg;
	@FindBy(how = How.ID, using = "keySize") WebElement keySize;
	@FindBy(how = How.XPATH, using = "//div[@class='bdp-input']/div[1]/input") WebElement vDays;
	@FindBy(how = How.XPATH, using = "//div[@class='bdp-input']/div[2]/input") WebElement vHours;
	@FindBy(how = How.XPATH, using = "//div[@class='bdp-input']/div[3]/input") WebElement vMinutes;
	@FindBy(how = How.XPATH, using = "//div[@class='bdp-input']/div[4]/input") WebElement vSeconds;
	@FindBy(how = How.ID, using = "issuerTokenPwd") WebElement issuerTokenPwd;

	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[3]/input[1]") WebElement authenticEmail;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[5]/input[1]") WebElement authenticTokenPw;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[6]/input[1]") WebElement authenticBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[6]/i[1]") WebElement tickMark;

	@FindBy(how = How.ID, using = "createUserSignAndConfirm") WebElement createUserSignAndConfirm;
	@FindBy(how = How.ID, using = "userSuccessDiv") WebElement userSuccessDiv;


	//export to excel
	@FindBy(how = How.XPATH, using = "//div[@class='exbtnBlk']/button") WebElement exprtExcelBtn;

	//ca admin page
	@FindBy(how = How.ID, using = "group") WebElement group;
	//ca admin search button
	
	
	@FindBy(how = How.ID, using = "viewAllUsers") WebElement viewAllUsers;
	@FindBy(how = How.XPATH, using = "//*[@id=\"search_grid\"]/div/span") WebElement caAdmnSearch;
	@FindBy(how = How.XPATH, using = "//*[@id=\"refresh_grid\"]/div/span") WebElement caAdmnReset;
	
	@FindBy(how = How.XPATH, using = "//td[@class='fields']/select") WebElement searchBY;
	@FindBy(how = How.XPATH, using = "//*[@id=\"fbox_grid\"]/table/tbody/tr[1]/td[3]/input") WebElement searchText;
	@FindBy(how = How.XPATH, using = "//*[@id=\"fbox_grid\"]/table/tfoot/tr/td[1]/span[2]/span") WebElement findBtn;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[8]/ul/li[1]/a/i") WebElement viewBtn;
	@FindBy(how = How.XPATH, using = "//*[@id=\"viewCertificateDetails\"]/div/div/div[1]/button") WebElement viewCloseBtn;
	
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[8]/ul/li[3]/a/i") WebElement deleteBtn;
	@FindBy(how = How.XPATH, using = "//*[@id='ConfirmationBts']/button[1]") WebElement yesDelete;
	@FindBy(how = How.ID, using = "actionBtnTxt") WebElement deleteButton;
	@FindBy(how = How.ID, using = "succesMsg") WebElement succesMsg;
	@FindBy(how = How.XPATH, using = "//*[@id=\"alertWindow\"]/div/div/div[1]/button") WebElement successCloseBtn;
	
	
	public pf_CreateUserPage(WebDriver driver){

		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,30);

	}

	public void commonNameErrorCheck(String shtName,String scriptName) throws Exception {
		if(alertClseBtn.isDisplayed()) {
			cl_click(alertClseBtn);
		}
		Thread.sleep(2000);
		cl_click(roleUserMngmnt);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Role and User Management tab is clicked- passed");
		cl_click(createMngeUser);
		et.log(LogStatus.PASS,"Manage Users tab is clicked- passed");
		cl_click(newUserBtn);
		et.log(LogStatus.PASS,"New User button is clicked- passed");
		((JavascriptExecutor) w).executeScript("arguments[0].scrollIntoView(true);", createUserSaveAndProceed);
		cl_click(createUserSaveAndProceed);
		String msg=commonNameError.getText();
		et =  es.startTest("commonName Error Check");
		Utility.comparelogic(msg, shtName, scriptName);
	}

	public void emailErrorCheck(String shtName,String scriptName) throws Exception {
		String msg=emailError.getText();
		et =  es.startTest("Email Error Check");
		Utility.comparelogic(msg, shtName, scriptName);

	}

	public void organizationErrorCheck(String shtName,String scriptName) throws Exception {
		String msg=organizationError.getText();
		et =  es.startTest("Organization Error Check");
		Utility.comparelogic(msg, shtName, scriptName);

	}

	public void countryErrorCheck(String shtName,String scriptName) throws Exception {

		String msg=countryError.getText();
		et =  es.startTest("Country Error Check");
		Utility.comparelogic(msg, shtName, scriptName);
	}

	public void roleErrorCheck(String shtName,String scriptName) throws Exception {

		String msg=roleError.getText();
		et =  es.startTest("Role Error Check");
		Utility.comparelogic(msg, shtName, scriptName);
	}

	public void tokenPwdErrorCheck(String shtName,String scriptName) throws Exception {

		String msg=tokenPwdError.getText();
		et =  es.startTest("Token Password Error Check");
		Utility.comparelogic(msg, shtName, scriptName);
	}

	public void signatureAlgErrorCheck(String shtName,String scriptName) throws Exception {
		String msg=signatureAlgError.getText();
		et =  es.startTest("Signature Algorithm Error Check");
		Utility.comparelogic(msg, shtName, scriptName);

	}

	public void keySizeErrorCheck(String shtName,String scriptName) throws Exception {

		String msg=keySizeError.getText();
		et =  es.startTest("Key Size Error Check");
		Utility.comparelogic(msg, shtName, scriptName);
	}

	public void validity_errorCheck(String shtName,String scriptName) throws Exception {
		String msg=validity_error.getText();
		et =  es.startTest("Validity Error Check");
		Utility.comparelogic(msg, shtName, scriptName);

	}

	public void issuerTokenPwdErrorCheck(String shtName,String scriptName) throws Exception {

		String msg=issuerTokenPwdError.getText();
		et =  es.startTest("IssuerTokenPwd Error Check");
		Utility.comparelogic(msg, shtName, scriptName);
	}

	public void createUser(String cName, String email2, String orgName, String telNo, String city2,
			String state2, String zip, String country2, String role2, String tPswd, String signAlgo, String keyAlgo,
			String vDay, String vHours2, String vMin, String vSec, String issurTknPswd, String aEmail, String aPswrd,
			String shtName, String scriptName) throws Exception {

		//cl_click(roleUserMngmnt);
		Thread.sleep(2000);
		cl_click(createMngeUser);
		et.log(LogStatus.PASS,"Create and Manage User is clicked- passed");
		cl_click(newUserBtn);
		et.log(LogStatus.PASS,"New User button is clicked- passed");
		cl_entertext(commonName, cName);
		cl_entertext(email, email2);
		cl_entertext(organization, orgName);
		cl_entertext(telephoneNumber, telNo);
		cl_entertext(city, city2);
		cl_entertext(state, state2);
		cl_entertext(postal, zip);
		cl_entertext(country, country2);
		Select s=new Select(role);
		s.selectByVisibleText(role2);
		cl_entertext(tokenPwd, tPswd);
		String[] exp={"--Select--","SHA1WithRSA","SHA256WithRSA","SHA384WithRSA","SHA512WithRSA"};
		Select s1=new Select(signatureAlg);
		List<WebElement> options = s1.getOptions(); 
		cl_dropdownCheck(exp,options);
		Thread.sleep(2000);
		s1.selectByVisibleText(signAlgo);
		String[] expKeyAlgo={"--Select--","RSA-1024","RSA-2048","RSA-4096"};
		Select s2=new Select(keySize);
		List<WebElement> keyAlgoOptn = s2.getOptions(); 
		cl_dropdownCheck(expKeyAlgo,keyAlgoOptn);
		Thread.sleep(1000);
		s2.selectByVisibleText(keyAlgo);
		vDays.clear();
		cl_entertext(vDays, vDay);
		vHours.clear();
		cl_entertext(vHours, vHours2);
		vMinutes.clear();
		cl_entertext(vMinutes, vMin);
		vSeconds.clear();
		cl_entertext(vSeconds, vSec);
		cl_entertext(issuerTokenPwd, issurTknPswd);
		Thread.sleep(2000);
		try {
			cl_click(createUserSaveAndProceed);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Create User save and Proceed button is clicked- passed");
			cl_entertext(authenticEmail, aEmail);
			cl_entertext(authenticTokenPw, aPswrd);
			cl_click(authenticBtn);
			Thread.sleep(6000);
			et.log(LogStatus.PASS,"Authentic button is clicked- passed");
			boolean b = tickMark.isDisplayed();
			System.out.println("Green tick mark is displayed? "+b);
			Thread.sleep(2000);
			((JavascriptExecutor) w).executeScript("arguments[0].scrollIntoView(true);", createUserSignAndConfirm);
			cl_click(createUserSignAndConfirm);
			Thread.sleep(20000);
			et.log(LogStatus.PASS,"Create User button is clicked- passed");
			((JavascriptExecutor) w).executeScript("arguments[0].scrollIntoView(true);", userSuccessDiv);
			String msg=userSuccessDiv.getText();
			System.out.println("Message: "+msg);
			Thread.sleep(2000);
			Utility.comparelogic(msg, shtName, scriptName);
			et.log(LogStatus.PASS,"Success message is displayed- passed");
		}catch(Exception e) {
			if(commonNameError.isDisplayed()) {
				System.out.println("Common Name error msg: "+commonNameError.getText());
				et.log(LogStatus.PASS,"Common Name error msg");
			}
			if(emailError.isDisplayed()) {
				System.out.println("Email Id error msg: "+emailError.getText());
				et.log(LogStatus.PASS,"Email Id error msg");
			}
			if(organizationError.isDisplayed()) {
				System.out.println("Organization error msg: "+organizationError.getText());
				et.log(LogStatus.PASS,"Organization error msg");
			}
			if(countryError.isDisplayed()) {
				System.out.println("Country error msg: "+countryError.getText());
				et.log(LogStatus.PASS,"Country error msg");
			}
			if(telephoneNumberError.isDisplayed()) {
				System.out.println("Telephone Num error msg: "+telephoneNumberError.getText());
				et.log(LogStatus.PASS,"Telephone Num error msg");
			}
			if(cityError.isDisplayed()) {
				System.out.println("City error msg: "+cityError.getText());
				et.log(LogStatus.PASS,"City error msg");
			}		
			if(stateError.isDisplayed()) {
				System.out.println("State error msg: "+stateError.getText());
				et.log(LogStatus.PASS,"State error msg");
			}
			
			if(postalError.isDisplayed()) {
				System.out.println("Postal Code error msg: "+postalError.getText());
				et.log(LogStatus.PASS,"Postal Code error msg");
			}
			if(countryError.isDisplayed()) {
				System.out.println("Country error msg: "+countryError.getText());
				et.log(LogStatus.PASS,"Country error msg");
			}
			if(validity_error.isDisplayed()) {
				System.out.println("Validity error msg: "+validity_error.getText());
				et.log(LogStatus.PASS,"Validity error msg");
			}
			
		}
	}

	public void exportToExcel() throws Exception {
		Thread.sleep(2000);
		cl_click(createMngeUser);
		et.log(LogStatus.PASS,"Create and Manage User is clicked- passed");
		cl_click(exprtExcelBtn);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"Export to Excel button is clicked- passed");

	}

	public void rollMangmnt() throws Exception {
		if(alertClseBtn.isDisplayed()) {
			cl_click(alertClseBtn);
		}
		Thread.sleep(2000);
		cl_click(roleUserMngmnt);
		et.log(LogStatus.PASS,"Role and User Management tab is clicked- passed");
		Thread.sleep(3000);
	}

	public void createAdmin(String grp,String cName, String email2, String orgName, String telNo, String city2, String state2,
			String zip, String country2, String role2, String tPswd, String signAlgo, String keyAlgo, String vDay,
			String vHours2, String vMin, String vSec, String issurTknPswd, String aEmail, String aPswrd, String shtName,
			String scriptName) throws Exception {
		Thread.sleep(2000);
		cl_click(createMngeUser);
		et.log(LogStatus.PASS,"Create and Manage User is clicked- passed");
		cl_click(newUserBtn);
		et.log(LogStatus.PASS,"New User button is clicked- passed");
		Select s=new Select(group);
		s.selectByVisibleText(grp);
		cl_entertext(commonName, cName);
		cl_entertext(email, email2);
		cl_entertext(organization, orgName);
		cl_entertext(telephoneNumber, telNo);
		cl_entertext(city, city2);
		cl_entertext(state, state2);
		cl_entertext(postal, zip);
		String zipLen = postal.getAttribute("value");
		if(zipLen.length() == 6) {
			System.out.println("Postal code length is correct-pass");
		}else {
			System.out.println("Postal code length is not correct-fail");
		}
		cl_entertext(country, country2);
		cl_entertext(tokenPwd, tPswd);
		String[] exp={"--Select--","SHA1WithRSA","SHA256WithRSA","SHA384WithRSA","SHA512WithRSA"};
		Select s1=new Select(signatureAlg);
		List<WebElement> options = s1.getOptions(); 
		cl_dropdownCheck(exp,options);
		Thread.sleep(2000);
		s1.selectByVisibleText(signAlgo);
		String[] expKeyAlgo={"--Select--","RSA-1024","RSA-2048","RSA-4096"};
		Select s2=new Select(keySize);
		List<WebElement> keyAlgoOptn = s2.getOptions(); 
		cl_dropdownCheck(expKeyAlgo,keyAlgoOptn);
		Thread.sleep(1000);
		s2.selectByVisibleText(keyAlgo);
		vDays.clear();
		cl_entertext(vDays, vDay);
		vHours.clear();
		cl_entertext(vHours, vHours2);
		vMinutes.clear();
		cl_entertext(vMinutes, vMin);
		vSeconds.clear();
		cl_entertext(vSeconds, vSec);
		cl_entertext(issuerTokenPwd, issurTknPswd);
		Thread.sleep(2000);
		cl_click(createUserSaveAndProceed);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Create User save and Proceed button is clicked- passed");
		try {
			cl_entertext(authenticEmail, aEmail);
			cl_entertext(authenticTokenPw, aPswrd);
			cl_click(authenticBtn);
			Thread.sleep(6000);
			et.log(LogStatus.PASS,"Authentic button is clicked- passed");	
			boolean b = tickMark.isDisplayed();
			System.out.println("Green tick mark is displayed? "+b);
			Thread.sleep(2000);
			((JavascriptExecutor) w).executeScript("arguments[0].scrollIntoView(true);", createUserSignAndConfirm);
			cl_click(createUserSignAndConfirm);
			Thread.sleep(20000);
			et.log(LogStatus.PASS,"Create User button is clicked- passed");
			((JavascriptExecutor) w).executeScript("arguments[0].scrollIntoView(true);", userSuccessDiv);
			String msg=userSuccessDiv.getText();
			System.out.println("Message: "+msg);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Success message is displayed- passed");
		}
		catch(Exception e) {
			if(commonNameError.isDisplayed()) {
				System.out.println("Common Name error msg: "+commonNameError.getText());
				et.log(LogStatus.PASS,"Common Name error msg");
			}
			if(emailError.isDisplayed()) {
				System.out.println("Email Id error msg: "+emailError.getText());
				et.log(LogStatus.PASS,"Email Id error msg");
			}
			if(organizationError.isDisplayed()) {
				System.out.println("Organization error msg: "+organizationError.getText());
				et.log(LogStatus.PASS,"Organization error msg");
			}
			if(countryError.isDisplayed()) {
				System.out.println("Country error msg: "+countryError.getText());
				et.log(LogStatus.PASS,"Country error msg");
			}
			if(telephoneNumberError.isDisplayed()) {
				System.out.println("Telephone Num error msg: "+telephoneNumberError.getText());
				et.log(LogStatus.PASS,"Telephone Num error msg");
			}
			if(cityError.isDisplayed()) {
				System.out.println("City error msg: "+cityError.getText());
				et.log(LogStatus.PASS,"City error msg");
			}		
			if(stateError.isDisplayed()) {
				System.out.println("State error msg: "+stateError.getText());
				et.log(LogStatus.PASS,"State error msg");
			}
			
			if(postalError.isDisplayed()) {
				System.out.println("Postal Code error msg: "+postalError.getText());
				et.log(LogStatus.PASS,"Postal Code error msg");
			}
			if(countryError.isDisplayed()) {
				System.out.println("Country error msg: "+countryError.getText());
				et.log(LogStatus.PASS,"Country error msg");
			}
			if(validity_error.isDisplayed()) {
				System.out.println("Validity error msg: "+validity_error.getText());
				et.log(LogStatus.PASS,"Validity error msg");
			}
		}
	}

	public void searchViewDeleteAdmin(String cName, String aEmail, String aPswrd) throws Exception {
		cl_click(viewAllUsers);
		et.log(LogStatus.PASS,"View All Users button is clicked- passed");
		Thread.sleep(2000);
		cl_click(caAdmnSearch);
		et.log(LogStatus.PASS,"CA admin Search button is clicked- passed");
		Select s=new Select(searchBY);
		s.selectByVisibleText("Common Name");
		Thread.sleep(1000);
		cl_entertext(searchText, cName);
		Thread.sleep(1000);
		cl_click(findBtn);
		et.log(LogStatus.PASS,"Find button is clicked- passed");
		Thread.sleep(2000);
		cl_click(viewBtn);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"View button is clicked- passed");
		cl_click(viewCloseBtn);
		et.log(LogStatus.PASS,"View Close button is clicked- passed");
		cl_click(caAdmnSearch);
		Select s1=new Select(searchBY);
		s1.selectByVisibleText("Common Name");
		Thread.sleep(1000);
		cl_entertext(searchText, cName);
		Thread.sleep(1000);
		cl_click(findBtn);
		et.log(LogStatus.PASS,"Find button is clicked- passed");
		Thread.sleep(2000);
		cl_click(deleteBtn);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"Delete button is clicked- passed");
		cl_click(yesDelete);
		Thread.sleep(1000);
		cl_entertext(authenticEmail, aEmail);
		cl_entertext(authenticTokenPw, aPswrd);
		Thread.sleep(2000);
		cl_click(authenticBtn);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"Authentic button is clicked- passed");	
		cl_click(deleteButton);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Delete button in the popup is clicked- passed");
		String msg=succesMsg.getText();
		System.out.println("Delete Success message: "+msg);
		cl_click(successCloseBtn);
		Thread.sleep(2000);
	}
}
