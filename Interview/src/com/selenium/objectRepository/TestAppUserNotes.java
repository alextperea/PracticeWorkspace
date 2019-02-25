package com.selenium.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestAppUserNotes extends BasePage{

	public TestAppUserNotes(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		}
	
	@FindBy (id = "my-notes-page")
	WebElement myNotes;

	public boolean notesVisibility() {
		try {
			isDisplayed(myNotes);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
