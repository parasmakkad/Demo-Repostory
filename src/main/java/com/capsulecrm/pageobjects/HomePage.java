package com.capsulecrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id="ember22")
	private WebElement PeopleandOrganisationsBtn;
	@FindBy(xpath = "//span[contains(text(),'Add')]")
	private WebElement AddBtn;
	@FindBy(xpath = "//nav[@class='nav-bar']//a[contains(text(),'Case')]")
	private WebElement CaseLink;
	@FindBy(xpath = "//span[text()='Paras Makkad']")
	private WebElement UsernameLink;
	@FindBy(xpath = "//a[contains(text(),'Account Settings')]")
	private WebElement AccountSettingsLink;
	
	
	public HomePage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getPeopleandOrganisationsBtn() {
		return PeopleandOrganisationsBtn;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}

	public WebElement getCaseLink() {
		return CaseLink;
	}

	public WebElement getUsernameLink() {
		return UsernameLink;
	}

	public WebElement getAccountSettingsLink() {
		return AccountSettingsLink;
	}
	

	
	
	
	
}
