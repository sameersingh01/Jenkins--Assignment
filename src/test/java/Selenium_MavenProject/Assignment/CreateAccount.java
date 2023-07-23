package Selenium_MavenProject.Assignment;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.CreateNewAccount;

public class CreateAccount extends Browsers {
	@Test (priority=5)
	  public void CreateNewuser() {
		
		
		
	
		  log.info("NEW USER REGISTER");

		   extentTest =extent.startTest("CreateNewuser");
		  CreateNewAccount register=new CreateNewAccount(driver);
		  register.clickSignInOption();
		  register.CreateNewUser();
		  register.Enterusername("sameersingh1856@gmail.com");
		  register.EnterMobileno("8969649663");
		  register.EnterPassword("major@786");
		  register.ClickonContinue();
		  extentTest.log(LogStatus.PASS, "Test case Passed sucessfully");
		  
		  
		  log.info("USER REGISTER SUCESSFULLY");


	  }
}
