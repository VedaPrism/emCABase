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

import Generic_Library.Basefunctions;

public class pf_OfcCertCRLMngntPage extends pf_genericmethods  {

	Basefunctions b = new Basefunctions();
	@FindBy(how = How.XPATH, using = "//div[@class='sidebar']/div/ul/li[5]/a") WebElement CRLMngmt;
	@FindBy(how = How.XPATH, using = "//div[@id='myNavbar']/ul/li[5]/div[1]/ul/li[1]") WebElement ManageCRL;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"search_grid\"]/div/span") WebElement searchBtn;
	
	@FindBy(how = How.XPATH, using = "//td[@class='fields']/select") WebElement searchDrpBtn;
	@FindBy(how = How.XPATH, using = "//*[@id=\"fbox_grid\"]/table/tbody/tr[1]/td[3]/input") WebElement searchinput;
	@FindBy(how = How.XPATH, using = "//*[@id=\"fbox_grid\"]/table/tfoot/tr/td[1]/span[2]/span/i") WebElement findBtn;
	@FindBy(how = How.XPATH, using = "//td[@id='pager_right']/div/b") WebElement noDataMSg;
	@FindBy(how = How.XPATH, using = "//*[@id=\"refresh_grid\"]/div/span") WebElement resetBtn;
	
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[7]/ul/li/a/i") WebElement newBtn;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[2]") WebElement crlName;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[3]") WebElement crlStatus;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[4]") WebElement crlNo;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[6]") WebElement crlExp;

	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[3]/input[1]") WebElement authenticEmail;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[5]/input[1]") WebElement authenticTokenPw;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[6]/input[1]") WebElement authenticBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='row signAndAuth']/div/p[6]/i[1]") WebElement tickMark;
	
	@FindBy(how = How.XPATH, using = "//div[@id='createOrUpdateCRL']/div/div[1]/div[3]/button") WebElement createBtn;
	@FindBy(how = How.ID, using = "succesMsg") WebElement succesMsg;
	@FindBy(how = How.XPATH, using = "//div[@id='alertWindow']/div/div/div/button") WebElement alrtCloseBtn;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr")}) public List<WebElement> mngeCRLSize;

	public pf_OfcCertCRLMngntPage(WebDriver driver){

		PageFactory.initElements(driver, this);		

	}

	public void certCRLManagement() throws Exception {
		cl_click(CRLMngmt);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"CRL Management tab is clicked- passed");
	}

	public void activateCRL(String commonName,String aEmail,String aPswrd) throws Exception {
		
		cl_click(ManageCRL);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Manage CRL tab is clicked- passed");
		cl_click(searchBtn);
		et.log(LogStatus.PASS,"Search button is clicked- passed");
		cl_entertext(searchinput, commonName);
		cl_click(findBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Find button is clicked- passed");
		cl_click(newBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"New button is clicked- passed");
		cl_entertext(authenticEmail, aEmail);
		cl_entertext(authenticTokenPw, aPswrd);
		cl_click(authenticBtn);
		Thread.sleep(6000);
		et.log(LogStatus.PASS,"Authentic button is clicked- passed");
		boolean b = tickMark.isDisplayed();
		System.out.println("Green tick mark is displayed? "+b);
		Thread.sleep(2000);
		cl_click(createBtn);
		Thread.sleep(4000);
		et.log(LogStatus.PASS,"Create button is clicked- passed");
		
		Thread.sleep(3000);
		String msg=succesMsg.getText();
		System.out.println("Revoke success message: "+msg);
		cl_click(alrtCloseBtn);
		et.log(LogStatus.PASS,"Revke success message close button is clicked- passed");
		Thread.sleep(2000);
	}
	
	public void searchCRL() throws Exception {
		cl_click(ManageCRL);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Manage CRL tab is clicked- passed");
		int size=mngeCRLSize.size();
		if(size>0) {
			String crlN=crlName.getText();
			String crlNum=crlNo.getText();
			String crlS=crlStatus.getText();
			String crlE=crlExp.getText();
			cl_click(searchBtn);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			cl_entertext(searchinput, crlN);
			Thread.sleep(2000);
			cl_click(findBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Find button is clicked- passed");
			if(crlN.equalsIgnoreCase(crlName.getText())){
				System.out.println("Search for CRL Name success");
			}else {
				System.out.println("Search for CRL Name Fail: "+noDataMSg.getText());
			}
			/*cl_click(resetBtn);
			Thread.sleep(2000);
			cl_click(searchBtn);
			Select s=new Select(searchDrpBtn);
			s.selectByVisibleText("CRL No.");
			cl_entertext(searchinput, crlNum);
			cl_click(findBtn);
			Thread.sleep(2000);
			if(crlNum.equalsIgnoreCase(crlNo.getText())){
				System.out.println("Search for CRL Number success");
			}else {
				System.out.println("Search for CRL Number Fail: "+noDataMSg.getText());
			}*/
			
			cl_click(resetBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Reset button is clicked- passed");
			cl_click(searchBtn);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			Select s1=new Select(searchDrpBtn);
			s1.selectByVisibleText("CRL Status");
			cl_entertext(searchinput, crlS);
			cl_click(findBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Find button is clicked- passed");
			if(crlS.equalsIgnoreCase(crlStatus.getText())){
				System.out.println("Search for CRL Status success");
			}else {
				System.out.println("Search for CRL Status Fail: "+noDataMSg.getText());
			}
			
			cl_click(resetBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Reset button is clicked- passed");
			cl_click(searchBtn);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			Select s2=new Select(searchDrpBtn);
			s2.selectByVisibleText("Next Update");
			cl_entertext(searchinput, crlE);
			cl_click(findBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Find button is clicked- passed");
			if(crlE.equalsIgnoreCase(crlExp.getText())){
				System.out.println("Search for CRL Next Update success");
			}else {
				System.out.println("Search for CRL Next Update Fail: "+noDataMSg.getText());
			}
			
		}
		cl_click(resetBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Reset button is clicked- passed");
	}
}
