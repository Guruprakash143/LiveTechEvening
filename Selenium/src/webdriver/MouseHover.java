package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
public static void main(String[] args) throws InterruptedException {
	
WebDriver driver=new ChromeDriver();
	
	//Maximize window
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	//Get the application title
	String title=driver.getTitle();
	if(title.equals("OrangeHRM - New Level of HR Management")) {
		System.out.println("Title is Matched....");
	}else {
		System.out.println("Title Not Matched....");
	}
	
	//Get the user name text
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();

	
	//Create the object of actions class
	Actions action=new Actions(driver);
	
	WebElement admin= driver.findElement(By.xpath("//li[@id='admin']"));
	
	action.moveToElement(admin).perform();
	
	Thread.sleep(1000);
	
	WebElement users=driver.findElement(By.xpath("//span[text()='Users']"));
	action.moveToElement(users).perform();
	Thread.sleep(1000);
	
	WebElement hrUsers=driver.findElement(By.xpath("//span[text()='HR Admin Users']"));
	action.moveToElement(hrUsers).build().perform();
	Thread.sleep(1000);
	hrUsers.click();
	
	
	
}
}
