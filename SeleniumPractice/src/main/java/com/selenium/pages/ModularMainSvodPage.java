package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModularMainSvodPage extends BasePage{

	By userDropDown = By.cssSelector("span.drop-item.name");
	
	public void getUserName () {
		System.out.println(getElementText(userDropDown));
	}
	
	public ModularMainSvodPage(WebDriver driver) {
		super(driver);
	}

}
