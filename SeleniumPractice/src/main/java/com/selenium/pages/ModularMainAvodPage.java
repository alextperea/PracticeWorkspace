package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModularMainAvodPage extends BasePage  {
	
	By loginButtonAvod = By.xpath("//span[contains(text(), 'LOG IN')]");
	
	public ModularLoginModal loginButtonClick() {
		click(loginButtonAvod);
		return new ModularLoginModal(driver);
	}
	
	public ModularMainAvodPage(WebDriver driver) {
		super(driver);
	}
}
