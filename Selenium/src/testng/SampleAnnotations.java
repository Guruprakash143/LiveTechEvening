package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleAnnotations {

	@BeforeSuite
	public void bSuite() {
		System.out.println("This is the Before Suite Method...");
	}
	
	@AfterSuite
	public void aSuite() {
		System.out.println("This is the After Suite Method...");
	}
	
	@BeforeClass
	public void bClass() {
		System.out.println("This is the Before Class Method...");
	}
	
	@AfterClass
	public void aClass() {
		System.out.println("This is the After Class Method...");
	}
	
	@BeforeTest
	public void bTest() {
		System.out.println("This is the Before Test Method...");
	}
	
	
	@AfterTest
	public void aTest() {
		System.out.println("This is the After Test Method...");
	}
	
	
	@BeforeMethod
	public void bMethod() {
		System.out.println("This is the Before Method...");
	}
	

	@AfterMethod
	public void aMethod() {
		System.out.println("This is the After Method...");
	}
	

	@Test
	public void test1() {
		System.out.println("This is the Test1 Method...");
		Reporter.log("This is the Test1 Method...");
	}
	
	@Test
	public void test2() {
		System.out.println("This is the Test2Method...");
		Reporter.log("This is the Test2 Method...");
	}
}
