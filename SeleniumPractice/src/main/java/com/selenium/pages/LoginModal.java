package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginModal extends BasePage{

	private By userTextBox = By.cssSelector("input#email");
	private By passTextBox = By.xpath("//input[@id='password']");
	private By loginButtonModal = By.xpath("//button[contains(@id, 'login-submit')]");
	
	public void typeUser(String user) {
		type(userTextBox, user);		
	}

	public void typePass(String password) {
		type(passTextBox, password);		
	}
	
	public void clickOnLogin() {
		click(loginButtonModal);
	}
	
	public LoginModal(WebDriver driver) {
		super(driver);
	}
	
}
