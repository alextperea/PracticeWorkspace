package com.selenium.practice.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FactoryMicrosoftPage extends BasePage{
	
	FactoryMicrosoftPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public FactoryMicrosoftPage verifyPageTitle (String expectedTitle) {
		assertTrue(getPageTitle().toLowerCase().contains(expectedTitle.toLowerCase()));
		return this;
	}
}
