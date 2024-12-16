package com.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountPage {
	 WebDriver driver;
	By firstNameField = By.id("firstname");
    By lastNameField = By.id("lastname");
    By emailField = By.id("email_address");
    By passwordField = By.id("password");
    By confirmPasswordField = By.id("password-confirmation");
    By createAccountButton = By.xpath("//button[@title='Create an Account']");
    
    
    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String firstName) {
        WebElement firstNameElement = driver.findElement(firstNameField);
        firstNameElement.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        WebElement lastNameElement = driver.findElement(lastNameField);
        lastNameElement.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        WebElement emailElement = driver.findElement(emailField);
        emailElement.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.sendKeys(password);
    }

    public void confirmPassword(String password) {
        WebElement confirmPasswordElement = driver.findElement(confirmPasswordField);
        confirmPasswordElement.sendKeys(password);
    }

    public void clickCreateAccount() {
        WebElement createAccountButtonElement = driver.findElement(createAccountButton);
        createAccountButtonElement.click();
    }

}
