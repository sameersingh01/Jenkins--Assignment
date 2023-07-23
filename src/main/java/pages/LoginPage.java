package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-link-accountList-nav-line-1\"]")
	public WebElement SignInOption;
	
	@FindBy(how=How.ID,using="ap_email")
	public WebElement userMailId;
	
	@FindBy(how=How.ID,using="continue")
	public WebElement presscontinue;
	
	@FindBy(how=How.ID,using="ap_password")
	public WebElement userPassword;
	
	@FindBy(how=How.ID,using="signInSubmit")
	public WebElement pressSubmit;
	
		
	public void clickSignInOption() {
		SignInOption.click();
	}
	
	public void sendMaildId(String value) {
		userMailId.sendKeys(value);
	}
	
	public void clickContinue() {
		presscontinue.click();
	}
	
	public void sendPassword(String value) {
		userPassword.sendKeys(value);
	}
	
	public void clickSubmit() {
		pressSubmit.click();
	}
	
}
