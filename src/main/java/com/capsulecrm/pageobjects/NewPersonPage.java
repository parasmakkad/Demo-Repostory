package com.capsulecrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPersonPage {

	@FindBy(css = "input[class*='form-first-name']")
	private WebElement FirstNameTxtBox;
	@FindBy(css = "input[class*='form-last-name']")
	private WebElement LastNameTxtBox;
	@FindBy(css = "input[class*='form-job-title']")
	private WebElement JobTitleTxtBox;
	@FindBy(xpath = "//div[@class='search-select__input-container']/input")
	private WebElement OrganisationTxtBox;
	@FindBy(css = "input[class*='form-phone-number']")
	private WebElement PhoneNumberTxtBox;
	@FindBy(css = "input[class*='form-email-address']")
	private WebElement EmailAddressTxtBox;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement SaveBtn;
	@FindBy(xpath = "//button[contains(text(),'Yes, link to')]")
	private WebElement YesToLinkBtn;
		
	public NewPersonPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getFirstNameTxtBox() {
		return FirstNameTxtBox;
	}

	public WebElement getLastNameTxtBox() {
		return LastNameTxtBox;
	}

	public WebElement getJobTitleTxtBox() {
		return JobTitleTxtBox;
	}

	public WebElement getOrganisationTxtBox() {
		return OrganisationTxtBox;
	}

	public WebElement getPhoneNumberTxtBox() {
		return PhoneNumberTxtBox;
	}

	public WebElement getEmailAddressTxtBox() {
		return EmailAddressTxtBox;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	public WebElement getYesToLinkBtn() {
		return YesToLinkBtn;
	}



	
}
