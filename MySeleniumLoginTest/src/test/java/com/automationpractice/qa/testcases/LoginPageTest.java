package com.automationpractice.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.qa.base.TestBase;
import com.automationpractice.qa.pages.HomePage;
import com.automationpractice.qa.pages.LoginPage;

public class LoginPageTest extends TestBase  {
	LoginPage  loginPage;
	HomePage homepage;
	
	public LoginPageTest() {
		super(); //to define properties
	}
	
	
	
	@BeforeMethod
	public void setUp() {
		
		initialization(); //calling the drivers method
		 loginPage = new LoginPage(); //object
		
	}
	
	@Test(priority=1)
	public void ClickonSigninBtn() {
		
	
	driver.findElement(By.xpath("/a[@class=\\\"login\\\"]")).click();
		
	}
	@Test(priority=2)
	public void loginTest() {
		
		homepage = loginPage.login("rits772.rp@gmail.com","Test12345");
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
