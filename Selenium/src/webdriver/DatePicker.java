package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/date-picker");
	
	WebElement element= driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']"));
	
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", element);
	
	element.click();
	
	Thread.sleep(2000);
	WebElement month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
	Select select=new Select(month);
	
	select.selectByVisibleText("August");
	
	WebElement year=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
	Select select1=new Select(year);
	
	select1.selectByValue("2025");
	
	driver.findElement(By.xpath("//div[@class='react-datepicker__month']/div/div[text()='25']")).click();
	
	
}
}
