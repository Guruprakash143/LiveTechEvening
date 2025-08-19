package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectValuesWithOutSelectClass {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	
	driver.findElement(By.xpath("//div[@id='selectMenuContainer']/div[4]/div/div/div/div[1]")).click();
	
	driver.findElement(By.xpath("//*[text()='Mr.']")).click();
	
	
}
}
