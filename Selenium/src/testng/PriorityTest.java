package testng;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 0,enabled = false)
	public void one() {
		System.out.println("This is the Method One...");
	}
	
	@Test(priority = 1,invocationCount = 5)
	public void two() {
		System.out.println("This is the Method Two...");
	}
	
	@Test(priority = 2)
	public void three() {
		System.out.println("This is the Method Three...");
	}
	
	@Test(priority = 3)
	public void four() {
		System.out.println("This is the Method Four...");
	}
}
