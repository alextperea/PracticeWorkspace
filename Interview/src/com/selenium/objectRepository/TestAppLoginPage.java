package com.selenium.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestAppLoginPage extends BasePage {

	public TestAppLoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}	
	@FindBy (name = "login.username")
	WebElement userTextBox;
	
	@FindBy (name = "login.password")
	WebElement passWordTextBox;
	
	@FindBy (css = "button.btn.btn-lg.btn-primary.button-login")
	WebElement loginButton;
	
	@FindBy (id = "login-error-message")
	WebElement loginErrorMessage;
	
	public void enterUser(String expectedUser) {
		typing(userTextBox, expectedUser);
		
	}
	
	public void enterPass(String expectedUser) {
		typing(passWordTextBox, expectedUser);
	}
	
	public void clickOnLoginButton () {
		clicking(loginButton);
	}
	
	public String errorMessageDisplayed() {
		isDisplayed(loginErrorMessage);
		return getElementText(loginErrorMessage);
	}
	
}
