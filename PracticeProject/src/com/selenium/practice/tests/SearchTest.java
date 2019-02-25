package com.selenium.practice.tests;

import org.junit.Test;

import com.selenium.practice.pages.GooglePage;

public class SearchTest extends BaseTest{
	@Test 
	public void searchInGoogle () {
		GooglePage googlePage = new GooglePage(driver);
		
		googlePage.goToGooglePage()
				.verifyPageTitle("Google")
				.goTosearchInGoogle("Microsoft")
				.clickOnfirstElement()
				.verifyPageTitle("Microsoft");

		
	}
}
