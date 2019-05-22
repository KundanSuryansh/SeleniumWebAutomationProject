package test;

import org.testng.annotations.Test;


import configuration.Configuration;
import data.TestData.DemoPageData;
import data.TestData.DocsAndSupportData;
import data.TestData.HomePageData;
import data.TestData.KendoUiData;
import data.TestData.UiForWpfData;
import data.TestData.pricingPageData;
import pages.DemoPage;
import pages.DocsAndSupportPage;
import pages.HomePage;
import pages.KendoUiPage;
import pages.PricingPage;
import pages.UiForWpfPage;

public class HomeFeature extends Configuration {
	@Test(priority=1)
	
	//TC01 :verify that home page is visible
	/*
	 *Launch URL.
	 *verify that home is displayed using title of webpage.
	 */
	public void testhomepagevisibilty()throws Exception
	{
		HomePage home =new HomePage(super.driver,super.wait);
		home.lanchUrl(HomePageData.URL).verifyTitle(HomePageData.TITLE);
	}
	
	@Test(priority=2)
	//TC02 :verify that kendo ui page is opening.
	/*
	 *Launch URL.
	 *verify that home is displayed using title of webpage.
	 *navigate to myproduct button and press it.
	 *click on the kendo ui option.
	 *verify the title of kendo ui page.
	 */
	
	public void testKendoUiButton()throws Exception
	{
		HomePage home =new HomePage(super.driver,super.wait);
		KendoUiPage kendouipage=new KendoUiPage(super.driver,super.wait);
		home.lanchUrl(HomePageData.URL).verifyTitle(HomePageData.TITLE).pressMyProduct().pressKendoUI();
		kendouipage.verifyTitle(KendoUiData.TITLE);
	}
	@Test(priority=3)
	//TC03 :verify that kendo ui page is opening.
	/*
	 *Launch URL.
	 *verify that home is displayed using title of webpage.
	 *navigate to myproduct button and press it.
	 *click on the Ui for Wpf option.
	 *verify the title of Ui for Wpf page.
	 */
	public void testUiForWpfButton()throws Exception
	{
		HomePage home =new HomePage(super.driver,super.wait);
		UiForWpfPage uiforwpfpage=new UiForWpfPage(super.driver,super.wait);
		home.lanchUrl(HomePageData.URL).verifyTitle(HomePageData.TITLE).pressMyProduct().pressUiForWpf();
		uiforwpfpage.verifyTitle(UiForWpfData.TITLE);
		
	
	}
	@Test(priority=4)
	//TC04 :verify that Demos page is opening.
	/*
	 *Launch URL.
	 *verify that home is displayed using title of webpage.
	 *navigate to Demo icon and press it.
	 *wait for opening of demo page.
	 *verify the title of demo page.
	 */
	public void testDemoButton()throws Exception
	{
		HomePage home =new HomePage(super.driver,super.wait);
		DemoPage demopage=new DemoPage(super.driver,super.wait);
		home.lanchUrl(HomePageData.URL).verifyTitle(HomePageData.TITLE).pressDemoButton();
		demopage.verifyTitle(DemoPageData.TITLE);
	}
	@Test(priority=5)
	//TC05 :verify that Pricing page is opening.
	/*
	 *Launch URL.
	 *verify that home is displayed using title of webpage.
	 *navigate to pricing icon and press it.
	 *wait for opening of pricing page.
	 *verify the title of pricing page.
	 */
	public void testPricingButton()throws Exception
	{
		HomePage home =new HomePage(super.driver,super.wait);
		PricingPage pricingpage=new PricingPage(super.driver,super.wait);
		home.lanchUrl(HomePageData.URL).verifyTitle(HomePageData.TITLE).pressPricingButton();
		pricingpage.verifyTitle(pricingPageData.TITLE);
	}
	@Test(priority=6)
	//TC02 :verify that Docs And support page is opening.
	/*
	 *Launch URL.
	 *verify that home is displayed using title of webpage.
	 *navigate to myproduct button and press it.
	 *verify the title of docsAndSupport page.
	 */
	
	public void testDocsAndSupportButton()throws Exception
	{
		HomePage home =new HomePage(super.driver,super.wait);
		DocsAndSupportPage docspage=new DocsAndSupportPage(super.driver,super.wait);
		home.lanchUrl(HomePageData.URL).verifyTitle(HomePageData.TITLE).pressDocsAndSupportButton();
		docspage.verifyTitle(DocsAndSupportData.TITLE);
	}
	
}
