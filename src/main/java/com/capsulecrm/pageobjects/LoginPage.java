package com.capsulecrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="login:usernameDecorate:username")
	private WebElement UsernameTxtBox;
	@FindBy(id="login:passwordDecorate:password")
	private WebElement PasswordTxtBox;
	@FindBy(id="login:login")
	private WebElement LoginBtn;
	
	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameTxtBox() {
		return UsernameTxtBox;
	}

	public WebElement getPasswordTxtBox() {
		return PasswordTxtBox;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	//reusable method
	public void login(String username, String password)
	{
		UsernameTxtBox.sendKeys(username);
		PasswordTxtBox.sendKeys(password);
		LoginBtn.click();
		
	}
	
	
}
