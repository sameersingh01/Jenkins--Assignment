package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccount {

WebDriver driver;
	
	
	
	
	public CreateNewAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-link-accountList-nav-line-1\"]")
	public WebElement SignInOption;
	
	@FindBy(how=How.ID,using="createAccountSubmit")
	public WebElement Newuser;
	
	@FindBy(how=How.ID,using="ap_customer_name")
	public WebElement InputUsername;
	
	@FindBy(how=How.ID,using="ap_phone_number")
	public WebElement InputPhoneNo;
	
	@FindBy(how=How.ID,using="ap_password")
	public WebElement InputPassword;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"continue\"]")
	public WebElement ClickContinue;
	

	public void clickSignInOption() {
		SignInOption.click();
	}	
	
	public void CreateNewUser() {
		Newuser.click();
	}
	
	public void Enterusername(String value) {
		InputUsername.sendKeys(value);
	}
	
	public void EnterMobileno(String value) {
		InputPhoneNo.sendKeys(value);
	}
	public void EnterPassword(String value) {
		InputPassword.sendKeys(value);
	}
	public void ClickonContinue() {
		ClickContinue.click();
	}
}
