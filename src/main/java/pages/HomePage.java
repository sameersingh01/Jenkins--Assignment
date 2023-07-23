package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy(how=How.ID, using="nav-logo-sprites")
	public WebElement AmazonLogo;
	
	@FindBy(how=How.CLASS_NAME,using="a-carousel-goto-nextpage")
	public WebElement NextSlide;
	
	 @FindBy(how=How.XPATH,using="//*[@id=\"searchDropdownBox\"]")
	 public WebElement SearchInDropdown;

	 @FindBy(how=How.XPATH,using="//*[@id=\"searchDropdownBox\"]/option[11]")
	 public WebElement ChooseBook;
	 
	 @FindBy(how=How.ID,using="nav-orders")
	 public WebElement Returnorder;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"nav-xshop\"]/a[6]")
	 public WebElement navbarFashion;
	
     @FindBy(how=How.XPATH,using="//*[@id=\"contentGrid_214512\"]/div/div[2]/div[4]/div/div/a/img")
	 public WebElement ChooseKurtis;
	 
	 

	 
	public void ClickAmazonLogo() {
		AmazonLogo.click();
	}

	
	
	public void clickNextSlide() {
		NextSlide.click();
	}
	
	public void clickSearchInDropdown() {
		SearchInDropdown.click();
	}
	
	public void clickChooseBook() {
		ChooseBook.click();
	}
	
	public void clickreturnorder() {
		Returnorder.click();
	}
	
	public void clicknavbarFashion() {
		navbarFashion.click();
		navbarFashion.click();
		
	}
	
	public void clickchoosekurtis() {
		ChooseKurtis.click();
	}
	
}
