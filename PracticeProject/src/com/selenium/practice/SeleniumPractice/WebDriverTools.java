package com.selenium.practice.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverTools {
	
	protected WebDriver driver;
	private WebDriverWait wait;
	private Actions action;
	
	public WebElement find (By locator) {
		return driver.findElement(locator);
	}
	
	public void navigateToUrl(String destinationUrl){
		driver.navigate().to(destinationUrl);
		driver.manage().window().maximize();
	}
	
	public void isDisplayed (By locator) {
		wait.until(ExpectedConditions.visibilityOf(find(locator)));
	}
	
	public void typing (By locator, String enterText) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		find(locator).sendKeys(enterText);
	}
	
	public void clicking (By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		find(locator).click();
	}
	
	public void closeDriver () {
		driver.close();
		driver.quit();
	}
	
	public void waitPageToLoad () throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		boolean loadIncompleted = false;
		while (!loadIncompleted) {
			loadIncompleted = jse.executeScript("return document.readyState").toString().equals("complete");
			if (loadIncompleted)
				break;
			Thread.sleep(200);
		}
	}

	public void actionClicking (By locator) {
		isDisplayed(locator);
		action.moveToElement(find(locator)).click().build().perform();
	}
	
	public String getPageTitle () {
		return driver.getTitle(); 
	}
	
	public String getPageUrl () {
		return driver.getCurrentUrl(); 
	}
		
	public void contentEvaluation (String expected, String actual) {
		try {
			assert actual.contains(expected) : String.format("Error: The actual page's title does not match with the expected: "+ actual); 
		} catch (AssertionError e) {
			System.out.println(e.getMessage().toString());
		}
		//assertEquals("The actual page's title does not match with the expected: "+ actual,expected,actual);
	}
	
	public void dropDownSelector (By locator, String selectedOption) {
		isDisplayed(locator);
		Select dropdown = new Select(find(locator));
		dropdown.selectByVisibleText(selectedOption);
	}
	
	WebDriverTools(WebDriver driver){
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
		this.action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
	}
	
	WebDriverTools(){
		this.driver = new ChromeDriver();
		this.wait = new WebDriverWait(driver, 15);
		this.action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
	}
	
}
