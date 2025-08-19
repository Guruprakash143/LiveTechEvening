package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLoginSucess {
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
	
	
	
	driver.quit();
	
}

}
