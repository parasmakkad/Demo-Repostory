package com.capsulecrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettingsPage {

	@FindBy(xpath = "//h4[contains(text(),'Account and Plan')]")
	private WebElement AccountAndPlanLink;
	@FindBy(xpath = "//h4[contains(text(),'Users and Teams')]")
	private WebElement UsersAndTeamLink;
	@FindBy(xpath = "//h4[contains(text(),'Integrations')]")
	private WebElement IntegrationsLink;
	
	public AccountSettingsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAccountAndPlanLink() {
		return AccountAndPlanLink;
	}

	public WebElement getUsersAndTeamLink() {
		return UsersAndTeamLink;
	}

	public WebElement getIntegrationsLink() {
		return IntegrationsLink;
	}
	
	
}
