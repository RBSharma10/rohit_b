package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopPage {

	WebDriver driver;
	
	public DemoWebShopPage(WebDriver Stepsdriver) {
		this.driver = Stepsdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Computers')])[1]")
	WebElement ComputerTab;

	@FindBy(xpath = "(//a[contains(text(),'Desktops')])[1]")
	WebElement Desktops;

	@FindBy(xpath = "//select[@id='products-orderby']/option[contains(text(),'Name: A to Z')]")
	WebElement SortDropdown;

	@FindBy(xpath = "//img[@title='Show details for Build your own cheap computer']")
	WebElement firstLaptop;

	@FindBy(xpath = "//input[@value='Add to compare list']")
	WebElement AddtoCompareButton;

	@FindBy(xpath = "//a[text()='Log out']")
	WebElement LogoutButton;
	
	
	@FindBy(xpath = "(//a[contains(text(),'Gift Cards')])[3]")
	WebElement giftCardsLink;
	
	@FindBy(xpath = "//img[@title ='Show details for $5 Virtual Gift Card']")
	WebElement giftCardImg;
	
	@FindBy(xpath = "//input[@id=\"giftcard_1_RecipientName\"]")
	WebElement recipientNameTextBox;

	@FindBy(id = "giftcard_1_RecipientEmail")
	WebElement recipientEmailTextBox;
	
	@FindBy(id = "giftcard_1_Message")
	WebElement giftcard_MessageTextBox;
	
	@FindBy(xpath = "//input[@value='Email a friend']")
	WebElement EmailAFriendButton;
	
	@FindBy(id = "FriendEmail")
	WebElement FriendEmailTextBox;
	
	@FindBy(id = "YourEmailAddress")
	WebElement YourEmailTextBox;
	
	@FindBy(name = "send-email")
	WebElement sendEmailButton;
	
	@FindBy(xpath = "//a[@class='ico-login']")
	WebElement loginLink;
	
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement loginButton;
	
	@FindBy(xpath = "(//a[contains(text(),'Electronics')])[3]")
	WebElement electronicsLink;
	
	@FindBy(xpath = "//img[@title='Show products in category Cell phones']")
	WebElement cellPhonesImg;
	
	@FindBy(xpath = "//img[@title='Show details for Smartphone']")
	WebElement cellPhoneProduct;
	
	@FindBy(id = "add-to-cart-button-43")
	WebElement addToCart;
	
	
	
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
	
	public void Add_to_Compare_laptop() throws InterruptedException {

   	 Actions action = new Actions(driver);

   	 action.moveToElement(ComputerTab).build().perform();

   	 Desktops.click();

   	 SortDropdown.click();
   	 Thread.sleep(2000);
   	 firstLaptop.click();

   	 AddtoCompareButton.click();

   	 LogoutButton.click();

    }
	
	
	public void clickGiftCards() {
		giftCardsLink.click();
	}
	
	public void clickGiftCardImage() {
		giftCardImg.click();
	}
	
	public void TypeDetails(String FriendName, String FriendEmailId, String Message) {
		recipientNameTextBox.sendKeys(FriendName);
		recipientEmailTextBox.sendKeys(FriendEmailId);
		giftcard_MessageTextBox.sendKeys(Message);
	}
	
	public void clickEmailFriend() {
		EmailAFriendButton.click();
	}
	
	public void DummyEmailId(String DummyEmail) {
		FriendEmailTextBox.sendKeys(DummyEmail);
	}
	
	public void clickSendEmail() {
		sendEmailButton.click();
	}
	
	
	// To add the item to cart
	public void addToCart() {
		electronicsLink.click();
		cellPhonesImg.click();
		cellPhoneProduct.click();
		addToCart.click();
		
	}
	
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