package com.selenium.tests;

import org.junit.Test;

import com.selenium.pages.LoginModal;
import com.selenium.pages.MainAvodPage;
import com.selenium.pages.MainSvodPage;
import com.selenium.pages.ModularMainAvodPage;
import com.selenium.pages.PageFactoryLoginModal;
import com.selenium.pages.PageFactoryMainAvodPage;
import com.selenium.pages.PageFactoryMainSvodPage;

public class Tests extends BaseTest {

	@Test
	public void userLogin() {
		MainAvodPage avodPage = new MainAvodPage(driver);
		avodPage.loginButtonClick();
		
		LoginModal loguinModal = new LoginModal (driver);
		loguinModal.typeUser("qa01.ns@mtodtest.com");
		loguinModal.typePass("Welcome1");
		loguinModal.clickOnLogin();
		
		MainSvodPage svodPage = new MainSvodPage (driver);
		String userDisplay = svodPage.getUserName();
		System.out.println(userDisplay);
		
	}
	
	
	@Test
	public void userLoginPageFactory() {
		PageFactoryMainAvodPage avodPage = new PageFactoryMainAvodPage(driver);
		avodPage.loginButtonClick();
		
		PageFactoryLoginModal loguinModal = new PageFactoryLoginModal (driver);
		loguinModal.typeUser("qa01.ns@mtodtest.com");
		loguinModal.typePass("Welcome1");
		loguinModal.clickOnLogin();
		
		PageFactoryMainSvodPage svodPage = new PageFactoryMainSvodPage (driver);
		String userDisplay = svodPage.getUserName();
		System.out.println(userDisplay);
		
	}
	
	@Test
	public void userLoginModular() {
		ModularMainAvodPage fullFlow = new ModularMainAvodPage(driver);
		fullFlow.loginButtonClick()
				.typeUser("qa01.ns@mtodtest.com")
				.typePass("Welcome1")
				.clickOnLogin()
				.getUserName();
		
	}
}
