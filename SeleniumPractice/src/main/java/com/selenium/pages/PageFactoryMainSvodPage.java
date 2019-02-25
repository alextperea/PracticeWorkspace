package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryMainSvodPage extends BasePage{

	@FindBy (css = "span.drop-item.name")
	WebElement userDropDown;
	
	public String getUserName () {
		return getElementText(userDropDown);
	}
	
	public PageFactoryMainSvodPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

}
