package com.automationpractice.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(xpath="//span//i[@class=\"icon-lock left\"]")
	WebElement loginBtn;
	
	@FindBy(xpath="/a[@class=\"login\"]")
	WebElement SigninBtn;
	
	//initializing pageFactory
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public void CLickonSigninBtn() {
		SigninBtn.click();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
}
