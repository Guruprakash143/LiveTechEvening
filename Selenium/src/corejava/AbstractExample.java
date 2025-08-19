package corejava;

abstract class HelloTest{
	
	
	abstract void testAbs() ;
	
	void test2() {
		System.out.println("Normal Method inside abstract class");
	}
	
}


public class AbstractExample extends HelloTest{

	void testAbs() {
		System.out.println("This is the abstract method...");
		
	}
	
	public static void main(String[] args) {
		
		HelloTest obj=new AbstractExample();
		obj.testAbs();
		obj.test2();
				
		
	}

}
