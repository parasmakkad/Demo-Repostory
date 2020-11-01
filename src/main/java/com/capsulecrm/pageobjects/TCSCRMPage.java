package com.capsulecrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TCSCRMPage {

	@FindBy(xpath = "//li[@class='sp-page__breadcrumb']//a[contains(text(),'Account Settings')]")
	private WebElement AccountSettingLink;
	
	public TCSCRMPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getAccountSettingLink() {
		return AccountSettingLink;
	}
	
	
	
}
