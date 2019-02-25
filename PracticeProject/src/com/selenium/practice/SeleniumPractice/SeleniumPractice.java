package com.selenium.practice.SeleniumPractice;

import org.openqa.selenium.WebDriver;

public class SeleniumPractice {

	public static void main(String[] args) {
		WebDriver driver = DriverCreation.chromeDriver();
		
		GoogleObject googleSearch = new GoogleObject (driver);
		
		googleSearch.navigateToGoogle();
		googleSearch.waitPageToLoad();
		googleSearch.evaluateGooglePageTitle();
		googleSearch.typeInSearchBox();
		googleSearch.clickSearchButton();
		googleSearch.waitForResults();
		googleSearch.clickOnResults();
		googleSearch.waitPageToLoad();
		googleSearch.evaluateResultPageTitle();
		//googleSearch.closeGoogleTab();
		
		
		
		FacebookObject facebookLogin = new FacebookObject (driver, 
				"equilibrioShavos@topete.com", "equilibrioTopete123");
		
		facebookLogin.navigateToFacebook();
		
	}
}
