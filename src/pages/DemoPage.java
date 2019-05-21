package pages;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locator.Demo;

public class DemoPage {
	WebDriver driver;
	WebDriverWait wait;
	public DemoPage(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait = wait;
	}
	public DemoPage verifyTitle(String title)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Demo.IMAGEVISIBLE)));
		assertEquals(title,driver.getTitle());
		return this;
	}
}
