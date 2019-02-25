package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLoginModal extends BasePage{

	public PageFactoryLoginModal(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy (css = "input#email")
	WebElement userTextBox;
	
	@FindBy (xpath = "//input[@id = 'password']")
	WebElement passTextBox;
	
	@FindBy (xpath = "//button[contains(@id, 'login-submit')]")
	WebElement loginButtonModal;
	
	public void typeUser(String user) {
		type(userTextBox, user);		
	}

	public void typePass(String password) {
		type(passTextBox, password);		
	}
	
	public void clickOnLogin() {
		click(loginButtonModal);
	}
}
