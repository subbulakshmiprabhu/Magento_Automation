Feature: Account Creation and Login on Magento Website

  Scenario: Create a new account 
    Given I am on the homepage
    When I click on the create account button
    And I fill in the registration form with valid details
    And I submit the form
    Then I should see the account dashboard
    @login
    Scenario: Login with the created account
    Given I am on the homepage
    When I click on sign-in button
    When I log in with the created account credentials
    Then I should be logged into my account