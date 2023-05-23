
Feature: Login Test
  As user I want to login into saucedemo website
  @smoke@regression
  Scenario: User should successfully login with valid credentials
    Given  I am on the login page
      When I enter username "standard_user"
      And  I enter password "secret_sauce"
      And  I click on Login Button
     Then  I should login successfuly
    @sanity@regression
  Scenario: User should get error message with Invalid credentials
    Given  I am on the login page
     When  I enter username " "
      And  I enter password " "
      And  I click on Login Button
     Then  I should see errorMessage
