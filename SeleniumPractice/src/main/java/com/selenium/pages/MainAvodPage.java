package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainAvodPage extends BasePage  {
	
	By loginButtonAvod = By.xpath("//span[contains(text(), 'LOG IN')]");
	
	public void loginButtonClick() {
		click(loginButtonAvod);
	}
	
	public MainAvodPage(WebDriver driver) {
		super(driver);
	}
}
