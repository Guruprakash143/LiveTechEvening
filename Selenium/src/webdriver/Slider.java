package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slider {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/slider/");
	
	driver.switchTo().frame(0);
	
	WebElement element=driver.findElement(By.xpath("//div[@id='slider']/span"));
	
	for(int i=0;i<=10;i++) {
	element.sendKeys(Keys.ARROW_RIGHT);

	}
	
}
}
