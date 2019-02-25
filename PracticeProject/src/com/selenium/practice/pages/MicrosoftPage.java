package com.selenium.practice.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

public class MicrosoftPage extends BasePage{
	
	MicrosoftPage(WebDriver driver){
		super(driver);
	}
	
	public MicrosoftPage verifyPageTitle (String expectedTitle) {
		assertTrue(getPageTitle().toLowerCase().contains(expectedTitle.toLowerCase()));
		return this;
	}
}
