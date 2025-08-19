package testng;

import org.testng.annotations.Test;

public class GroupingTest {

	@Test(groups = "Smoke")
	public void smokeTest1() {
		System.out.println("This is the Smoke Test Case...");
	}
	
	@Test(groups = "Smoke")
	public void smokeTest2() {
		System.out.println("This is the Smoke Test Case...");
	}
	
	@Test(groups = "Smoke")
	public void smokeTest3() {
		System.out.println("This is the Smoke Test Case...");
	}
	
	
	@Test(groups = "Sanity")
	public void sanityTest1() {
		System.out.println("This is the Sanity Test Case...");
	}
	
	@Test(groups = "Sanity")
	public void sanityTest2() {
		System.out.println("This is the Sanity Test Case...");
	}
	
	@Test(groups = "Sanity")
	public void sanityTest3() {
		System.out.println("This is the Sanity Test Case...");
	}
}
