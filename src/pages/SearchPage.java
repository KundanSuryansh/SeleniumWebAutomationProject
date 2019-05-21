package pages;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locator.Search;

public class SearchPage {
	WebDriver driver;
	WebDriverWait wait;
	public SearchPage(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait = wait;
	}
	public SearchPage verifyTitle(String title)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Search.SEARCHBUTTON)));
		assertEquals(title,driver.getTitle());
		return this;
	}
	public SearchPage enterText(String text)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Search.SEARCHBOX)));
		driver.findElement(By.cssSelector(Search.SEARCHBOX)).clear();
		driver.findElement(By.cssSelector(Search.SEARCHBOX)).sendKeys(text);
		assertEquals("Entered text not displayed", text, driver.findElement(By.cssSelector(Search.SEARCHBOX)).getAttribute("value"));
		return this;
	}
	public SearchPage pressSearchButton()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Search.SEARCHBUTTON)));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(Search.SEARCHBUTTON)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
}
