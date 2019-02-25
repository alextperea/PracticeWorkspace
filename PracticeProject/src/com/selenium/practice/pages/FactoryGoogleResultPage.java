package com.selenium.practice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FactoryGoogleResultPage extends BasePage{
	
	
	 //*********Constructor*********
	FactoryGoogleResultPage (WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//*********Page Variables*********
	
	//**********Web Elements**********
	@FindBy (id = "rcnt")
	WebElement googleAllResults;
	@FindBy (css = "h3.LC20lb")
	WebElement googleResultLink;
	
	//*************Methods************
	public FactoryMicrosoftPage clickOnfirstElement () {
		isDisplayed(googleAllResults);
		clicking(googleResultLink);
		return new FactoryMicrosoftPage(driver);
	}
}
