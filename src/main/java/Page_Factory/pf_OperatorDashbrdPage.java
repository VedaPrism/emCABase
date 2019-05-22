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

public class pf_OperatorDashbrdPage extends pf_genericmethods {

	Basefunctions b = new Basefunctions();
	@FindBy(how = How.XPATH, using = "//a[@id='issuedToggle']/span/b/span") WebElement activeCertCount;
	@FindBy(how = How.ID, using = "caCount") WebElement caCount;

	@FindAll({@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr")}) public List<WebElement> actveCertSize;	
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[1]") WebElement activeCertDate;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[3]") WebElement activeCertSrlNo;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[4]") WebElement activeCertComnName;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[5]") WebElement activeCertIssuName;
	String adate="//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[#DELIM#]/td[1]";
	String comnName="//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[#DELIM#]/td[4]";
	String aisrName="//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[#DELIM#]/td[5]";
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[7]/ul/li[1]/a") WebElement activeCertView;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[7]/ul/li[2]/a") WebElement activeCertDwnld;

	@FindBy(how = How.XPATH, using = "//*[@id=\"viewCertificateDetails\"]/div/div/div[1]/button") WebElement viewClseBtn;
	@FindBy(how = How.XPATH, using = "//*[@id=\"downloadCertBtxId\"]") WebElement downloadCertBtxId;

	@FindBy(how = How.XPATH, using = "//*[@id=\"search_grid\"]/div/span") WebElement searchBtn;
	@FindBy(how = How.XPATH, using = "//*[@id=\"refresh_grid\"]/div/span") WebElement resetBtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"fbox_grid\"]/table/tbody/tr[1]/td[1]/select") WebElement searchBy;
	@FindBy(how = How.XPATH, using = "//*[@id=\"fbox_grid\"]/table/tbody/tr[1]/td[3]/input") WebElement searchTxt;
	@FindBy(how = How.XPATH, using = "//*[@id=\"fbox_grid\"]/table/tfoot/tr/td[1]/span[2]/span") WebElement findBtn;

	@FindBy(how = How.ID, using = "usersTab") WebElement usersTab;
	@FindBy(how = How.ID, using = "revokedToggle") WebElement revokedToggle;
	@FindBy(how = How.ID, using = "expiringSoonToggle") WebElement expiringSoonToggle;
	@FindBy(how = How.ID, using = "crlListToggle") WebElement crlListToggle;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[6]/ul/li[1]/a/i") WebElement crlDwnld;
	
	@FindBy(how = How.XPATH, using = "//h1[@class='logo']") WebElement emcaLogo;
	
	public pf_OperatorDashbrdPage(WebDriver driver){

		PageFactory.initElements(driver, this);
	}



	public void dashbrdActiveCert() throws Exception {
		//String actveCount=activeCertCount.getText();

		int size=actveCertSize.size();
		if(size>0) {
			String dte=activeCertDate.getText();
			String srlNo=activeCertSrlNo.getText();
			String cmnName=activeCertComnName.getText();
			String isrName=activeCertIssuName.getText();
			cl_click(searchBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			String[] exp= {"Created Date","Certificate Sl No","Common Name","Issuer Name"};
			Select s=new Select(searchBy);
			List<WebElement> keyAlgoOptn = s.getOptions(); 
			cl_dropdownCheck(exp,keyAlgoOptn);
			Thread.sleep(1000);
			cl_entertext(searchTxt, dte);
			cl_click(findBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"find button is clicked- passed");
			int size1=actveCertSize.size();
			for(int i=1;i<=size1;i++) {
				WebElement a = b.w.findElement(By.xpath(adate.replace("#DELIM#",String.valueOf(i))));	
				String idate=a.getText();
				if(idate.equalsIgnoreCase(dte)) {
					System.out.println("Search for Created date matches");
					et.log(LogStatus.PASS,"Search for Created date matches- passed");
				}else {
					System.out.println("Search for Created date is not matching");
					et.log(LogStatus.FAIL,"Search for Created date is not matching");
				}
			}
			cl_click(resetBtn);
			et.log(LogStatus.PASS,"Reset button is clicked- passed");
			cl_click(searchBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			Select s1=new Select(searchBy);
			s1.selectByVisibleText("Certificate Sl No");
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Search for Cert Serial number");
			cl_entertext(searchTxt, srlNo);
			cl_click(findBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"find button is clicked- passed");
			int size2=actveCertSize.size();
			if(size2==1) {
				System.out.println("Search for Serial Number matches");
				et.log(LogStatus.PASS,"Search for Serial Number matches- passed");
			}else {
				System.out.println("Search for Serial Number is not matching");
				et.log(LogStatus.FAIL,"Search for Serial Number is not matching");
			}
			cl_click(activeCertView);
			Thread.sleep(3000);
			et.log(LogStatus.PASS,"Cert view button is clicked- passed");
			cl_click(viewClseBtn);
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Cert view Close button is clicked- passed");
			cl_click(activeCertDwnld);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Download button is clicked- passed");
			cl_click(downloadCertBtxId);
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Download button in popup is clicked- passed");
			cl_click(resetBtn);
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Reset button is clicked- passed");
			cl_click(searchBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			Select s2=new Select(searchBy);
			s2.selectByVisibleText("Common Name");
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Search for Common Name");
			cl_entertext(searchTxt, cmnName);
			cl_click(findBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Find button is clicked- passed");
			int size3=actveCertSize.size();
			for(int i=1;i<=size3;i++) {
				WebElement a = b.w.findElement(By.xpath(comnName.replace("#DELIM#",String.valueOf(i))));	
				String cmnN=a.getText();
				if(cmnN.equalsIgnoreCase(cmnName)) {
					System.out.println("Search for Common Name matches");
					et.log(LogStatus.PASS,"Search for Common Name matches- passed");
				}else {
					System.out.println("Search for Common Name is not matching");
					et.log(LogStatus.FAIL,"Search for Common Name is not matching");
				}
			}

			cl_click(resetBtn);
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Reset button is clicked- passed");
			cl_click(searchBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			Select s3=new Select(searchBy);
			s3.selectByVisibleText("Issuer Name");
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Search for Issuer Name");
			cl_entertext(searchTxt, isrName);
			cl_click(findBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Find button is clicked- passed");
			int size4=actveCertSize.size();
			for(int i=1;i<=size4;i++) {
				WebElement a = b.w.findElement(By.xpath(aisrName.replace("#DELIM#",String.valueOf(i))));	
				String isrN=a.getText();
				if(isrN.equalsIgnoreCase(isrName)) {
					System.out.println("Search for Issuer Name matches");
					et.log(LogStatus.PASS,"Search for Issuer Name matches- passed");
				}else {
					System.out.println("Search for Issuer Name is not matching");
					et.log(LogStatus.FAIL,"Search for Issuer Name is not matching");
				}
			}

		}
		else {
			System.out.println("CA Active certificate records not present");
			et.log(LogStatus.PASS,"CA Active certificate records not present");
		}
		
	}

	public void dashbrdActiveCertUser() {
		cl_click(usersTab);
		et.log(LogStatus.PASS,"User tab is clicked-Passed");
	}

	public void revokeCerttab() throws Exception {
		cl_click(emcaLogo);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"emCA logo is clicked- passed");
		cl_click(revokedToggle);
		et.log(LogStatus.PASS,"Revoked certificate tab is clicked- passed");
	}



	public void expireCerttab() throws Exception {
		cl_click(emcaLogo);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"emCA logo is clicked- passed");
		cl_click(expiringSoonToggle);
		et.log(LogStatus.PASS,"Expiring soon certificate tab is clicked- passed");
		
	}

	public void crltab() throws Exception {
		cl_click(emcaLogo);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"emCA logo is clicked- passed");
		cl_click(crlListToggle);
		et.log(LogStatus.PASS,"CRL tab is clicked- passed");
		
	}

	public void CrlSearch() throws Exception {
		int size=actveCertSize.size();
		if(size>0) {
			
			cl_click(crlDwnld);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"CRL download button is clicked- passed");
			String crlName=activeCertDate.getText();
			String lstUpdate=activeCertComnName.getText();
			String nxtUpdate=activeCertIssuName.getText();
			cl_click(searchBtn);
			Thread.sleep(2000);	
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			String[] exp= {"CRL Name","Last updated","Next Update"};
			Select s=new Select(searchBy);
			List<WebElement> keyAlgoOptn = s.getOptions(); 
			cl_dropdownCheck(exp,keyAlgoOptn);
			Thread.sleep(2000);
			cl_entertext(searchTxt, crlName);
			cl_click(findBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"find button is clicked- passed");
			int size2=actveCertSize.size();
			if(size2==1) {
				System.out.println("Search for CRL Name matches");
				et.log(LogStatus.PASS,"Search for CRL Name matches- passed");
			}else {
				System.out.println("Search for CRL Name is not matching");
				et.log(LogStatus.FAIL,"Search for CRL Name is not matching");
			}
			
			cl_click(resetBtn);
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Reset button is clicked- passed");
			cl_click(searchBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			Select s3=new Select(searchBy);
			s3.selectByVisibleText("Last updated");
			Thread.sleep(1000);
			cl_entertext(searchTxt, lstUpdate);
			cl_click(findBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Find button is clicked- passed");
			int size1=actveCertSize.size();
			for(int i=1;i<=size1;i++) {
				WebElement a = b.w.findElement(By.xpath(comnName.replace("#DELIM#",String.valueOf(i))));	
				String cName=a.getText();
				if(cName.equalsIgnoreCase(lstUpdate)) {
					System.out.println("Search for Last updated matches");
					et.log(LogStatus.PASS,"Search for Last updated matches- passed");
				}else {
					System.out.println("Search for Last updated is not matching");
					et.log(LogStatus.FAIL,"Search for Last updated is not matching");
				}
			}
			
			cl_click(resetBtn);
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Reset button is clicked- passed");
			cl_click(searchBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			Select s4=new Select(searchBy);
			s4.selectByVisibleText("Next Update");
			Thread.sleep(1000);
			cl_entertext(searchTxt, nxtUpdate);
			cl_click(findBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Reset button is clicked- passed");
			int size3=actveCertSize.size();
			for(int i=1;i<=size3;i++) {
				WebElement a = b.w.findElement(By.xpath(aisrName.replace("#DELIM#",String.valueOf(i))));	
				String ndate=a.getText();
				if(ndate.equalsIgnoreCase(nxtUpdate)) {
					System.out.println("Search for Next updated matches");
					et.log(LogStatus.PASS,"Search for Next updated matches- passed");
				}else {
					System.out.println("Search for Next updated is not matching");
					et.log(LogStatus.FAIL,"Search for Next updated is not matching");
				}
			}
			
		}else {
			System.out.println("CRL records not present");
			et.log(LogStatus.PASS,"CRL records not present");
		}
		
	}
}
