package corejava;

public class Variables {

 	int x=200; //Instance
 	
 	static int xx=500;
	
	public void HelloTest() {
		
		int x=100; //local variable
		System.out.println("Value of X is "+x);
	}
	
	public void HelloTest2() {
		
		System.out.println("Value of X is "+x);
	}
	
	public static void main(String args[]) {
		
		Variables obj=new Variables();
		obj.HelloTest();
		obj.HelloTest2();
		System.out.println(xx);
	}
	
}
