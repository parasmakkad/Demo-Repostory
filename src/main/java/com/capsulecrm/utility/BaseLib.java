package com.capsulecrm.utility;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.google.common.io.Files;

public class BaseLib {

	public WebDriver driver;
	@BeforeMethod(groups = {"Smoke","Functional"})
	@Parameters({"browser","baseurl"})
	public void precondition(String browserName, String url)
	{
		
		driver=BrowserFactory.launchBrowser(browserName);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		Reporter.log("Url has been navigated successfully", true);
		
	}
	@AfterMethod(groups = {"Smoke","Functional"})
	public void postcondition()
	{
		//driver.close();
		Reporter.log("Browser Closed ", true);
		
	}
	
		
	}
	
	

