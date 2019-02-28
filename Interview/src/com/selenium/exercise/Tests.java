package com.selenium.exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.objectRepository.TestAppInitPage;
import com.selenium.objectRepository.TestAppLoginPage;
import com.selenium.objectRepository.TestAppUserNotes;
import com.selenium.providers.CredentialsProvider;

public class Tests extends BaseTest{	
	
	@Test(dataProvider = "credentials", dataProviderClass = CredentialsProvider.class)
	public void loginToTestApp (String user, String password) {
		TestAppInitPage initPage = new TestAppInitPage(driver);
		initPage.clickOnLoginButton();
		
		TestAppLoginPage testApp = new TestAppLoginPage(driver);
		testApp.enterUser(user);
		testApp.enterPass(password);
		testApp.clickOnLoginButton();
		
		TestAppUserNotes userNotes = new TestAppUserNotes(driver);
		Assert.assertTrue(userNotes.notesVisibility());
		System.out.println("User successfully log in");
	}

	@Test(dataProvider = "invalidCredentials", dataProviderClass = CredentialsProvider.class)
	public void loginToTestAppNoCredentials (String user, String password) {
		TestAppInitPage initPage = new TestAppInitPage(driver);
		initPage.clickOnLoginButton();
		
		TestAppLoginPage testApp = new TestAppLoginPage(driver);
		testApp.enterUser(user);
		testApp.enterPass(password);
		testApp.clickOnLoginButton();
		Assert.assertTrue(testApp.errorMessageDisplayed().contains("The username or password are incorrect"));
		System.out.println(testApp.errorMessageDisplayed());
	}
}
