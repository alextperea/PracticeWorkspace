package com.selenium.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestAppInitPage extends BasePage {

	
	public TestAppInitPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy (css = "button.btn.btn-lg.btn-primary.button-login")
	WebElement loginButton;
		
	
	public void clickOnLoginButton () {
		clicking(loginButton);
	}
}
