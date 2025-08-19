package corejava;

public class ThrowKeyword {

	public static void validate(int age) {
		
		if(age< 18) {
			
			throw new ArithmeticException("Person is not eligible to vote");
		}else {
			System.out.println("Person is eligibl to vote....");
		}
	}
	
	public static void main(String[] args) {
		
		validate(15);
		System.out.println("Rest of the code.....");
	}
}
