package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import Generic_Library.Utility;

public class pf_LoginPage extends pf_genericmethods {


	@FindBy(how = How.ID, using = "email") WebElement email;

	@FindBy(how = How.ID, using = "tokenPassword") WebElement tokenPassword;

	@FindBy(how = How.ID, using = "loginBtn") WebElement loginBtn;

	//@FindBy(how = How.XPATH, using = "//span[text()='Home']") WebElement homeBtn;

	//Logout 

	@FindBy(how = How.XPATH, using = "//i[@class='fas fa-user icon-xs icon-rounded']") WebElement roundIcon;
	@FindBy(how = How.XPATH, using = "//div[@class='quick-area pull-right']/ul/li/ul/li[2]/a") WebElement logout;
	@FindBy(how = How.XPATH, using = "//div[@id='alertWindow']/div/div/div/button") WebElement alertClseBtn;
	@FindBy(how = How.ID, using = "emailError") WebElement emailError; 
	@FindBy(how = How.ID, using = "tokenPasswordError") WebElement tokenPasswordError;

	public pf_LoginPage(WebDriver driver){

		PageFactory.initElements(driver, this);

	}

	public void logincredentials(String uid, String pas) throws Exception {
		cl_entertext(email, uid);
		et.log(LogStatus.PASS,"Enter valid EmailId");
		cl_entertext(tokenPassword, pas);
		et.log(LogStatus.PASS,"Enter valid password");
		cl_click(loginBtn);
		et.log(LogStatus.PASS,"Login btn is clicked- passed");
		Thread.sleep(4000);

	}

	public void logout() throws Exception {
		if(alertClseBtn.isDisplayed()) {
			cl_click(alertClseBtn);
			Thread.sleep(2000);
		}
		cl_click(roundIcon);
		et.log(LogStatus.PASS,"Profile round icon is clicked- passed");
		cl_click(logout);
		et.log(LogStatus.PASS,"Logout btn is clicked- passed");
		Thread.sleep(2000);
	}

	public void loginWthOutEmail(String shtName, String scriptName) throws Exception {
		cl_click(loginBtn);
		Thread.sleep(2000);
		et.log(LogStatus.PASS,"Login btn without emailId and Pwd- passed");
		String msg=emailError.getText();
		Utility.comparelogic(msg, shtName, scriptName);

	}

	public void loginWthOutPIN(String shtName, String scriptName) throws Exception {
		String msg=tokenPasswordError.getText();
		Utility.comparelogic(msg, shtName, scriptName);

	}

	public void loginWthinvdEmail(String un,String pin,String shtName, String scriptName) throws Exception {
		cl_entertext(email, un);
		et.log(LogStatus.PASS,"Enter invalid emailId- passed");
		cl_entertext(tokenPassword, pin);
		et.log(LogStatus.PASS,"Enter Password- passed");
		cl_click(loginBtn);
		Thread.sleep(4000);
		et.log(LogStatus.PASS,"Login btn is clicked- passed");
		String msg=emailError.getText();
		Utility.comparelogic(msg, shtName, scriptName);

	}

	public void loginWthinvdPIN(String un,String pin, String shtName, String scriptName) throws Exception {
		email.clear();
		tokenPassword.clear();
		cl_entertext(email, un);
		et.log(LogStatus.PASS,"Enter valid emailId- passed");
		cl_entertext(tokenPassword, pin);
		et.log(LogStatus.PASS,"Enter invalid Password- passed");
		cl_click(loginBtn);
		et.log(LogStatus.PASS,"Login btn is clicked- passed");
		Thread.sleep(4000);
		String msg=tokenPasswordError.getText();

		email.clear();
		Utility.comparelogic(msg, shtName, scriptName);


	}

}
