package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModularLoginModal extends BasePage{

	private By userTextBox = By.cssSelector("input#email");
	private By passTextBox = By.xpath("//input[@id='password']");
	private By loginButtonModal = By.xpath("//button[contains(@id, 'login-submit')]");
	
	public ModularLoginModal typeUser(String user) {
		type(userTextBox, user);
		return this;
	}

	public ModularLoginModal typePass(String password) {
		type(passTextBox, password);
		return this;
	}
	
	public ModularMainSvodPage clickOnLogin() {
		click(loginButtonModal);
		return new ModularMainSvodPage(driver); 
	}
	
	public ModularLoginModal(WebDriver driver) {
		super(driver);
	}
	
}
