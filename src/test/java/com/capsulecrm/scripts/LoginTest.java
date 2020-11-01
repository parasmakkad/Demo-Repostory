package com.capsulecrm.scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.capsulecrm.pageobjects.HomePage;
import com.capsulecrm.pageobjects.LoginPage;
import com.capsulecrm.pageobjects.NewCasePage;
import com.capsulecrm.pageobjects.NewPersonPage;
import com.capsulecrm.pageobjects.PeopleAndOrganisationPage;
import com.capsulecrm.utility.BaseLib;
import com.capsulecrm.utility.ExcelLib;

public class LoginTest extends BaseLib{
	
	@Test(priority = 1,groups = {"Smoke"})
	public void validLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ExcelLib elib=new ExcelLib("./testdata/testdata.xlsx");
		String username = elib.readdata("Sheet3", 1, 1);
		String password = elib.readdata("Sheet3", 1, 2);
		String firstName = elib.readdata("Sheet3", 1, 3);
		String lastName = elib.readdata("Sheet3", 1, 4);
		String JobTitle = elib.readdata("Sheet3", 1, 5);
		String Organisation = elib.readdata("Sheet3", 1, 6);
		String PhoneNumber = elib.readdata("Sheet3", 1, 7);
		String EmailAddress = elib.readdata("Sheet3", 1, 8);
		String CaseRelatesTo = elib.readdata("Sheet3", 1, 9);
		String CaseName = elib.readdata("Sheet3", 1, 10);
		String Description = elib.readdata("Sheet3", 1, 11);
		LoginPage lp=new LoginPage(driver);
		lp.login(username, password);
		HomePage hp=new HomePage(driver);
		hp.getPeopleandOrganisationsBtn().click();
		PeopleAndOrganisationPage pop=new PeopleAndOrganisationPage(driver);
		pop.getAddPersonLink().click();
		NewPersonPage npp=new NewPersonPage(driver);
		npp.getFirstNameTxtBox().sendKeys(firstName);
		npp.getLastNameTxtBox().sendKeys(lastName);
		npp.getJobTitleTxtBox().sendKeys(JobTitle);
		npp.getOrganisationTxtBox().sendKeys(Organisation);
		npp.getPhoneNumberTxtBox().sendKeys(PhoneNumber);
		npp.getEmailAddressTxtBox().sendKeys(EmailAddress);
		npp.getSaveBtn().click();
		npp.getYesToLinkBtn().click();
		Thread.sleep(2000);
		hp.getAddBtn().click();
		hp.getCaseLink().click();
		NewCasePage ncp=new NewCasePage(driver);
		Thread.sleep(2000);
		ncp.getCaseRelatesToBox().sendKeys(CaseRelatesTo);
		ncp.getViratLink().click();
		ncp.getCaseNameTxtBox().sendKeys(CaseName);
		ncp.getDescriptionTxtBox().sendKeys(Description);
		ncp.getSaveBtn().click();
		
		
		
		
			
		
			
	}

}
