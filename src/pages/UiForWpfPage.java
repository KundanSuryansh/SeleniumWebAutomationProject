package pages;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import locator.UiForWpf;

public class UiForWpfPage {
	WebDriver driver;
	WebDriverWait wait;
	public UiForWpfPage(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait = wait;
	}
	public UiForWpfPage verifyTitle(String title)
	{
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(UiForWpf.FREETRIALBUTTON)));
	assertEquals(title,driver.getTitle());
	return this;
	}
}
