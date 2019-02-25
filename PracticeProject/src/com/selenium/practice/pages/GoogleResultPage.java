package com.selenium.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleResultPage extends BasePage{
	
	
	 //*********Constructor*********
	GoogleResultPage (WebDriver driver){
		super(driver);
	}
	
	//*********Page Variables*********
	
	//**********Web Elements**********
	private By googleAllResults				= By.id("rcnt");
	private By googleResultLink				= By.cssSelector("h3.LC20lb");
	
	//*************Methods************
	public MicrosoftPage clickOnfirstElement () {
		isDisplayed(googleAllResults);
		clicking(googleResultLink);
		return new MicrosoftPage(driver);
	}
}
