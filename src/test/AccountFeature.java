package test;

import org.testng.annotations.Test;

import configuration.Configuration;
import data.TestData.AccountPageData;
import data.TestData.HomePageData;
import data.TestData.LoginData;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class AccountFeature extends Configuration {
@Test(priority=1)
	
	//TC01 :verify that logging out is successful.
	/*
	 *Launch URL.
	 *verify that home is displayed using title of webpage.
	 *click on account section
	 *login with credentials
	 *verify the account page title
	 *open account overview tab.
	 *click on logout button.
	 *verify login page title.
	 */
	public void testlogoutsuccess()throws Exception
	{
		HomePage home =new HomePage(super.driver,super.wait);
		LoginPage login=new LoginPage(super.driver,super.wait);
		AccountPage account=new AccountPage(super.driver,super.wait);
		home.lanchUrl(HomePageData.URL).verifyTitle(HomePageData.TITLE).pressAccountButton();
		login.verifyTitle(LoginData.TITLE).enterEmail(LoginData.CORRECT_EMAIL).enterPassword(LoginData.CORRECT_PASS).clickLoginBtn();
		account.verifyTitle(AccountPageData.TITLE).accountOverview().logout();
		login.verifyTitle(LoginData.TITLE);
	}
@Test(priority=2)

//TC01 :verify that changing nickname is working
/*
 *Launch URL.
 *verify that home is displayed using title of webpage.
 *click on account section
 *login with credentials
 *verify the account page title.
 *click in account overview tab
 *click on edit profile.
 *then change nick name.
 */
public void changeNickName()throws Exception
{
	HomePage home =new HomePage(super.driver,super.wait);
	LoginPage login=new LoginPage(super.driver,super.wait);
	AccountPage account=new AccountPage(super.driver,super.wait);
	home.lanchUrl(HomePageData.URL).verifyTitle(HomePageData.TITLE).pressAccountButton();
	login.verifyTitle(LoginData.TITLE).enterEmail(LoginData.CORRECT_EMAIL).enterPassword(LoginData.CORRECT_PASS).clickLoginBtn();
	account.verifyTitle(AccountPageData.TITLE).accountOverview().editProfile().changeNickName(AccountPageData.NEW_NICK_NAME).clickOnUpdateProfilePageButton();
}

}
