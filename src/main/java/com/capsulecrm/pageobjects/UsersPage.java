package com.capsulecrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

	@FindBy(xpath = "//a[contains(text(),'Add User')]")
	private WebElement AddUserBtn;
	
	public UsersPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddUserBtn() {
		return AddUserBtn;
	}
	
	
	
	
}
