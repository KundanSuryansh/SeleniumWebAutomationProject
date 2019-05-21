package test;

import org.testng.annotations.Test;

import configuration.Configuration;
import data.TestData.AccountPageData;
import data.TestData.HomePageData;
import data.TestData.LoginData;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginFeature extends Configuration {
@Test(priority=1)
	
	//TC01 :verify that home page is visible
	/*
	 *Launch URL.
	 *verify that home is displayed using title of webpage.
	 */
	public void testloginsuccess()throws Exception
	{
		HomePage home =new HomePage(super.driver,super.wait);
		LoginPage login=new LoginPage(super.driver,super.wait);
		AccountPage account=new AccountPage(super.driver,super.wait);
		home.lanchUrl(HomePageData.URL).verifyTitle(HomePageData.TITLE).pressAccountButton();
		login.verifyTitle(LoginData.TITLE).enterEmail(LoginData.CORRECT_EMAIL).enterPassword(LoginData.CORRECT_PASS).clickLoginBtn();
		account.verifyTitle(AccountPageData.TITLE);
	}
}
