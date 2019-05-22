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
import Generic_Library.Utility;

public class pf_UserGroupPage extends pf_genericmethods  {
	Basefunctions b = new Basefunctions();
	@FindBy(how = How.XPATH, using = "//div[@id='alertWindow']/div/div/div/button") WebElement alertClseBtn;
	@FindBy(how = How.XPATH, using = "//ul[@id='accordion']/li[8]/a") WebElement roleUserMngmnt;
	@FindBy(how = How.XPATH, using = "//div[@id='myNavbar']/ul/li[8]/div[1]/ul/li[2]/a") WebElement userAndGroup;
	
	@FindBy(how = How.ID, using = "searchBy") WebElement searchBy;
	@FindBy(how = How.ID, using = "searchFor") WebElement searchFor;
	@FindBy(how = How.ID, using = "search") WebElement search;
	@FindBy(how = How.ID, using = "resetbtn") WebElement resetbtn;
	@FindBy(how = How.ID, using = "searchByError") WebElement searchByError;
	@FindBy(how = How.ID, using = "searchForError") WebElement searchForError;
	
	
	@FindAll({@FindBy(how = How.XPATH, using = "//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr")}) public List<WebElement> userGroupSize;
	
	String roleCheck="//table[@id='grid']/tbody/tr[@class='jqgfirstrow']/following-sibling::tr[#DELIM#]/td[4]";
	//home link
	@FindBy(how = How.XPATH, using = "//div[@class='clearfix titleBlk']/ol/li/a") WebElement homeLink;
	
	public pf_UserGroupPage(WebDriver driver){

		PageFactory.initElements(driver, this);		

	}

	public void searchByErr(String shtName, String scriptName) throws Exception{
		if(alertClseBtn.isDisplayed()) {
			cl_click(alertClseBtn);
		}
		Thread.sleep(2000);
		cl_click(roleUserMngmnt);
		et.log(LogStatus.PASS,"Role USer management present in left menu is clicked- passed");
		cl_click(userAndGroup);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"User and Group is clicked- passed");
		cl_click(search);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"Search button is clicked- passed");
		String msg=searchByError.getText();
		Utility.comparelogic(msg, shtName, scriptName);
	}

	public void searchForErr(String searchBy1,String shtName, String scriptName) throws Exception {
		Select s=new Select(searchBy);
		s.selectByVisibleText(searchBy1);
		Thread.sleep(2000);
		cl_click(search);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"Search button wihtout searchBy is clicked- passed");
		String msg=searchByError.getText();
		Utility.comparelogic(msg, shtName, scriptName);
		
	}
	public void searchRole(String searchBy1,String searchFor1,String shtName, String scriptName)  throws Exception{
		
		cl_click(roleUserMngmnt);
		et.log(LogStatus.PASS,"Role USer management present in left menu is clicked- passed");
		cl_click(userAndGroup);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"User and Group is clicked- passed");
		Select s=new Select(searchBy);
		s.selectByVisibleText(searchBy1);
		Thread.sleep(2000);
		Select s1=new Select(searchFor);
		s1.selectByVisibleText(searchFor1);
		Thread.sleep(2000);
		cl_click(search);
		Thread.sleep(3000);
		et.log(LogStatus.PASS,"Search button is clicked- passed");
		int siz = userGroupSize.size();
		for(int i=1;i<=siz;i++) {
			 WebElement a = b.w.findElement(By.xpath(roleCheck.replace("#DELIM#",String.valueOf(i))));
			 String role=a.getText();
			 if(role.equalsIgnoreCase(searchFor1)) {
				 System.out.println("Role: "+role+", Search For: "+searchFor1+", Search matches");
				 et.log(LogStatus.PASS,"Search matches- passed");
			 }else {
				 System.out.println("Role: "+role+", Search For: "+searchFor1+", Search not matches");
				 et.log(LogStatus.FAIL,"Search not matches");
			 }
		}
		cl_click(resetbtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Reset button is clicked- passed");
	}

	public void homeLinkCheck() throws Exception {
		
		cl_click(homeLink);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"HomeLink is clicked- passed");
	}

	
}
