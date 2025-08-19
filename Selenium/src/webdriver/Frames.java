package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
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
	
	String username=driver.findElement(By.name("txtUserName")).getAttribute("value");
	
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	
	
	//Get the WelCome Text 
	String welcomeText=driver.findElement(By.xpath("//ul[@id='option-menu']/li[1]")).getText();
	
	
	if(welcomeText.equals("Welcome "+username)) {
		System.out.println("Login sucessfull with valid user");
	}else {
		System.out.println("Login sucessfull with invalid user");
	}
	
	//Enter the frame
	driver.switchTo().frame("rightMenu");
	
	//Click on add button 
	driver.findElement(By.xpath("//div[@class='actionbuttons']/input[1]")).click();
	
	Thread.sleep(2000);
	
	//Exit the frame
	driver.switchTo().defaultContent();
	
	driver.findElement(By.linkText("Logout")).click();
	
	driver.quit();
}
}
