
@DemoShop
Feature: This feature is for DemoWebShop website

  @Register
  Scenario Outline: Registering on DemoWebShop
    Given open the browser
    When Open the Url "https://demowebshop.tricentis.com/"
    And Click on register button
    And Enter the details "<FirstName>" , "<LastName>" , "<Gender>" , "<Email>" and "<Password>"
    Then Click on save
    
    Examples:
     | FirstName | LastName | Gender | Email | Password |
     | Rohit | Bhargava | Male | rb.Test@abc.com | Test@123 |
     
   @Login
   Scenario Outline: Registering on DemoWebShop
    Given open the browser
    When Open the Url "https://demowebshop.tricentis.com/"
    And Click on login button
    And Enter the details "<Email>" and "<Password>" and Click on login

    Then add Product to cart
    
    Examples:
     | Email | Password |
     | rb.Test@abc.com | Test@123 |
     

    @GiftCard
    Scenario: Sending gift card
    Given open the browser
    When Open the Url "https://demowebshop.tricentis.com/"
    And Click on login button
    And Enter the details "rb.Test@abc.com" and "Test@123" and Click on login
    
		And click on gift cards
		And click on any gift card
		And Type the details in "friend", "friend@123.com", "This is for you" 
		And click email a friend
		And Provide dummy email id "friend@123.com" in Friends email
		And click on send email
		
		@Sort
		Scenario: Sorting and comparing
		Given open the browser
    When Open the Url "https://demowebshop.tricentis.com/"
    And Click on login button
    And Enter the details "rb.Test@abc.com" and "Test@123" and Click on login

		Then Add to compare list and log out
		
     
    
