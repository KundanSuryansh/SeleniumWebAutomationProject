package pages;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import locator.Contact;

public class ContactPage {
	WebDriver driver;
	WebDriverWait wait;
	public ContactPage(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait = wait;
	}
	public ContactPage verifyTitle(String title)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Contact.HELP)));
		assertEquals(title,driver.getTitle());
		return this;
	}
	public ContactPage ClickOnHelp()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Contact.HELP)));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(Contact.HELP)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ContactPage SelectHelpData()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Contact.HELP_SELECT)));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(Contact.HELP_SELECT)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ContactPage ClickOnProductInterest()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Contact.PRODUCT_INTEREST)));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(Contact.PRODUCT_INTEREST)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	public ContactPage selectProductInterest()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Contact.PRODUCT_INTEREST_SELECT)));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(Contact.PRODUCT_INTEREST_SELECT)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ContactPage addFirstName(String FirstName)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Contact.FIRST_NAME)));
		driver.findElement(By.cssSelector(Contact.FIRST_NAME)).clear();
		driver.findElement(By.cssSelector(Contact.FIRST_NAME)).sendKeys(FirstName);
		assertEquals("Entered firstname not displayed", FirstName, driver.findElement(By.cssSelector(Contact.FIRST_NAME)).getAttribute("value"));
		sleep();
		return this;
	}
	public ContactPage addLastName(String LastName)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Contact.LAST_NAME)));
		driver.findElement(By.cssSelector(Contact.LAST_NAME)).clear();
		driver.findElement(By.cssSelector(Contact.LAST_NAME)).sendKeys(LastName);
		assertEquals("Entered lastname not displayed", LastName, driver.findElement(By.cssSelector(Contact.LAST_NAME)).getAttribute("value"));
		sleep();
		return this;
	}
	public ContactPage addEmail(String Email)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Contact.EMAIL)));
		driver.findElement(By.cssSelector(Contact.EMAIL)).clear();
		driver.findElement(By.cssSelector(Contact.EMAIL)).sendKeys(Email);
		assertEquals("Entered email not displayed", Email, driver.findElement(By.cssSelector(Contact.EMAIL)).getAttribute("value"));
		sleep();
		return this;
	}
	public ContactPage addCompanyName(String CompanyName)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Contact.COMPANY_NAME)));
		driver.findElement(By.cssSelector(Contact.COMPANY_NAME)).clear();
		driver.findElement(By.cssSelector(Contact.COMPANY_NAME)).sendKeys(CompanyName);
		assertEquals("Entered companyName not displayed", CompanyName, driver.findElement(By.cssSelector(Contact.COMPANY_NAME)).getAttribute("value"));
		sleep();
		return this;
	}
	
	public ContactPage addPhone(String Phone)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Contact.PHONE)));
		driver.findElement(By.cssSelector(Contact.PHONE)).clear();
		driver.findElement(By.cssSelector(Contact.PHONE)).sendKeys(Phone);
		assertEquals("Entered companyName not displayed", Phone, driver.findElement(By.cssSelector(Contact.PHONE)).getAttribute("value"));
		sleep();
		return this;
	}
	public void sleep()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
