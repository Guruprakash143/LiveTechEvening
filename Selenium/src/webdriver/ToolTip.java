package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/tooltip/");
	
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	
	WebElement element=driver.findElement(By.id("age"));
	
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", element);
	
	Actions action=new Actions(driver);
	action.moveToElement(element).build().perform();
	
	String str=driver.findElement(By.id("age")).getAttribute("title");
	
	System.out.println("ToolTip Value is ="+str);
	
	
}
}
