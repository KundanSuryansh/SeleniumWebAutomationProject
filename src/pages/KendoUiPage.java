package pages;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import locator.KendoUi;

public class KendoUiPage {
	
	WebDriver driver;
	WebDriverWait wait;
	public KendoUiPage(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait = wait;
	}
	public KendoUiPage verifyTitle(String title)
	{
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(KendoUi.KENDOUIBUTTON)));
	assertEquals(title,driver.getTitle());
	return this;
	}

}
