package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(name = "email") WebElement uname;
	@FindBy(name = "pass") WebElement password;
	@FindBy(name = "login") WebElement loginButton;
	
	public void LogintoFcaebook(String usernameApplication,String passwordApplication) throws InterruptedException
	{
		Thread.sleep(2000);
		uname.sendKeys(usernameApplication);
		password.sendKeys(passwordApplication);
		loginButton.click();
	}
	
}
