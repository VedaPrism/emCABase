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

public class pf_admnReportsPage extends pf_genericmethods {

	@FindBy(how = How.XPATH, using = "//ul[@id='accordion']/li[9]/a") WebElement reports;
	@FindBy(how = How.XPATH, using = "//*[@id='crlReportsMenu']/a") WebElement crlReport;
	
	@FindBy(how = How.XPATH, using = "//div[@class='exbtnBlk']/button") WebElement exprtExclReport;
	
	@FindBy(how = How.XPATH, using = "//*[@id='certStatsMenu']/a") WebElement certStatistics;
	
	@FindBy(how = How.XPATH, using = "//div[@class='pull-left']/ul/li/a") WebElement homeBtn;
	@FindBy(how = How.XPATH, using = "//*[@id='userCount']") WebElement userCertCount;
	@FindBy(how = How.ID, using = "usersTab") WebElement usersTab;
	@FindBy(how = How.XPATH, using = "//*[@id='issuedCertsMenu']/a") WebElement activeCert;
	
	@FindAll({@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr")}) public List<WebElement> actveCertSize;
	
	
	@FindBy(how = How.ID, using = "revokedToggle") WebElement revokedToggle;
	@FindBy(how = How.ID, using = "expiringSoonToggle") WebElement expiringSoonToggle;
	@FindBy(how = How.XPATH, using = "//*[@id='revokedCertsMenu']/a") WebElement revokeCert;
	@FindBy(how = How.XPATH, using = "//*[@id='expiredCertsMenu']/a") WebElement expireCert;
	//srl Number of first row
	@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr/td[3]") WebElement slNum;
	@FindBy(how = How.ID, using = "issuedID") WebElement issuedID;
	@FindBy(how = How.ID, using = "issuedTxtbox") WebElement issuedTxtbox;
	
	@FindBy(how = How.ID, using = "issuedGridValues") WebElement issuedGridValues;
	@FindBy(how = How.ID, using = "resetbtn") WebElement resetbtn;
	//view Active certificate button
	@FindBy(how = How.XPATH, using = "//*[@id=\"1\"]/td[7]/ul/li[1]/a/i") WebElement viewBtn;
	@FindBy(how = How.XPATH, using = "//*[@id=\"1\"]/td[7]/ul/li[2]/a/i") WebElement dwnldBtn;
	@FindBy(how = How.ID, using = "downloadCertBtxId") WebElement downloadBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@id='viewCertificateDetails']/div/div/div/button") WebElement viewClseBtn;
	//home link
	@FindBy(how = How.XPATH, using = "//div[@class='clearfix titleBlk']/ol/li/a") WebElement homeLink;
	
	@FindBy(how = How.ID, using = "issuedIDsearcherror") WebElement issuedIDsearcherror;
	@FindBy(how = How.ID, using = "searcherror") WebElement searcherror;
	@FindBy(how = How.XPATH, using = "//*[@id=\"pager_right\"]/div/b") WebElement invldSrlNo;
	
	@FindBy(how = How.ID, using = "revokedID") WebElement revokedID;
	@FindBy(how = How.ID, using = "revokedTxtbox") WebElement revokedTxtbox;
	@FindBy(how = How.ID, using = "revokedGridValues") WebElement revokedGridValues;
	@FindBy(how = How.XPATH, using = "//*[@id=\"1\"]/td[9]/ul/li[1]/a/i") WebElement rViewBtn;
	@FindBy(how = How.XPATH, using = "//*[@id=\"1\"]/td[9]/ul/li[2]/a/i") WebElement rDwnldBtn;
	@FindBy(how = How.ID, using = "revokedIDsearcherror") WebElement revokedIDsearcherror;
	@FindBy(how = How.ID, using = "revokederror") WebElement revokederror;
//	@FindBy(how = How.XPATH, using = "//*[@id=\"pager_right\"]/div/b") WebElement RinvldSrlNo;
	
	
	@FindBy(how = How.ID, using = "expiredID") WebElement expiredID;
	@FindBy(how = How.ID, using = "expiredTxtbox") WebElement expiredTxtbox;
	@FindBy(how = How.ID, using = "expireGridValues") WebElement expireGridValues;
	@FindBy(how = How.XPATH, using = "//*[@id=\"1\"]/td[7]/ul/li[1]/a/i") WebElement eViewBtn;
	@FindBy(how = How.XPATH, using = "//*[@id=\"1\"]/td[7]/ul/li[2]/a/i") WebElement eDwnldBtn;
	
	@FindBy(how = How.ID, using = "expiredIDsearcherror") WebElement expiredIDsearcherror;
	@FindBy(how = How.XPATH, using = "//*[@id=\"pager_right\"]/div/b") WebElement noDataFoundMSg;
	
	public pf_admnReportsPage(WebDriver driver){

		PageFactory.initElements(driver, this);

	}

	public void report() throws Exception {
		cl_click(reports);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Reports tab is clicked- passed");
	}
	
	public void crlReport() throws Exception {
		Thread.sleep(2000);
		cl_click(crlReport);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"CRL reports is clicked- passed");
		cl_click(exprtExclReport);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"Export to Excel button is clicked- passed");
		
	}

	public void certStatistics() throws Exception {	
		cl_click(certStatistics);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Certificate statistics is clicked- passed");
		cl_click(exprtExclReport);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"Export to Excel button is clicked- passed");
	}

	public void activeCert(String srchBy,String ScrchFor,String InvldSlNo,String NoRcrdsMsg) throws Exception {
		cl_click(homeBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Home button is clicked- passed");
		cl_click(usersTab);
		Thread.sleep(2000);
		String certCount=userCertCount.getText();
		cl_click(reports);
		et.log(LogStatus.PASS,"Reports in side menu is clicked- passed");
		cl_click(activeCert);
		et.log(LogStatus.PASS,"Active Certificate is clicked- passed");
		Thread.sleep(2000);
		int s=actveCertSize.size();
		/*String value=Integer.toString(s);
		if(certCount.equals(value)) {
			System.out.println("Active Certificate count matches");
			et.log(LogStatus.PASS,"Active Certificate count in Dashboard and Reports matches- passed");
		}else {
			System.out.println("Active Certificate count not matches");
			et.log(LogStatus.PASS,"Active Certificate count in Dashboard and Reports not matches- passed");
		}*/
		if(s>0) {
			cl_click(exprtExclReport);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Active Certificate Exprt To Excel button is clicked- passed");
			cl_click(viewBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Active Certificate view button is clicked- passed");
			cl_click(viewClseBtn);
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Active Certificate view close button is clicked- passed");
			cl_click(dwnldBtn);
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Active Certificate download button is clicked- passed");
			cl_click(downloadBtn);
			Thread.sleep(2000);
			cl_click(issuedGridValues);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			String sByMsg=issuedIDsearcherror.getText();
			if(sByMsg.equals(srchBy)) {
				System.out.println("Actual and expected Message matches");
				et.log(LogStatus.PASS,"Actual and expected Message for Search by matches");
			}else {
				System.out.println("Actual and expected Message not matches");
				et.log(LogStatus.FAIL,"Actual and expected Message for Search by not matches");
			}
			String srlNo=slNum.getText();
			Thread.sleep(2000);
			Select sl=new Select(issuedID);
			sl.selectByVisibleText("Serial Number");
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Serial number in Search by is selected- passed");
			cl_click(issuedGridValues);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			String sForMsg=searcherror.getText();
			if(sForMsg.equals(ScrchFor)) {
				System.out.println("Actual and expected Message matches");
				et.log(LogStatus.PASS,"Actual and expected Message for Search for matches");
			}else {
				System.out.println("Actual and expected Message not matches");
				et.log(LogStatus.FAIL,"Actual and expected Message for Search for not matches");
			}
			cl_entertext(issuedTxtbox, "adskn");
			et.log(LogStatus.PASS,"Invalid Serial number is entered");
			cl_click(issuedGridValues);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			String invldNo=invldSrlNo.getText();
			if(invldNo.equals(InvldSlNo)) {
				System.out.println("Actual and expected Message matches");
				et.log(LogStatus.PASS,"Actual and expected Message for invalid srl No matches");
			}else {
				System.out.println("Actual and expected Message not matches");
				et.log(LogStatus.FAIL,"Actual and expected Message for invalid srl No not matches");
			}
			issuedTxtbox.clear();
			cl_entertext(issuedTxtbox, srlNo);
			et.log(LogStatus.PASS,"Valid Serial number is entered");
			cl_click(issuedGridValues);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Active Certificate search button is clicked- passed");
			int slSize=actveCertSize.size();
			String searchsrlNo=slNum.getText();
			if(srlNo.equals(searchsrlNo)) {
				System.out.println("Search for serial number is correct");
				et.log(LogStatus.PASS,"Active Certificate search matches- passed");
			}else {
				System.out.println("Search for serial number is not correct");
				et.log(LogStatus.FAIL,"Active Certificate search not matches");
			}
			cl_click(resetbtn);
			et.log(LogStatus.PASS,"Active Certificate Reset button is clicked- passed");
			Thread.sleep(2000);
		}
		else {
			System.out.println("Active Certificate records not present");
			et.log(LogStatus.PASS,"Active Certificate records not present- passed");
			String msg=noDataFoundMSg.getText();
			if(msg.equals(NoRcrdsMsg)) {
				System.out.println("Actual and expected Message matches");
			}else {
				System.out.println("Actual and expected Message not matches");
			}
		}
		cl_click(homeLink);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"HomeLink in Active Certificate is clicked- passed");
	}

	public void revokeCert(String srchBy,String ScrchFor,String InvldSlNo,String NoRcrdsMsg) throws Exception {
		cl_click(revokedToggle);
		et.log(LogStatus.PASS,"Revoke certificate in Dashboard is clicked- passed");
		cl_click(usersTab);
		Thread.sleep(2000);
		String certCount=userCertCount.getText();
		cl_click(reports);
		et.log(LogStatus.PASS,"Reports in side menu is clicked- passed");
		cl_click(revokeCert);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Revoked certificate in Reports is clicked- passed");
		int s=actveCertSize.size();
		/*String value=Integer.toString(s);
		if(certCount.equals(value)) {
			System.out.println("Revoke Certificate count matches");
			et.log(LogStatus.PASS,"Revoke Certificate count in Dashboard and Reports matches- passed");
		}else {
			System.out.println("Revoke Certificate count not matches");
			et.log(LogStatus.PASS,"Revoke Certificate count in Dashboard and Reports not matches- passed");
		}*/
		if(s>0) {
			cl_click(exprtExclReport);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Revoked Certificate Exprt To Excel button is clicked- passed");
			cl_click(rViewBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Revoked Certificate view button is clicked- passed");
			cl_click(viewClseBtn);
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Revoked Certificate view close button is clicked- passed");
			cl_click(rDwnldBtn);
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Revoked Certificate download button is clicked- passed");
			cl_click(downloadBtn);
			Thread.sleep(2000);
			cl_click(revokedGridValues);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Revoke Certificate search button is clicked- passed");
			String sByMsg=revokedIDsearcherror.getText();
			if(sByMsg.equals(srchBy)) {
				System.out.println("Actual and expected Message matches");
				et.log(LogStatus.PASS,"Actual and expected Message for Search by matches");
			}else {
				System.out.println("Actual and expected Message not matches");
				et.log(LogStatus.FAIL,"Actual and expected Message for Search by not matches");
			}
			String srlNo=slNum.getText();
			Thread.sleep(2000);
			Select sl=new Select(revokedID);
			sl.selectByVisibleText("Serial Number");
			Thread.sleep(1000);
			cl_click(revokedGridValues);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Revoke Certificate search button is clicked- passed");
			String sForMsg=revokederror.getText();
			if(sForMsg.equals(ScrchFor)) {
				System.out.println("Actual and expected Message matches");
				et.log(LogStatus.PASS,"Actual and expected Message for Search For matches");
			}else {
				System.out.println("Actual and expected Message not matches");
				et.log(LogStatus.FAIL,"Actual and expected Message for Search For not matches");
			}
			cl_entertext(revokedTxtbox, "adskn");
			et.log(LogStatus.PASS,"Invalid Serial number is entered");
			cl_click(revokedGridValues);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Revoke Certificate search button is clicked- passed");
			String invldNo=invldSrlNo.getText();
			if(invldNo.equals(InvldSlNo)) {
				System.out.println("Actual and expected Message matches");
				et.log(LogStatus.PASS,"Actual and expected Message for invalid srl No matches");
			}else {
				System.out.println("Actual and expected Message not matches");
				et.log(LogStatus.FAIL,"Actual and expected Message for invalid srl No not matches");
			}
			revokedTxtbox.clear();
			cl_entertext(revokedTxtbox, srlNo);
			et.log(LogStatus.PASS,"Valid Serial number is entered");
			cl_click(revokedGridValues);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Revoked Certificate search button is clicked- passed");
			String searchsrlNo=slNum.getText();
			if(srlNo.equals(searchsrlNo)) {
				System.out.println("Search for serial number is correct");
				et.log(LogStatus.PASS,"Revoked Certificate search matches- passed");
			}else {
				System.out.println("Search for serial number is not correct");
				et.log(LogStatus.PASS,"Revoked Certificate search not matches- passed");
			}
			cl_click(resetbtn);
			et.log(LogStatus.PASS,"Revoked Certificate Reset button is clicked- passed");
			Thread.sleep(2000);
		}
		else {
			System.out.println("Revoked Certificate records not present");
			et.log(LogStatus.PASS,"Revoked Certificate records not present- passed");
			String msg=noDataFoundMSg.getText();
			if(msg.equals(NoRcrdsMsg)) {
				System.out.println("Actual and expected Message matches");
			}else {
				System.out.println("Actual and expected Message not matches");
			}
		}
		cl_click(homeLink);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"HomeLink in Revoked Certificate is clicked- passed");
	}

	public void expiryCert(String srchBy,String ScrchFor,String InvldSlNo,String NoRcrdsMsg) throws Exception {
		cl_click(expiringSoonToggle);
		et.log(LogStatus.PASS,"Expired certificate in Dashboard is clicked- passed");
		cl_click(usersTab);
		Thread.sleep(2000);
		String certCount=userCertCount.getText();
		cl_click(reports);
		et.log(LogStatus.PASS,"Reports in side menu is clicked- passed");
		cl_click(expireCert);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Expired certificate in Reports is clicked- passed");
		int s=actveCertSize.size();
		/*String value=Integer.toString(s);
		if(certCount.equals(value)) {
			System.out.println("Expired Certificate count matches");
			et.log(LogStatus.PASS,"Expired Certificate count in Dashboard and Reports matches- passed");
		}else {
			System.out.println("Expired Certificate count not matches");
			et.log(LogStatus.FAIL,"Expired Certificate count in Dashboard and Reports not matches- passed");
		}*/
		if(s>0) {
			cl_click(exprtExclReport);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Expired Certificate Exprt To Excel button is clicked- passed");
			cl_click(eViewBtn);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Expired Certificate view button is clicked- passed");
			cl_click(viewClseBtn);
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Expired Certificate view close button is clicked- passed");
			cl_click(eDwnldBtn);
			Thread.sleep(1000);
			et.log(LogStatus.PASS,"Expired Certificate download button is clicked- passed");
			cl_click(downloadBtn);
			Thread.sleep(1000);
			cl_click(expireGridValues);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			String sByMsg=expiredIDsearcherror.getText();
			if(sByMsg.equals(srchBy)) {
				System.out.println("Actual and expected Message matches");
				et.log(LogStatus.PASS,"Actual and expected Message for Search by matches");
			}else {
				System.out.println("Actual and expected Message not matches");
				et.log(LogStatus.FAIL,"Actual and expected Message for Search by not matches");
			}
			String srlNo=slNum.getText();
			Thread.sleep(2000);
			Select sl=new Select(expiredID);
			sl.selectByVisibleText("Serial Number");
			Thread.sleep(1000);
			cl_click(expireGridValues);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Search button is clicked- passed");
			String sForMsg=searcherror.getText();
			if(sForMsg.equals(ScrchFor)) {
				System.out.println("Actual and expected Message matches");
				et.log(LogStatus.PASS,"Actual and expected Message for Search For matches");
			}else {
				System.out.println("Actual and expected Message not matches");
				et.log(LogStatus.FAIL,"Actual and expected Message for Search For not matches");
			}
			cl_entertext(expiredTxtbox, "adskn");
			et.log(LogStatus.PASS,"Invalid Serial number is entered");
			cl_click(expireGridValues);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Expired Certificate search button is clicked- passed");
			String invldNo=invldSrlNo.getText();
			if(invldNo.equals(InvldSlNo)) {
				System.out.println("Actual and expected Message matches");
				et.log(LogStatus.PASS,"Actual and expected Message matches for invalid srl no matches- passed");
			}else {
				System.out.println("Actual and expected Message not matches");
				et.log(LogStatus.FAIL,"Actual and expected Message matches for invalid srl no not matches- passed");
			}
			issuedTxtbox.clear();
			cl_entertext(expiredTxtbox, srlNo);
			et.log(LogStatus.PASS,"Valid Serial number is entered");
			cl_click(expireGridValues);
			Thread.sleep(2000);
			et.log(LogStatus.PASS,"Expired Certificate search button is clicked- passed");
			int slSize=actveCertSize.size();
			String searchsrlNo=slNum.getText();
			if(srlNo.equals(searchsrlNo)) {
				System.out.println("Search for serial number is correct");
				et.log(LogStatus.PASS,"Expired Certificate search matches- passed");
			}else {
				System.out.println("Search for serial number is not correct");
				et.log(LogStatus.FAIL,"Expired Certificate search not matches- passed");
			}
			cl_click(resetbtn);
			et.log(LogStatus.PASS,"Expired Certificate Reset button is clicked- passed");
			Thread.sleep(2000);
		}
		else {
			System.out.println("Expired Certificate records not present");
			et.log(LogStatus.PASS,"Expired Certificate records not present- passed");
			String msg=noDataFoundMSg.getText();
			if(msg.equals(NoRcrdsMsg)) {
				System.out.println("Actual and expected Message matches");
			}else {
				System.out.println("Actual and expected Message not matches");
			}
		}
		cl_click(homeLink);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"HomeLink in Expired Certificate is clicked- passed");
	}

	
}
