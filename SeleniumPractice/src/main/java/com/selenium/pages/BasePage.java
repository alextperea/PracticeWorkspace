package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver;
	WebDriverWait wait; 
	JavascriptExecutor jse;
	
	public WebElement find (By locator) {
		return driver.findElement(locator);
	}
	
	public void isDisplayed (By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public void click(By locator) {
		isDisplayed(locator);
		find(locator).click();
	}
	
	public void type(By locator, String textToType) {
		isDisplayed(locator);
		find(locator).sendKeys(textToType);
	}
	
	public String getElementText(By locator) {
		isDisplayed(locator);
		return find(locator).getText();
	}
	
	public void isDisplayed (WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void click(WebElement element) {
		isDisplayed(element);
		element.click();
	}
	
	public void type(WebElement element, String textToType) {
		isDisplayed(element);
		element.sendKeys(textToType);
	}
	
	public String getElementText(WebElement element) {
		isDisplayed(element);
		return element.getText();
	}
			
	BasePage(WebDriver driver){
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 5);
		this.jse = (JavascriptExecutor) driver;
	}
}
