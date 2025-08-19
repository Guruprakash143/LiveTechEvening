package webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	String mainWindow=driver.getWindowHandle();
	
	WebElement ele= driver.findElement(By.xpath("//span[@title='Remote']"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", ele);
	
	Set<String> allWin=  driver.getWindowHandles();
	Iterator<String> itr=allWin.iterator();
	while(itr.hasNext()) {
		
		String chilWindow=itr.next();
		
		if(!mainWindow.equalsIgnoreCase(chilWindow)) {
			driver.switchTo().window(chilWindow);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
		}
		
		driver.switchTo().window(mainWindow);
		
		driver.findElement(By.xpath("(//input[@class='suggestor-input '])[1]")).sendKeys("Selenium Webdriver");
		
		driver.findElement(By.xpath("//button[@class='nI-gNb-sb__icon-wrapper']")).click();
	}
	
	
}
}
