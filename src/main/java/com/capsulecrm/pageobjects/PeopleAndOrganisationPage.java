package com.capsulecrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PeopleAndOrganisationPage {

	@FindBy(xpath="//a[contains(text(),'Add Person')]")
	private WebElement AddPersonLink;
	
	
	public PeopleAndOrganisationPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}


	public WebElement getAddPersonLink() {
		return AddPersonLink;
	}

			
	
}
