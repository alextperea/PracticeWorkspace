package com.selenium.practice.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleObject {
	
	WebDriverTools google;
	
	private String destinationUrl 			= "https://google.com";
	private String searchWord				= "Microsoft";
	private String googlePageTitle			= "Google";
	
	private By googleSearchBox				= By.name("q");
	private By googleSearchButton			= By.name("btnK");
	private By googleAllResults				= By.id("rcnt");
	private By googleResultLink				= By.cssSelector("h3.LC20lb");
	
	public void navigateToGoogle(){
		google.navigateToUrl(destinationUrl);
	}
	
	public void typeInSearchBox () {
		google.typing(googleSearchBox, searchWord);
	}
	
	public void clickSearchButton () {
		google.clicking(googleSearchButton);
	}
	
	public void waitPageToLoad () {
		try {
			google.waitPageToLoad();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnResults () {
		google.clicking(googleResultLink);
	}
	
	public void waitForResults () {
		google.isDisplayed(googleAllResults);
	}
	
	public void evaluateGooglePageTitle () {
		google.contentEvaluation(googlePageTitle, google.getPageTitle());
	}
	
	public void evaluateResultPageTitle () {
		google.contentEvaluation(searchWord, google.getPageTitle());
	}
	
	public void closeGoogleTab () {
		google.closeDriver();
	}
	
	public void stuff () {
		google.driver.findElement(googleAllResults);
	}
	
	GoogleObject(WebDriver driver){
		this.google = new WebDriverTools(driver);
	}
	
	
}
