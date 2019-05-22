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
@Test(priority=4)
	
	//TC01 :verify that login is successful
	/*
	 *Launch URL.
	 *verify that home is displayed using title of webpage.
	 *click on account section
	 *login with credentials
	 *verify the account page title
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

@Test(priority=1)
//TC02 :verify that login is getting failed while providing wrong email
/*
 *Launch URL.
 *verify that home is displayed using title of webpage.
 *click on account section
 *login with credentials
 *verify the account page title
 */
public void testloginfailure1()throws Exception
{
	HomePage home =new HomePage(super.driver,super.wait);
	LoginPage login=new LoginPage(super.driver,super.wait);
	home.lanchUrl(HomePageData.URL).verifyTitle(HomePageData.TITLE).pressAccountButton();
	login.verifyTitle(LoginData.TITLE).enterEmail(LoginData.INCORRECT_EMAIL).enterPassword(LoginData.CORRECT_PASS).clickLoginBtn().VerifyErrorMessage(LoginData.ERROR_MSG);
}
@Test(priority=2)
//TC02 :verify that login is getting failed while providing wrong password
/*
*Launch URL.
*verify that home is displayed using title of webpage.
*click on account section
*login with credentials
*verify the account page title
*/
public void testloginfailure2()throws Exception
{
	HomePage home =new HomePage(super.driver,super.wait);
	LoginPage login=new LoginPage(super.driver,super.wait);
	home.lanchUrl(HomePageData.URL).verifyTitle(HomePageData.TITLE).pressAccountButton();
	login.verifyTitle(LoginData.TITLE).enterEmail(LoginData.CORRECT_EMAIL).enterPassword(LoginData.INCORRECT_PASS).clickLoginBtn().VerifyErrorMessage(LoginData.ERROR_MSG);
}
@Test(priority=3)
//TC02 :verify that login is getting failed while providing wrong password and wrong email
/*
*Launch URL.
*verify that home is displayed using title of webpage.
*click on account section
*login with credentials
*verify the account page title
*/
public void testloginfailure3()throws Exception
{
	HomePage home =new HomePage(super.driver,super.wait);
	LoginPage login=new LoginPage(super.driver,super.wait);
	home.lanchUrl(HomePageData.URL).verifyTitle(HomePageData.TITLE).pressAccountButton();
	login.verifyTitle(LoginData.TITLE).enterEmail(LoginData.INCORRECT_EMAIL).enterPassword(LoginData.INCORRECT_PASS).clickLoginBtn().VerifyErrorMessage(LoginData.ERROR_MSG);
}

	
}
