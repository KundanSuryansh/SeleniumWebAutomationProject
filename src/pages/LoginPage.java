package pages;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locator.Login;


public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;
	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait = wait;
	}
	public LoginPage verifyTitle(String title)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Login.EMAIL)));
		assertEquals(title,driver.getTitle());
		return this;
	}
	public LoginPage enterEmail(String email){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Login.EMAIL)));
		driver.findElement(By.cssSelector(Login.EMAIL)).clear();
		driver.findElement(By.cssSelector(Login.EMAIL)).sendKeys(email);
		assertEquals("Entered email not displayed", email, driver.findElement(By.cssSelector(Login.EMAIL)).getAttribute("value"));
		return this;
	}
	public LoginPage enterPassword(String password){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Login.PASSWORD)));
		driver.findElement(By.cssSelector(Login.PASSWORD)).clear();
		driver.findElement(By.cssSelector(Login.PASSWORD)).sendKeys(password);
		assertEquals("Entered password not displayed", password, driver.findElement(By.cssSelector(Login.PASSWORD)).getAttribute("value"));
		return this;
	}
	public LoginPage clickLoginBtn()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Login.LOGINBUTTON)));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement btn=driver.findElement(By.cssSelector(Login.LOGINBUTTON));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btn.submit();
		return this;
	}
	
	public LoginPage VerifyErrorMessage(String message)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Login.ERRMSG)));
		String msg=driver.findElement(By.cssSelector(Login.ERRMSG)).getText();
		assertEquals("Error message not displayed",msg,message);
		return this;
	}
}
