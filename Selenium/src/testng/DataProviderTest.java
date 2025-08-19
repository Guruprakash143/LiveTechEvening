package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "Credentails")
	public void login(String username,String password) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();
		
	}
	
	
	@DataProvider(name="Credentails")
	public Object[][] loginDetails(){
		
		return new Object[][] {{"admin","admin"},{"admin","admin"},{"Guru","Guru"}};
	}
}
