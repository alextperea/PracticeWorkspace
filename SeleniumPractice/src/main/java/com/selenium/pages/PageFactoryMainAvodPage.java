package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryMainAvodPage extends BasePage  {
	
	@FindBy (xpath = "//span[contains(text(), 'LOG IN')]")
	WebElement loginButtonAvod;
	
	public void loginButtonClick() {
		click(loginButtonAvod);
	}
	
	public PageFactoryMainAvodPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
}
