package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopPage {

	WebDriver driver;
	
	public DemoWebShopPage(WebDriver Stepsdriver) {
		this.driver = Stepsdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='ico-login']")
	WebElement loginLink;
	
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement loginButton;
	
	@FindBy(xpath = "//a[@class='ico-register']")
	WebElement RegisterLink;
	
	@FindBy(id = "gender-male")
	WebElement MaleGender;
	
	@FindBy(id = "gender-female")
	WebElement FemaleGender;
	
	@FindBy(id = "FirstName")
	WebElement FirstName;
	
	@FindBy(id = "LastName")
	WebElement LastName;

	@FindBy(id = "Email")
	WebElement Email;
	
	@FindBy(name = "Password")
	WebElement Password;
	
	@FindBy(name = "ConfirmPassword")
	WebElement ConfirmPassword;
	
	@FindBy(id = "register-button")
	WebElement Register_Button;
	
	
	

	// To click on login link
	public void clickLoginLink() {
		loginLink.click();
	}
	
	// This is to login in to demoWebShop
	public void loginDemoWeb(String emailID, String pswd) {
		
		Email.sendKeys(emailID);
		Password.sendKeys(pswd);
		loginButton.click();
	}
	
	// To navigate to the URL
	public void openURL(String URL) {
		driver.get(URL);
	}
	
	// To click on register link
	public void click_register_link_page() {
		RegisterLink.click();
	}
	
	// To enter the details for registeration on DemoWebShop
	public void enter_details_for_registeration(String FName, String LName, String gender, String EmailID, String pswd) {
		if(gender.equalsIgnoreCase("male")) {
			MaleGender.click();
		}else {
			FemaleGender.click();
		}
		
		FirstName.sendKeys(FName);
		LastName.sendKeys(LName);
		Email.sendKeys(EmailID);
		Password.sendKeys(pswd);
		ConfirmPassword.sendKeys(pswd);
	}
	
	// To click on register button
	public void click_on_register_button() {
		Register_Button.click();
	}
	
	
	
	
	
	
	
}
