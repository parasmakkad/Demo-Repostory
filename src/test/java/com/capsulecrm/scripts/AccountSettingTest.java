package com.capsulecrm.scripts;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.capsulecrm.pageobjects.AccountSettingsPage;
import com.capsulecrm.pageobjects.HomePage;
import com.capsulecrm.pageobjects.InviteNewUserPage;
import com.capsulecrm.pageobjects.LoginPage;
import com.capsulecrm.pageobjects.TCSCRMPage;
import com.capsulecrm.pageobjects.UsersPage;
import com.capsulecrm.utility.BaseLib;
import com.capsulecrm.utility.ExcelLib;

public class AccountSettingTest extends BaseLib {

	@Test(priority = 1, groups = {"Functional"})
	public void verifyAccountSettings() throws EncryptedDocumentException, IOException
	{
		ExcelLib elib=new ExcelLib("./testdata/testdata.xlsx");
		String username = elib.readdata("Sheet3", 2, 1);
		String password = elib.readdata("Sheet3", 2, 2);
		String firstName = elib.readdata("Sheet3", 2, 3);
		String LastName = elib.readdata("Sheet3", 2, 4);
		String EmailAddress = elib.readdata("Sheet3", 2, 5);
		String Username = elib.readdata("Sheet3", 2, 6);
		LoginPage lp=new LoginPage(driver);
		lp.login(username, password);
		HomePage hp=new HomePage(driver);
		hp.getUsernameLink().click();
		hp.getAccountSettingsLink().click();
		AccountSettingsPage asp=new AccountSettingsPage(driver);
		asp.getAccountAndPlanLink().click();
		Assert.assertEquals("Account", "Account");
		System.out.println("Account is verified successfully");
		TCSCRMPage  tcs=new TCSCRMPage(driver);
		tcs.getAccountSettingLink().click();
		asp.getUsersAndTeamLink().click();
		Assert.assertEquals("Users and Teams", "Users and Teams");
		System.out.println("Users and Teams is verified successfully");
		UsersPage up=new UsersPage(driver);
		up.getAddUserBtn().click();
		InviteNewUserPage inup=new InviteNewUserPage(driver);
		inup.inviteNewUser(firstName, LastName, EmailAddress, Username);
		
		
		
		
		
		
	}
	
}
