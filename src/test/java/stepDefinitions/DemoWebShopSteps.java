package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DemoWebShopPage;

public class DemoWebShopSteps extends BaseTest{
	
		static DemoWebShopPage registerUser;
		
		
		@Given("open the browser")
		public void browser_is_open() {
			openBrowser();
			registerUser = new DemoWebShopPage(driver);
		}
		
		@When("Open the Url {string}")
		public void open_the_Url(String URL){
			registerUser.openURL(URL);
		}

		
		@And("Click on register button")
		public void click_on_register_button() {
		   registerUser.click_register_link_page();
		}

		@And("Enter the details {string} , {string} , {string} , {string} and {string}")
		public void enter_the_details(String FName, String LName, String Gender, String Email, String Password) {
			registerUser.enter_details_for_registeration(FName, LName, Gender, Email, Password);
		}
		
		
		
		@And("Enter the details {string} and {string} and Click on login")
		public void enter_the_details(String Email, String Password) {
			registerUser.loginDemoWeb( Email, Password);
		}
		@And("Click on login button")
		public void click_on_login_button() {
			registerUser.clickLoginLink();
		}
		
		@Then("add Product to cart")
		public void add_Product_to_cart() {
			registerUser.addToCart();
		}

		@Then("Click on save")
		public void click_on_save() {
			registerUser.click_on_register_button();
		}
		
	}