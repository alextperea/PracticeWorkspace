package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainSvodPage extends BasePage{

	By userDropDown = By.cssSelector("span.drop-item.name");
	
	public String getUserName () {
		return getElementText(userDropDown);
	}
	
	public MainSvodPage(WebDriver driver) {
		super(driver);
	}

}
