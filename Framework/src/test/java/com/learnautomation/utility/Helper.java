package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	// screenshout alerts frames windows sync issue java script executer
	
	public static void captureScreenshot(WebDriver driver) throws Exception
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("./Screenshots/Framework"+ getCurrentDateTime() +".png"));
	}
	
	public static String getCurrentDateTime()
	{
		DateFormat custumFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		//take java.util
	  Date currentDate = new Date();
	  
	 return  custumFormat.format(currentDate);
		
	}
}
