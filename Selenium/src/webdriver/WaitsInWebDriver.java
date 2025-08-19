package webdriver;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsInWebDriver {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	
	//Implicit Wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	
	
	//Explicit Wait
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("txtPassword")));
	
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	
	
	
	//Fluent Wait
	Wait<WebDriver> fw=new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(200))
			.pollingEvery(Duration.ofSeconds(2))
			.ignoring(StaleElementReferenceException.class);
	
	WebElement fo=fw.until(new Function<WebDriver, WebElement>() {

		@Override
		public WebElement apply(WebDriver driver) {

			return driver.findElement(By.name("Submit"));
			 
		}
	});
	
	fo.click();
	
	
	
}
}
