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

public class pf_auditorReportsPage  extends pf_genericmethods {
	Basefunctions b = new Basefunctions();
	@FindBy(how = How.XPATH, using = "//*[@id=\"accordion\"]/li[9]/a") WebElement auditorReprt;
	@FindBy(how = How.XPATH, using = "//*[@id=\"logReportsMenu\"]/a") WebElement auditorReprtLog;
	@FindBy(how = How.ID, using = "logReportsGridValues") WebElement searchBtn;
	@FindBy(how = How.ID, using = "resetbtn") WebElement resetbtn;
	@FindBy(how = How.ID, using = "reportsIDsearcherror") WebElement searchByErr;
	@FindBy(how = How.ID, using = "logSearcherror") WebElement searchForErr;
	@FindBy(how = How.ID, using = "LogReportsID") WebElement searchBy;
	@FindBy(how = How.ID, using = "logReportsTxtbox") WebElement searchFor;
	@FindBy(how = How.ID, using = "logReportsdropdwn") WebElement logReportsdropdwn;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='exbtnBlk']/button") WebElement exprtToExcel;
	@FindAll({@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr")}) public List<WebElement> logSize;
	String status="//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[#DELIM#]/td[4]";
	
	//CA admin
	@FindBy(how = How.XPATH, using = "//*[@id=\"accordion\"]/li[9]/a") WebElement caAdminReprt;
	@FindBy(how = How.XPATH, using = "//*[@id=\"logReportsMenu\"]/a") WebElement RprtLog;
	@FindBy(how = How.XPATH, using = "//div[@id='alertWindow']/div/div/div/button") WebElement alertClseBtn;
	public pf_auditorReportsPage(WebDriver driver){

		PageFactory.initElements(driver, this);
	}

	public void reportAuditor() throws Exception {
		cl_click(auditorReprt);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"Auditor Report in menu is clicked- passed");
		cl_click(auditorReprtLog);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"Auditor Report Log is clicked- passed");
	}

	public void audtrLog(String srchBy, String ScrchForM,String ScrchForE,String ScrchForIp,String ScrchForU,String ScrchForS) throws Exception {
		cl_click(exprtToExcel);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Export to Excel button is clicked- passed");
		cl_click(searchBtn);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"Search button is clicked- passed");
		String msg=searchByErr.getText();
		if(msg.equals(srchBy)) {
			System.out.println("Actual and expected result of Search By matches");
			et.log(LogStatus.PASS,"Actual and expected result of Search By matches- passed");
			}else {
				System.out.println("Actual and expected result of Search By not matches");
				et.log(LogStatus.FAIL,"Actual and expected result of Search By not matches");
		}
		Select s=new Select(searchBy);
		s.selectByVisibleText("Module");
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Search By module is selected- passed");
		cl_click(searchBtn);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"Search button is clicked- passed");
		String msg1=searchForErr.getText();
		if(msg1.equals(ScrchForM)) {
			System.out.println("Actual and expected result of Search For Module matches");
			et.log(LogStatus.PASS,"Actual and expected result of Search For Module matches- passed");
			}else {
				System.out.println("Actual and expected result of Search For Module not matches");
				et.log(LogStatus.FAIL,"Actual and expected result of Search For Module not matches");
		}
		
		Select ss=new Select(searchBy);
		ss.selectByVisibleText("Event");
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Search By Event is selected- passed");
		cl_click(searchBtn);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"Search button is clicked- passed");
		String msg11=searchForErr.getText();
		if(msg11.equals(ScrchForE)) {
			System.out.println("Actual and expected result of Search For Event matches");
			et.log(LogStatus.PASS,"Actual and expected result of Search For Event matches- passed");
			}else {
				System.out.println("Actual and expected result of Search For Event not matches");
				et.log(LogStatus.FAIL,"Actual and expected result of Search For Event not matches");
		}
		
		Select s1=new Select(searchBy);
		s1.selectByVisibleText("Ip Address");
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Search By Ip Address is selected- passed");
		cl_click(searchBtn);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"Search button is clicked- passed");
		String msg2=searchForErr.getText();
		if(msg2.equals(ScrchForIp)) {
			System.out.println("Actual and expected result of Search For Ip Address matches");
			et.log(LogStatus.PASS,"Actual and expected result of Search For Ip Address matches- passed");
			}else {
				System.out.println("Actual and expected result of Search For Ip Address not matches");
				et.log(LogStatus.FAIL,"Actual and expected result of Search For Ip Address not matches");
		}
		
		Select s2=new Select(searchBy);
		s2.selectByVisibleText("User");
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Search By User is selected- passed");
		cl_click(searchBtn);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"Search button is clicked- passed");
		String msg3=searchForErr.getText();
		if(msg3.equals(ScrchForU)) {
			System.out.println("Actual and expected result of Search For User matches");
			et.log(LogStatus.PASS,"Actual and expected result of Search For User matches- passed");
			}else {
				System.out.println("Actual and expected result of Search For User not matches");
				et.log(LogStatus.FAIL,"Actual and expected result of Search For User not matches");
		}
		
		Select s3=new Select(searchBy);
		s3.selectByVisibleText("Status");
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Search By Status is selected- passed");
		cl_click(searchBtn);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"Search button is clicked- passed");
		String msg4=searchForErr.getText();
		if(msg4.equals(ScrchForS)) {
			System.out.println("Actual and expected result of Search For Status matches");
			et.log(LogStatus.PASS,"Actual and expected result of Search For Status matches- passed");
			}else {
				System.out.println("Actual and expected result of Search For Status not matches");
				et.log(LogStatus.FAIL,"Actual and expected result of Search For Status not matches");
		}
		
		Select s4=new Select(logReportsdropdwn);
		s4.selectByVisibleText("Success");
		et.log(LogStatus.PASS,"Search For Success Status is selected- passed");
		cl_click(searchBtn);
		Thread.sleep(1000);
		et.log(LogStatus.PASS,"Search button is clicked- passed");
		int size=logSize.size();
		if(size>0) {
			for(int i=1;i<=size;i++) {
				 WebElement a = b.w.findElement(By.xpath(status.replace("#DELIM#",String.valueOf(i))));
				 String st=a.getText();
				 if(st.equals("Success")) {
					 System.out.println("Search for Status Success and displayed value in table matches");
				 }else {
					 System.out.println("Search for Status Success and displayed value in table not matches");
				 }
			}
		}
	}

	public void reportCAADmin() throws Exception {
		Thread.sleep(2000);
		if(alertClseBtn.isDisplayed()) {
			System.out.println(alertClseBtn.isDisplayed());
			cl_click(alertClseBtn);
			Thread.sleep(2000);
		}
		cl_click(caAdminReprt);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Reports menu is clicked- passed");
		cl_click(RprtLog);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Reports Logs is clicked- passed");
		
	}
}
