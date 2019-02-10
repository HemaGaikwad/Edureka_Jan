package com.craftsvilla.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.generic.ReadExcel;
import com.craftsvilla.pompages.HomePage;
import com.craftsvilla.pompages.SignInPage;

public class LogInScripts extends BaseTest
{
	HomePage homepage = null;
	SignInPage signpage = null;
	
	@Test
	public void tc_01_loginToApp()
	{
		homepage = new HomePage(driver);
		signpage = new SignInPage(driver);
		boolean status=false;
		try
		{
			String[][] credentials = ReadExcel.getData(inputData, "Login");
			for(int i=1; i<credentials.length;i++)
			{
				String email = credentials[i][0];
				String password = credentials[i][1];
				
				homepage.clickOnSignInButton();
				signpage.setEmail(email);
				signpage.clickOnContinue();
				signpage.enterPassword(password);
				signpage.clickOnLoginButton();
				homepage.gotoAccount();
				status =homepage.clickOnLogout();
				homepage.verifyTitle("Ethnic Wear - Buy Ethnic Wear in Latest Designs Online at Craftsvilla");
				
			}
			Assert.assertTrue(status);
			log.info("tc_01_loginToApp has passed");
		}
		catch(Exception e)
		{
			log.error("Testcase failed "+e);
		}
	}

}
