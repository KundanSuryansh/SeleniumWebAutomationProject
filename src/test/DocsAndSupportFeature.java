package test;

import org.testng.annotations.Test;

import configuration.Configuration;
import data.TestData.DocsAndSupportData;
import data.TestData.HomePageData;
import pages.DocsAndSupportPage;
import pages.HomePage;

public class DocsAndSupportFeature extends Configuration {
	@Test(priority=1)
	//TC02 :verify that Subscribing is working.
	/*
	 *Launch URL.
	 *verify that home is displayed using title of webpage.
	 *click on the Docs And support option.
	 *verify the title of docsAndSupport page.
	 */
	
	public void testDocsAndSupportButton()throws Exception
	{
		HomePage home =new HomePage(super.driver,super.wait);
		DocsAndSupportPage docspage=new DocsAndSupportPage(super.driver,super.wait);
		home.lanchUrl(HomePageData.URL).verifyTitle(HomePageData.TITLE).pressDocsAndSupportButton();
		docspage.verifyTitle(DocsAndSupportData.TITLE).enterEmailForSubscribe(DocsAndSupportData.Email).selectCountryForSubscribe().pressSubscribeButton().VerifySubscribeDone(DocsAndSupportData.SUBSCRIBE_ACKNOWLEDGE);
	}
}
