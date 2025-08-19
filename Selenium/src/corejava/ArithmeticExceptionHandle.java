package corejava;

public class ArithmeticExceptionHandle {
public static void main(String[] args) {
	
	int div=10;
	int x=0;
	
	try {
		
		int result=div/x;
		System.out.println(x);
	}catch(ArithmeticException e) {
		System.out.println(e);
	}
}
}
