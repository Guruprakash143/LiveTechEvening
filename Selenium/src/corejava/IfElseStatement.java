package corejava;

public class IfElseStatement {

	public static void main(String[] args) {
		
		int x=10;
		if(x<9) {
			System.out.println("Inside if block");
			System.out.println("10 is less than 9");
		}else {
			System.out.println("Inside else block");
			System.out.println("10 is greater than 9");
		}
		
		System.out.println("This is out side the if else statement...");
	}
}
