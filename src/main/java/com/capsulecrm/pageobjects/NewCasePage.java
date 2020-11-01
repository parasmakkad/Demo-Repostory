package com.capsulecrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCasePage {

	@FindBy(xpath = "//div[@class='search-select__input-container']//input[@class='select-box__input']")
	private WebElement CaseRelatesToBox;
	@FindBy(xpath = "//span[text()='Virat Kohli']")
	private WebElement ViratLink;
	@FindBy(xpath = "//input[@class='form-input-text']")
	private WebElement CaseNameTxtBox;
	@FindBy(xpath = "//textarea[@class='form-input-text']")
	private WebElement DescriptionTxtBox;
	@FindBy(xpath = "//button[text()='Save']")
	 private WebElement SaveBtn;
	
	public NewCasePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}



	public WebElement getCaseRelatesToBox() {
		return CaseRelatesToBox;
	}



	public WebElement getCaseNameTxtBox() {
		return CaseNameTxtBox;
	}



	public WebElement getDescriptionTxtBox() {
		return DescriptionTxtBox;
	}



	public WebElement getSaveBtn() {
		return SaveBtn;
	}



	public WebElement getViratLink() {
		return ViratLink;
	}
	
	
	
}
