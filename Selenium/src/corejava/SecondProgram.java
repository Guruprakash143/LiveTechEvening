package corejava;

public class SecondProgram {

	//Create the method 
	
	/*Create two different method
	 * and call those methods
	 */
	public void test1() {
		System.out.println("This is the Method One.....");
	}
	
	public void test2() {
		System.out.println("This is the Method Two....");
	}
	
	public int test3() {
		
		int x=10;
		return x;
	}
	
	public static void main(String args[]) {
		
		SecondProgram  obj=new SecondProgram();
		obj.test1();
		obj.test2();
		System.out.println(obj.test3());
		
	}
}
