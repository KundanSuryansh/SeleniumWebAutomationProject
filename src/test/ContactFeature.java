package test;

import org.testng.annotations.Test;

import configuration.Configuration;
import data.TestData.HomePageData;
import data.TestData.contactPageData;
import pages.ContactPage;
import pages.HomePage;

public class ContactFeature extends Configuration {
@Test(priority=1)
	
	//TC01 :verify that Contact feature are working
	/*
	 *Launch URL.
	 *verify that home is displayed using title of webpage.
	 *click on contact icon.
	 *verify that contact page is open.
	 *enter the values in different fields.
	 *
	 *NOTE:we cant verify search result as google captcha is coming.
	 */

	public void testContactDataInput()throws Exception
	{
		HomePage home =new HomePage(super.driver,super.wait);
		ContactPage contact=new ContactPage(super.driver,super.wait);
		home.lanchUrl(HomePageData.URL).verifyTitle(HomePageData.TITLE).pressContactButton();
		contact.verifyTitle(contactPageData.TITLE)
			   .ClickOnHelp()
			   .SelectHelpData()
			   .ClickOnProductInterest()
			   .selectProductInterest()
			   .addFirstName(contactPageData.FIRST_NAME)
			   .addLastName(contactPageData.LAST_NAME)
			   .addEmail(contactPageData.EMAIL)
			   .addCompanyName(contactPageData.COMPANY_NAME)
			   .addPhone(contactPageData.PHONE);
		
	
	}

@Test(priority=2)

//TC01 :verify that On submitting blank contact information showing error
/*
 *Launch URL.
 *verify that home is displayed using title of webpage.
 *click on contact icon.
 *verify that contact page is open.
 *click on contact us button.
 *
 */
public void testBlankContactDataInput()throws Exception
{
	HomePage home =new HomePage(super.driver,super.wait);
	ContactPage contact=new ContactPage(super.driver,super.wait);
	home.lanchUrl(HomePageData.URL).verifyTitle(HomePageData.TITLE).pressContactButton();
	contact.verifyTitle(contactPageData.TITLE)
		   .clickOnContactUs()
		   .VerfifyErrorMsg(contactPageData.ERR_MSG_VALUE);
	

}
}
