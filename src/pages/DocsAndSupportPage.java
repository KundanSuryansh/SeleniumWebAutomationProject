package pages;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import locator.DocsAndSupport;
import locator.Login;


public class DocsAndSupportPage {
	WebDriver driver;
	WebDriverWait wait;
	public DocsAndSupportPage(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait = wait;
	}
	public DocsAndSupportPage verifyTitle(String title)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(DocsAndSupport.CenterContent)));
		assertEquals(title,driver.getTitle());
		return this;
	}
	public DocsAndSupportPage enterEmailForSubscribe(String Email)
	{
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("scroll(0, 700)"); // if the element is at bottom.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(DocsAndSupport.EMAIL_TEXT_FIELD)));
		driver.findElement(By.cssSelector(DocsAndSupport.EMAIL_TEXT_FIELD)).clear();
		driver.findElement(By.cssSelector(DocsAndSupport.EMAIL_TEXT_FIELD)).sendKeys(Email);
		assertEquals("Entered email not displayed", Email, driver.findElement(By.cssSelector(DocsAndSupport.EMAIL_TEXT_FIELD)).getAttribute("value"));
		return this;
	}
	public DocsAndSupportPage selectCountryForSubscribe()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(DocsAndSupport.COUNTRY_CLICK)));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(DocsAndSupport.COUNTRY_CLICK)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(DocsAndSupport.COUNTRY_SELECT)));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(DocsAndSupport.COUNTRY_SELECT)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public DocsAndSupportPage pressSubscribeButton()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(DocsAndSupport.SUBSCRIBE_BUTTON)));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(DocsAndSupport.SUBSCRIBE_BUTTON)).click();;
		return this;
	}
	public  DocsAndSupportPage VerifySubscribeDone(String SubscribeMessage)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(DocsAndSupport.SUBSCRIBE_ACK)));
		String msg=driver.findElement(By.cssSelector(DocsAndSupport.SUBSCRIBE_ACK)).getText();
		assertEquals("Error SubscribeMessage not displayed",msg,SubscribeMessage);
		return this;
	}
	
}
