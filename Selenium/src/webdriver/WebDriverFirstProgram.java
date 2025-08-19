package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFirstProgram {
public static void main(String[] args) {
	
	
	//Set chrome driver .exe file
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guru\\ClassPractice\\chromedriver-win64\\chromedriver.exe");
	//Create web driver instance
	WebDriver driver=new ChromeDriver();
	
	//Open any application 
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	
	//Enter the valid user name and password
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
	
	//Click on Login button 
	driver.findElement(By.cssSelector(".button")).click();
	
	
	//Close the browser
	driver.quit();
	
}
}
