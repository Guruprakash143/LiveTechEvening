package webdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardOperation {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/accordion/");
	driver.manage().window().maximize();
	
	Actions action=new Actions(driver);
	
	action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	
	Thread.sleep(3000);
	
	action.keyUp(Keys.CONTROL).sendKeys(Keys.HOME).perform();
	

}
}
