package corejava;

public class NestedIf {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		
		if(x<20) {
			if(y<20) {
				System.out.println("Inside the nested if statement");
				System.out.println("X Value is less than 20");
				System.out.println("Y Value is less than 30");
			}
		}
		
		System.out.println("This is the outside the nested if statement...");
	}
}
