package com.zealconnect.loginpage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.zealconnect.pages.LoginPage;
import com.zealconnect.testbase.BaseConfiguration;

public class LoginPageTestCase extends BaseConfiguration {
	
	LoginPage lgnpage;

	//Initializing TestBase
	public LoginPageTestCase() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		lgnpage = new LoginPage();
	}
	
	@Test
	public void loginTestCase() {
		lgnpage.userLogin(userName, password);		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
