package com.selenium.providers;

import org.testng.annotations.DataProvider;

public class CredentialsProvider {
	
	@DataProvider (name = "credentials")
	public Object[][] credentials() {
		return new Object[][] {
		   { "testuser@example.com", "test123" }
		 };
		}
	
	
	@DataProvider (name = "invalidCredentials")
	public Object[][] invalidCredentials() {
		return new Object[][] {
		   { "testuser@example.com", "test1234" },
		   { "testuser1@example.com", "test123" },
		   { "", "test1234" },
		   { "testuser@example.com", "" },
		   { "testuse1r@example.com", "tesst1234" },
		   { "", "" }
		   
		 };
		}
	
	
	
	
	

	//This method will provide data to any test method that declares that its Data Provider
	//is named "test1"
	/*@DataProvider(name = "test1")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Cedric", new Integer(36) },
	   { "Anne", new Integer(37)},
	 };
	}
	 
	//This test method declares that its data should be supplied by the Data Provider
	//named "test1"
	@Test(dataProvider = "test1")
	public void verifyData1(String n1, Integer n2) {
	 System.out.println(n1 + " " + n2);
	}
*/
}
