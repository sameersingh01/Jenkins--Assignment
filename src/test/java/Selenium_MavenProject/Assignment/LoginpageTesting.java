package Selenium_MavenProject.Assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.LoginPage;

public class LoginpageTesting extends Browsers{
	@Test (priority=6)
	  public void LoginValidmailid() {
		  
		  log.info("LOGIN WITH VALID DATA");
	      extentTest=extent.startTest("LoginValidmailid");
		  LoginPage login=new LoginPage(driver);
		  login.clickSignInOption();
		  login.sendMaildId("sameersingh1856@gmail.com");
		  login.clickContinue();
		  login.sendPassword("Lieutenant786@");
		  login.clickSubmit();
		  Assert.assertEquals(driver.getTitle(),"Amazon Sign In");  
		  extentTest.log(LogStatus.PASS, "Test case Pass sucessfully");
		  
		  log.info("SUCESSFULLY LOGIN");


	  }
	  @Test (priority=7)
	  public void Loginvalidmailid() {
		  log.info("LOGIN WITH INVALID USERID");

		  extentTest=extent.startTest("Loginvalidmailid");

		  LoginPage login=new LoginPage(driver);
		  login.clickSignInOption();
		  login.sendMaildId("sameersingh1856@gmail.com");
		  login.clickContinue();
		  Assert.assertEquals(driver.getTitle(),"Amazon Sign In");

		  extentTest.log(LogStatus.PASS, "wrong mail id Test case Failed");
		  log.error("WRONG LOGIN DATA");


	  }
	  @Test (priority=8)
	  public void LogininValidPassword() {
		  log.info("LOGIN WITH INVALID PASSWORD");

		  extentTest=extent.startTest("LogininValidPassword");

		  
		  LoginPage login=new LoginPage(driver);
		  login.clickSignInOption();
		  login.sendMaildId("sameersingh1856@gmail.com");
		  login.clickContinue();
		  login.sendPassword("major@786");
		  login.clickSubmit();
		  Assert.assertEquals(driver.getTitle(),"Amazon Sign In");

		  extentTest.log(LogStatus.PASS, "Test case Failed passwrd is wrong");
		  log.error("WRONG LOGIN DATA");

		   }
	  @Test (priority=9)
	  public void Logblankuser() {
		  log.info("LOGIN WITH BLANK USERID");

		  extentTest =extent.startTest("Logblankuser");

		  LoginPage login=new LoginPage(driver);
		  login.clickSignInOption();
		  login.sendMaildId("   ");
		  login.clickContinue();
		  Assert.assertEquals(driver.getTitle(),"Amazon Sign In");
	 
		  
		  extentTest.log(LogStatus.PASS, "Test case Failed username is blank");
		  log.error("WRONG LOGIN DATA");


	  }
	  
	  @Test (priority=10)
	  public void Loginblankpass() {
		  log.info("LOGIN WITH BLANK USERID");

		  extentTest =extent.startTest("Loginblankpass");

		  LoginPage login=new LoginPage(driver);
		  login.clickSignInOption();
		  login.sendMaildId("sameersingh1856@gmail.com");
		  login.clickContinue();
		  login.sendPassword(" ");
		  login.clickSubmit();
		 
		  Assert.assertEquals(driver.getTitle(),"Amazon Sign In");

		  extentTest.log(LogStatus.PASS, "Test case Failed password is blank");
		  log.error("WRONG LOGIN DATA");


	  }
}
