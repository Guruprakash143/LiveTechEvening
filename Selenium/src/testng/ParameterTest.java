package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	//@Parameters({"username","password"})
	@Test
	public void login() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\swapn\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("username");
		driver.findElement(By.name("txtPassword")).sendKeys("password");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();
		
	}
}
