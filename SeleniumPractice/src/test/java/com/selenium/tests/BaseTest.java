package com.selenium.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest{
	
	WebDriver driver;
	
	@Before
	public void setup () {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://preprod.motortrendondemand.com");
	}
	
	@After
	public void teardown () {
		driver.quit();
	}
}
