package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DemoWebShopPage;

public class DemoWebShopSteps extends BaseTest{
	
		static DemoWebShopPage demoweb;
		
		
		@Given("open the browser")
		public void browser_is_open() {
			openBrowser();
			demoweb = new DemoWebShopPage(driver);
		}
		
		@When("Open the Url {string}")
		public void open_the_Url(String URL){
			demoweb.openURL(URL);
		}

		
		@And("Click on register button")
		public void click_on_register_button() {
		   demoweb.click_register_link_page();
		}

		@And("Enter the details {string} , {string} , {string} , {string} and {string}")
		public void enter_the_details(String FName, String LName, String Gender, String Email, String Password) {
			demoweb.enter_details_for_registeration(FName, LName, Gender, Email, Password);
		}
		
		
		
	
		
		@Then("add Product to cart")
		public void add_Product_to_cart() {
			demoweb.addToCart();
		}

		@Then("Click on save")
		public void click_on_save() {
			demoweb.click_on_register_button();
		}
		

//		
//		
//		 
//		
//		
//		
		
		@And("click on gift cards")
		public void click_on_gift_cards() {
			demoweb.clickGiftCards();
		}
		
		

		@And("Enter the details {string} and {string} and Click on login")
		public void enter_the_details(String Email, String Password) {
			demoweb.loginDemoWeb( Email, Password);
		}
		
		@And("Click on login button")
		public void click_on_login_button() {
			demoweb.clickLoginLink();
		}
//		
//		
//		 
//		
//		
//		
		
		
		@And("click on any gift card")
		public void click_on_any_gift_card() {
			demoweb.clickGiftCardImage();
		}
		
		@And("Type the details in {string}, {string}, {string}")
		public void type_the_details(String FriendName, String FriendEmailID, String Message) {
		demoweb.TypeDetails(FriendName, FriendEmailID, Message);	
		}
		
		@And("click email a friend")
		public void click_email_a_friend() {
			demoweb.clickEmailFriend();
		}
		
		@And("Provide dummy email id {string} in Friends email")
		public void Provide_dummy_email_id(String DummyEmailID) {
			demoweb.DummyEmailId(DummyEmailID);
		}
		
		@Then("click on send email")
		public void click_on_send_email() {
			demoweb.clickSendEmail();
		}
	
		//
		//
		//
		//
		
		@Then("Add to compare list and log out")
		public void Add_to_compare_list_and_log_out() throws InterruptedException {
			demoweb.Add_to_Compare_laptop();
		}
		

}