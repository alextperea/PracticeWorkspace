package com.selenium.practice.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage extends BasePage{

	 //*********Constructor*********
	public GooglePage(WebDriver driver){
		super(driver);
	}
	
	//*********Page Variables*********
	private String destinationUrl 			= "https://google.com";
	
	 //*********Web Elements*********
	private By googleSearchBox				= By.name("q");
	private By googleSearchButton			= By.name("btnK");
	
	 //*********Page Methods*********
	public GooglePage goToGooglePage() {
		navigateToUrl(destinationUrl);
		return this;
	}
	
	public GooglePage verifyPageTitle(String expectedTitle) {
		assertEquals(getPageTitle().toLowerCase(), expectedTitle.toLowerCase());
		return this;
	}
	
	public GoogleResultPage goTosearchInGoogle (String wordToSearch) {
		typing (googleSearchBox, wordToSearch);
		clicking(googleSearchButton);
		return new GoogleResultPage(driver);
	}
}
