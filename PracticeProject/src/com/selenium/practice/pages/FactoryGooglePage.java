package com.selenium.practice.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FactoryGooglePage extends BasePage{

	 //*********Constructor*********
	public FactoryGooglePage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//*********Page Variables*********
	private String destinationUrl 			= "https://google.com";
	
	 //*********Web Elements*********
	@FindBy (name = "q")
	WebElement googleSearchBox;
	
	@FindBy (name = "btnK")
	WebElement googleSearchButton;
	
	 //*********Page Methods*********
	public FactoryGooglePage goToGooglePage() {
		navigateToUrl(destinationUrl);
		return this;
	}
	
	public FactoryGooglePage verifyPageTitle(String expectedTitle) {
		assertEquals(getPageTitle().toLowerCase(), expectedTitle.toLowerCase());
		return this;
	}
	
	public FactoryGoogleResultPage goTosearchInGoogle (String wordToSearch) {
		typing(googleSearchBox, wordToSearch);
		clicking(googleSearchButton);
		return new FactoryGoogleResultPage(driver);
	}
}
