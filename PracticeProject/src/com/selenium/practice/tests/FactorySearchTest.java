package com.selenium.practice.tests;

import org.junit.Test;

import com.selenium.practice.pages.FactoryGooglePage;

public class FactorySearchTest extends BaseTest{
	@Test 
	public void searchInGoogle () {
		FactoryGooglePage googlePage = new FactoryGooglePage(driver);
		
		googlePage.goToGooglePage()
				.verifyPageTitle("Google")
				.goTosearchInGoogle("Microsoft")
				.clickOnfirstElement()
				.verifyPageTitle("Microsoft");

		
	}
}
