package com.capsulecrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InviteNewUserPage {

	@FindBy(id = "register:firstnameDecorate:firstName")
	private WebElement FirstNameTxtBox;
	@FindBy(id="register:lastNameDecorate:lastName")
	private WebElement LastNameTxtBox;
	@FindBy(id="register:emailDecorate:email")
	private WebElement EmailAddressTxtBox;
	@FindBy(id="register:usernameDecorate:username")
	private WebElement UsernameTxtBox;
	@FindBy(css = "input[value='Invite user']")
	private WebElement InviteUserBtn;
	
	public InviteNewUserPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTxtBox() {
		return FirstNameTxtBox;
	}

	public WebElement getLastNameTxtBox() {
		return LastNameTxtBox;
	}

	public WebElement getEmailAddressTxtBox() {
		return EmailAddressTxtBox;
	}

	public WebElement getUsernameTxtBox() {
		return UsernameTxtBox;
	}

	public WebElement getInviteUserBtn() {
		return InviteUserBtn;
	}
	//reusable  method
	public void inviteNewUser(String firstName, String lastName, String EmailAddress, String Username)
	{
	
		FirstNameTxtBox.sendKeys(firstName);
		LastNameTxtBox.sendKeys(lastName);
		EmailAddressTxtBox.sendKeys(EmailAddress);
		UsernameTxtBox.sendKeys(Username);
		InviteUserBtn.click();
	
	}
}
