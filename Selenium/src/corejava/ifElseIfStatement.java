package corejava;

public class ifElseIfStatement {

	public static void main(String[] args) {
		
		int x=100;
		
		if(x<100) {
			System.out.println("Inside the if statement");
			System.out.println("x Value is less than 100 ");
		}else if(x<=100) {
			System.out.println("Inside the else if statement");
			System.out.println("x Value is less than or equal to 100 ");
		}else {
			System.out.println("This is the Else statement...");
		}
		
		System.out.println("This is the outside the if else if statement...");
	}
}
