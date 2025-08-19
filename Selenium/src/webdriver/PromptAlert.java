package webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Guru/LiveTech/Automation/HTML%20Programs/answerOnNextPrompt.html%20.html");
	
	driver.findElement(By.linkText("Click here to enter your name")).click();
	
	Alert alert=driver.switchTo().alert();
	
	System.out.println(alert.getText());
	alert.sendKeys("Selenium Webdriver");
	
	alert.accept();
}
}
