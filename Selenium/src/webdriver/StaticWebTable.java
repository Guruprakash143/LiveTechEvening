package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	
	driver.switchTo().frame(0);
	
	List<WebElement> rows=driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr"));
	int rowCount=rows.size();
	System.out.println("Total Number Of Rows ="+rowCount);
	
	List<WebElement> columns=driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr[1]/td"));
	int columnsCount=columns.size();
	System.out.println("Total Number Of Columns ="+columnsCount);
	
	for(int i=1;i<=rowCount;i++) {
		for(int j=1;j<columnsCount;j++) {
			String value=driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print(value+" ");
		}
		System.out.println();
	}
	driver.quit();
	
}
}
