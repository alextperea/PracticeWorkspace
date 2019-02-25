package com.selenium.practice.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookObject {
	WebDriverTools facebookPage;
	
	private By emailBox;
	private By passwordBox;
	
	private String destinationUrl		= "https://facebook.com";
	private String myEmail				= "";
	private String myPassword			= "";
	
	public void navigateToFacebook() {
		facebookPage.navigateToUrl(destinationUrl);
	}
	
	public void enterEmailFacebook () {
		facebookPage.typing(emailBox, myEmail);
	}
	
	public void enterPasswordFacebook () {
		facebookPage.typing(passwordBox, myPassword);
	}
	
	FacebookObject(WebDriver driver, String expectedEmail, String expectedPass){
		this.facebookPage	= new WebDriverTools(driver);
		this.myEmail		= expectedEmail;
		this.myPassword		= expectedPass;
	}
	
	FacebookObject(WebDriver driver){
		this.facebookPage	= new WebDriverTools(driver);
		this.myEmail		= "donLalo@mecaso.com";
		this.myPassword		= "DonLalo123";
	}
}
