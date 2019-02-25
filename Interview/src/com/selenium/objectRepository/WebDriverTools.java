package com.selenium.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverTools {
	WebDriver driver;
	WebDriverWait wait;
	
	WebDriverTools(WebDriver driver){
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10); 
	}

	public WebElement find (By locator) {
		return driver.findElement(locator);
	}
	
	public void typing(By locator, String textToType) {
		isDisplayed(locator);
		find(locator).sendKeys(textToType);
	}
	
	public void clicking (By locator) {
		isDisplayed(locator);
		find(locator).click();
	}
	
	public void isDisplayed(By locator) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		wait.until(ExpectedConditions.elementToBeClickable(find(locator)));	
	}
	
	public String getElementText(By locator) {
		return find(locator).getText();
	}
	
	
	public void isDisplayed(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));	
	}
	
	public String getElementText(WebElement element) {
		return element.getText();
	}
	
	public void typing(WebElement element, String textToType) {
		isDisplayed(element);
		element.sendKeys(textToType);
	}
	
	public void clicking (WebElement element) {
		isDisplayed(element);
		element.click();
	}
	
}
