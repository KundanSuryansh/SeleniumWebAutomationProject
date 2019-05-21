package test;

import org.testng.annotations.Test;

import configuration.Configuration;
import data.TestData.HomePageData;
import data.TestData.searchPageData;
import pages.HomePage;
import pages.SearchPage;

public class SearchFeature extends Configuration {
@Test(priority=1)
	
	//TC01 :verify that Searching is working
	/*
	 *Launch URL.
	 *verify that home is displayed using title of webpage.
	 *click on search icon.
	 *verify that search page is open.
	 *enter text in search box.
	 *press search button.
	 *
	 *NOTE:we cant verify search result as google captcha is coming.
	 */
	public void testloginsuccess()throws Exception
	{
		HomePage home =new HomePage(super.driver,super.wait);
		SearchPage search=new SearchPage(super.driver,super.wait);
		home.lanchUrl(HomePageData.URL).verifyTitle(HomePageData.TITLE).pressSearchButton();
		search.verifyTitle(searchPageData.TITLE).enterText(searchPageData.SEARCHDATA).pressSearchButton();
		
	
	}
}
