package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllvaluesFromDropdown {
public static void main(String[] args) {
	
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
	
	driver.switchTo().frame(0);
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='loc_code']"));
	Select select=new Select(dropdown);

    List<WebElement> list=select.getOptions();
    for(WebElement l:list) {
    	System.out.println(l.getText());
    }
	
}
}
