package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConditions {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	
	WebElement username= driver.findElement(By.name("txtUserName"));
	
	if(username.isEnabled()) {
		username.sendKeys("admin");
	}
	
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	
	WebElement loginBtn=driver.findElement(By.name("Submit"));
	if(loginBtn.isDisplayed()) {
		loginBtn.click();
	}
	
	
	driver.quit();
	
}
}
