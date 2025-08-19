package webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	
	driver.findElement(By.name("Submit")).click();
	
	Alert alert=driver.switchTo().alert();
	
	System.out.println("Alert text is ="+alert.getText());
	
	alert.accept();
	
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	
	
	driver.findElement(By.linkText("Logout")).click();
	
	driver.quit();
	
	
}
}
