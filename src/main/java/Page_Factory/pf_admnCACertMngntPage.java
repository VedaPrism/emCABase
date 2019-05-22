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

public class pf_admnCACertMngntPage extends pf_genericmethods {

	Basefunctions b = new Basefunctions();
	@FindBy(how = How.XPATH, using = "//div[@class='pull-left']/ul/li/a") WebElement homeBtn;

	@FindBy(how = How.XPATH, using = "//section[@class='wrap']/article/div[3]/div/div") WebElement activeCertDashbrd;
	@FindAll({@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr")}) public List<WebElement> actveCertSize;
	
	@FindBy(how = How.ID, using = "caCount") WebElement caCount;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[3]") WebElement certSlNoDashbrd;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[4]") WebElement commonNameDashboard;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[5]") WebElement IssNameDashbrd;

	@FindBy(how = How.XPATH, using = "//ul[@id='accordion']/li[4]/a") WebElement caCertMngmnt;
	@FindBy(how = How.XPATH, using = "//*[@id='caSearchMenu']/a") WebElement caSearch;
	@FindBy(how = How.ID, using = "casearchID") WebElement casearchBy;
	@FindBy(how = How.ID, using = "casearchTxtbox") WebElement casearchFor;
	@FindBy(how = How.ID, using = "casearchdropdwn") WebElement casearchdropdwn;
	@FindBy(how = How.ID, using = "searchGridValues") WebElement searchBtn;
	@FindBy(how = How.ID, using = "resetbtn") WebElement resetbtn;
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[1]/td[2]") WebElement certSlNo;
	String cm="//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[#DELIM#]/td[3]";
	String IssrName="//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[#DELIM#]/td[4]";
	

	public pf_admnCACertMngntPage(WebDriver driver){

		PageFactory.initElements(driver, this);

	}

	public void certDetailsSearch() throws Exception {

		cl_click(homeBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Home button is clicked- passed");
		cl_click(activeCertDashbrd);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Active Certificate tab is clicked- passed");
		try {
			String slNo=certSlNoDashbrd.getText();
			String cmnName=commonNameDashboard.getText();
			String issName=IssNameDashbrd.getText();	
			String caCnt=caCount.getText();
			int caCntresult = Integer.parseInt(caCnt);
			System.out.println(caCntresult);
			et.log(LogStatus.PASS,"SerialNum,CommonName,IssuerName is taken- passed");
			cl_click(caCertMngmnt);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"CA Certificate management menu is clicked- passed");
			cl_click(caSearch);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"CA Certificate management Search is clicked- passed");
			Select s=new Select(casearchBy);
			s.selectByVisibleText("Serial Number");
			cl_entertext(casearchFor, slNo);
			cl_click(searchBtn);
			Thread.sleep(3000);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			int size=actveCertSize.size();
			String srlNo=certSlNo.getText();
			if(size == 1 && slNo.equalsIgnoreCase(srlNo)) {
				System.out.println("Search for serial number matches");
				et.log(LogStatus.PASS,"Search for serial number matches- passed");
			}else {
				System.out.println("Search for serial number is not matching");
				et.log(LogStatus.FAIL,"Search for serial number is not matching");
			}

			cl_click(resetbtn);
			Thread.sleep(3000);
			et.log(LogStatus.PASS,"Reset button is clicked- passed");
			Select s1=new Select(casearchBy);
			s1.selectByVisibleText("Common Name");
			cl_entertext(casearchFor, cmnName);
			cl_click(searchBtn);
			Thread.sleep(3000);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			int csize=actveCertSize.size();
			for(int i=1;i<=csize;i++) {
				WebElement a = b.w.findElement(By.xpath(cm.replace("#DELIM#",String.valueOf(i))));	
				String cName=a.getText();
				if(cmnName.equalsIgnoreCase(cName)) {
					System.out.println("Search for common name matches");
					et.log(LogStatus.PASS,"Search for common name matches- passed");
				}else {
					System.out.println("Search for common name is not matching");
					et.log(LogStatus.FAIL,"Search for common name is not matching");
				}
			}
			cl_click(resetbtn);
			Thread.sleep(3000);
			et.log(LogStatus.PASS,"Reset button is clicked- passed");
			Select s2=new Select(casearchBy);
			s2.selectByVisibleText("Issuer Name");
			//cl_entertext(casearchFor, issName);
			Select s3=new Select(casearchdropdwn);
			s3.selectByVisibleText(issName);
			cl_click(searchBtn);
			Thread.sleep(3000);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			int isize=actveCertSize.size();
			for(int i=1;i<=isize;i++) {
				WebElement a = b.w.findElement(By.xpath(IssrName.replace("#DELIM#",String.valueOf(i))));	
				String iName=a.getText();
				if(iName.equalsIgnoreCase(issName)) {
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
			/*Select s4=new Select(casearchBy);
			s4.selectByVisibleText("Status");
			Select s5=new Select(casearchdropdwn);
			s5.selectByVisibleText("Active");
			Thread.sleep(3000);
			cl_click(searchBtn);
			Thread.sleep(3000);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			int Asize=actveCertSize.size();
			System.out.println("Asize"+Asize);			
			if(Asize == caCntresult) {
				System.out.println("Active certificate count matches");				
			}else {
				System.out.println("Active certificate count not matches");
			}*/
		}catch(Exception e) {
			System.out.println("No record in Dashboard active certificate");
		}
	}
}
