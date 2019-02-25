package com.selenium.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
	private WebDriverWait wait;
	private Actions action;
	private JavascriptExecutor jse; 
	
	public WebElement find (By locator) {
		return driver.findElement(locator);
	}
	
 	public void navigateToUrl(String destinationUrl){
		driver.navigate().to(destinationUrl);
		driver.manage().window().maximize();
	}
	
 	public void closeDriver () {
		driver.close();
		driver.quit();
	}
	
 	
 	//****************By locator****************
 	public void isDisplayed (By locator) {
		wait.until(ExpectedConditions.visibilityOf(find(locator)));
		wait.until(ExpectedConditions.elementToBeClickable(find(locator)));
	}
	
	public void typing (By locator, String enterText) {
		isDisplayed(locator);
		find(locator).sendKeys(enterText);
	}
	
	public void clicking (By locator) {
		isDisplayed(locator);
		find(locator).click();
	}
	
	public void dropDownSelector (By locator, String selectedOption) {
		isDisplayed(locator);
		Select dropdown = new Select(find(locator));
		dropdown.selectByVisibleText(selectedOption);
	}
	
	//****************WebElement element *********
	public void isDisplayed (WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void typing (WebElement element, String enterText) {
		isDisplayed(element);
		element.sendKeys(enterText);
	}
	
	public void clicking (WebElement element) {
		isDisplayed(element);
		element.click();
	}
	
	public void waitPageToLoad () throws InterruptedException {
		boolean loadIncompleted = false;
		while (!loadIncompleted) {
			loadIncompleted = jse.executeScript("return document.readyState").toString().equals("complete");
			if (loadIncompleted)
				break;
			Thread.sleep(200);
		}
	}

	public void actionClicking (WebElement element) {
		isDisplayed(element);
		action.moveToElement(element).click().build().perform();
	}
	
	public void actionTyping (WebElement element, String enterText) {
		isDisplayed(element);
		action.moveToElement(element).sendKeys(enterText).build().perform();
	}
		
	public void contentEvaluation (String expected, String actual, String errorMessage) {
		try {
			assert actual.toUpperCase().contains(expected.toUpperCase()) : 
				String.format(errorMessage); 
		} catch (AssertionError e) {
			System.out.println(e.getMessage().toString());
		}
		//assertEquals("The actual page's title does not match with the expected: "+ actual,expected,actual);
	}
	
	public void dropDownSelector (WebElement element, String selectedOption) {
		isDisplayed(element);
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(selectedOption);
	}
		
	public String getPageTitle () {
		return driver.getTitle(); 
	}
	
	public String getPageUrl () {
		return driver.getCurrentUrl(); 
	}
	
	public String getElementText (By locator) {
		return find(locator).getText(); 
	}
		
	BasePage(WebDriver driver){
		this.driver 	= driver;
		this.wait 		= new WebDriverWait(driver, 15);
		this.action 	= new Actions(driver);
		this.jse		= (JavascriptExecutor) driver;
	}
	
	BasePage(){
		this.driver		= new ChromeDriver();
		this.wait		= new WebDriverWait(driver, 15);
		this.action		= new Actions(driver);
		this.jse		= (JavascriptExecutor) driver;
	}
}
