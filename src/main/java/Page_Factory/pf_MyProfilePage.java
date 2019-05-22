package Page_Factory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

public class pf_MyProfilePage extends pf_genericmethods {
	
	@FindBy(how = How.XPATH, using = "//i[@class='fas fa-user icon-xs icon-rounded']") WebElement roundIcon;
	@FindBy(how = How.XPATH, using = "//div[@class='quick-area pull-right']/ul/li/ul/li[1]/a") WebElement profle;
	
	@FindBy(how = How.XPATH, using = "//div[@id='alertWindow']/div/div/div/button") WebElement alertClseBtn;
	@FindBy(how = How.ID, using = "commonName") WebElement commonName;
	@FindBy(how = How.ID, using = "email") WebElement email;
	@FindBy(how = How.ID, using = "locality") WebElement locality;
	@FindBy(how = How.ID, using = "organization") WebElement organization;
	@FindBy(how = How.ID, using = "telephoneNumber") WebElement telephoneNumber;
	@FindBy(how = How.ID, using = "state") WebElement state;
	@FindBy(how = How.ID, using = "role") WebElement role;
	@FindBy(how = How.ID, using = "postalCode") WebElement postalCode;
	@FindBy(how = How.ID, using = "country") WebElement country;
	@FindBy(how = How.ID, using = "sigAlg") WebElement sigAlg;
	@FindBy(how = How.ID, using = "keyAlg") WebElement keyAlg;
	@FindBy(how = How.ID, using = "validity") WebElement validity;
	@FindBy(how = How.ID, using = "group") WebElement group;
	@FindBy(how = How.ID, using = "accessType") WebElement accessType;

	//home link
	@FindBy(how = How.XPATH, using = "//div[@class='clearfix titleBlk']/ol/li/a") WebElement homeLink;
	
	//open All Link
	@FindBy(how = How.XPATH, using = "//a[@class='openall']") WebElement OpenAll;
	@FindBy(how = How.XPATH, using = "//a[@class='closeall']") WebElement closeall;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//div[@class='sidebar']/div/ul/li/a[@aria-expanded='false']")}) public List<WebElement> BOpenAll;
	@FindAll({@FindBy(how = How.XPATH, using = "//div[@class='sidebar']/div/ul/li/a[@aria-expanded='true']")}) public List<WebElement> AOpenAll;
	
	//emCA logo
	@FindBy(how = How.XPATH, using = "//div[@class='logo-area']/h1/a") WebElement emCALogo;
	@FindBy(how = How.XPATH, using = "//div[@class='clearfix titleBlk']") WebElement emCADashboard;
	
	public pf_MyProfilePage(WebDriver driver){

		PageFactory.initElements(driver, this);		

	}

	public void adminProfileDetail() throws Exception {
		Thread.sleep(2000);
		if(alertClseBtn.isDisplayed()) {
			System.out.println(alertClseBtn.isDisplayed());
			cl_click(alertClseBtn);
			Thread.sleep(2000);
		}
		cl_click(roundIcon);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Profile round icon is clicked- passed");
		cl_click(profle);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Profile is clicked- passed");
		System.out.println("Common Name: "+commonName.getAttribute("value"));
		System.out.println("Email: "+email.getAttribute("value"));
		System.out.println("Locality: "+locality.getAttribute("value"));
		System.out.println("Organization: "+organization.getAttribute("value"));
		System.out.println("TelephoneNumber: "+telephoneNumber.getAttribute("value"));
		System.out.println("State: "+state.getAttribute("value"));
		System.out.println("Role: "+role.getAttribute("value"));
		System.out.println("PostalCode: "+postalCode.getAttribute("value"));
		System.out.println("Country: "+country.getAttribute("value"));
		System.out.println("Signature algorithm: "+sigAlg.getAttribute("value"));
		System.out.println("Key algorithm: "+keyAlg.getAttribute("value"));
		System.out.println("Validity: "+validity.getAttribute("value"));
		System.out.println("Group: "+group.getAttribute("value"));
		System.out.println("AccessType: "+accessType.getAttribute("value"));
		cl_click(homeLink);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"HomeLink is clicked- passed");
			
	}

	public void adminOpenAll() throws Exception {
		if(alertClseBtn.isDisplayed()) {
			System.out.println(alertClseBtn.isDisplayed());
			cl_click(alertClseBtn);
			Thread.sleep(2000);
		}
		int bOpenAllSiz=BOpenAll.size();
		Thread.sleep(2000);
		cl_click(OpenAll);
		et.log(LogStatus.PASS,"Open All Link is clicked- passed");
		Thread.sleep(2000);
		int AOpenAllSiz=AOpenAll.size();
		if(bOpenAllSiz == AOpenAllSiz) {
			System.out.println("Open All link is working");
			et.log(LogStatus.PASS,"Open All link is working- passed");
		}else {
			System.out.println("Open All link is not working");
			et.log(LogStatus.FAIL,"Open All link is not working");
		}
		
		cl_click(closeall);
		et.log(LogStatus.PASS,"Collapse All Link is clicked- passed");
		Thread.sleep(2000);
		int bOpenAllSiz1=BOpenAll.size();
		if(AOpenAllSiz == bOpenAllSiz1) {
			System.out.println("Collapse All link is working");
			et.log(LogStatus.PASS,"Collapse All link is working- passed");
		}else {
			System.out.println("Collapse All link is not working");
			et.log(LogStatus.FAIL,"Collapse All link is not working");
		}
		
		
	}

	public void emCALogoCheck() throws Exception {
		cl_click(roundIcon);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Profile round icon is clicked- passed");
		cl_click(profle);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Profile is clicked- passed");
		cl_click(emCALogo);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"emCA Logo is clicked- passed");
		if(emCADashboard.isDisplayed()) {
			System.out.println("Page got refreshed to dashboard page");
			et.log(LogStatus.PASS,"Page got refreshed to dashboard page");
		}else {
			System.out.println("Page did not refresh to dashboard page");
			et.log(LogStatus.FAIL,"Page did not refresh to dashboard page");
		}
	}
}
