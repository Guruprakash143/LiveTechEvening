package webdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
public static void main(String[] args) throws IOException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("Guru");
	driver.findElement(By.name("txtPassword")).sendKeys("Guru");
	driver.findElement(By.name("Submit")).click();
	
	File takeScreen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(takeScreen, new File("C:\\Users\\swapn\\Desktop\\GuruClassPrograms\\LT.png"));
	
	driver.quit();
}
}
