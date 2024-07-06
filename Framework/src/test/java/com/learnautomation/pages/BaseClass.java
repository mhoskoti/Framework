package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ConfigDataProvider;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;

public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excel ;
	public ConfigDataProvider Config;
	
	
   @BeforeSuite
	public void setUpSuite() throws Exception
	{
		 excel = new ExcelDataProvider();	
		 Config = new ConfigDataProvider();
	}
	
	@BeforeClass
	public void setup() {
		driver = BrowserFactory.startApplication(driver,Config.getBrowser(),Config.getStagingURL());
	}

	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) throws Exception
	{
		if(result.getStatus()==ITestResult.FAILURE);
		{
			Helper.captureScreenshot(driver);
		}
	}

}
