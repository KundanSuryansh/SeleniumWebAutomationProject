package pages;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import locator.Home;
import pages.HomePage;
public class HomePage {
	WebDriver driver;
	WebDriverWait wait;
	public HomePage(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait = wait;
	}
	public HomePage verifyTitle(String title)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Home.HOMEBODY)));
		assertEquals(title,driver.getTitle());
		return this;
	}
	public HomePage pressMyProduct()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Home.MYPRODUCT)));
		sleep();
		driver.findElement(By.cssSelector(Home.MYPRODUCT)).click();
		return this;
	}
	public HomePage pressKendoUI()
	{
		sleep();
		driver.findElement(By.cssSelector(Home.KENDOUI)).click();
		return this;
		
	}
	public HomePage pressUiForWpf()
	{
		sleep();
		driver.findElement(By.cssSelector(Home.UIFORWPF)).click();
		return this;
	}
	public HomePage pressAccountButton()
	{
		sleep();
		driver.findElement(By.cssSelector(Home.ACCOUNTLOGO)).click();
		return this;
	}
	
	public HomePage pressDemoButton()
	{
		sleep();
		driver.findElement(By.cssSelector(Home.DEMOS)).click();
		return this;
	}
	
	public HomePage pressPricingButton()
	{
		sleep();
		driver.findElement(By.cssSelector(Home.PRICING)).click();
		return this;
	}
	public HomePage lanchUrl(String url)
	{
		driver.get(url);
		return this;
	}
	public HomePage pressSearchButton()
	{
		sleep();
		driver.findElement(By.cssSelector(Home.SEARCH)).click();
		return this;
	}
	public HomePage pressContactButton()
	{
		sleep();
		driver.findElement(By.cssSelector(Home.CONTACT)).click();
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
