
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