package pages;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locator.Account;

public class AccountPage {
	WebDriver driver;
	WebDriverWait wait;
	public AccountPage(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait = wait;
	}
	public AccountPage verifyTitle(String title)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Account.PRODUCT_VISIBLE)));
		assertEquals(title,driver.getTitle());
		return this;
	}
	public AccountPage accountOverview()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Account.ACOUNT_ICON)));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(Account.ACOUNT_ICON)).click();;
		return this;
	}
	public AccountPage logout()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Account.LOGOUT)));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(Account.LOGOUT)).click();
		return this;
	}
	public AccountPage editProfile()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Account.EDIT_PROFILE)));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(Account.EDIT_PROFILE)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Account.IMG)));
		return this;
	}
	public AccountPage changeNickName(String NewNickName)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Account.NICKNAME)));
		driver.findElement(By.cssSelector(Account.NICKNAME)).clear();
		driver.findElement(By.cssSelector(Account.NICKNAME)).sendKeys(NewNickName);
		assertEquals("Entered nickname not displayed", NewNickName, driver.findElement(By.cssSelector(Account.NICKNAME)).getAttribute("value"));
		return this;
	}
	public AccountPage clickOnUpdateProfilePageButton()
	{
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("scroll(0, 1000)"); // if the element is at bottom.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Account.UPDATE_PROFILE_PAGE_BUTTON)));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(Account.UPDATE_PROFILE_PAGE_BUTTON)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jse1.executeScript("scroll(1000,0)"); // if the element is at Upwards
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
		
	}
	
}
