package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	WebDriver driver;
	@Parameters({"browser"})
	@BeforeClass
	public void openBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\swapn\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	@Test
	public void login() {
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		Reporter.log("UserName Entered");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		Reporter.log("Password Entered");
		driver.findElement(By.name("Submit")).click();
		Reporter.log("Login button clicked...");
	}
	
	@Test
	public void logout() {
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("Logout link Clicked...");
	}
	
}
