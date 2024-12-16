package com.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	 WebDriver driver;

	    // Locators for Home Page
	    By createAccountButton = By.xpath("//a[text() = 'Create an Account']");
	    By signInButton = By.xpath("//a[normalize-space(text()) = 'Sign In']");

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void clickCreateAccount() {
	        WebElement createAccount = driver.findElement(createAccountButton);
	        createAccount.click();
	    }
	    
	    public void clickSignIn() {
	        WebElement signIn = driver.findElement(signInButton);
	        signIn.click();  // Click the Sign In button
	    }

}
