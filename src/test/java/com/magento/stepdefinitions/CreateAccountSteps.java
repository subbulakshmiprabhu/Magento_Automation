package com.magento.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.magento.pages.CreateAccountPage;
import com.magento.pages.HomePage;
import com.magento.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.Assert.*;

public class CreateAccountSteps {
	
	WebDriver driver;
    HomePage homePage;
    CreateAccountPage createAccountPage;
    LoginPage loginPage;

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        homePage = new HomePage(driver);
    }

    @When("I click on the create account button")
    public void i_click_on_the_create_account_button() {
        homePage.clickCreateAccount();
    }

    @When("I fill in the registration form with valid details")
    public void i_fill_in_the_registration_form_with_valid_details() {
        createAccountPage = new CreateAccountPage(driver);
        createAccountPage.enterFirstName("John");
        createAccountPage.enterLastName("mark");
        createAccountPage.enterEmail("john.mark3@example.com");
        createAccountPage.enterPassword("Password123");
        createAccountPage.confirmPassword("Password123");
    }
    
    @When("I submit the form")
    public void i_submit_the_form() {
        createAccountPage.clickCreateAccount();
    }
    
    @Then("I should see the account dashboard")
    public void i_should_see_the_account_dashboard() {
        
        assertTrue(driver.getTitle().contains("My Account"));
    }
    
    @When("I click on sign-in button")
    public void i_click_on_sign_in_button() {
    	homePage.clickSignIn();
    }

   
   
    @When("I log in with the created account credentials")
    public void i_log_in_with_the_created_account_credentials() {
        loginPage = new LoginPage(driver);
        loginPage.enterEmail("john.mark3@example.com");
        loginPage.enterPassword("Password123");
        loginPage.clickLogin();
    }
    
    
    @Then("I should be logged into my account")
    public void i_should_be_logged_into_my_account() {
    	assertTrue(driver.getTitle().contains("Home Page"));
    }

}
