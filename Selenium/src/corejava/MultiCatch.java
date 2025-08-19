package corejava;

public class MultiCatch {
public static void main(String[] args) {
	
	try {
		
		int arr[]=new int[5];
		
		arr[4]=30/0;
		System.out.println(arr[4]);
		
	}catch(ArithmeticException e) {
		System.out.println("Arithmetic Exception occurs");
		System.out.println(e);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBounds Exception occurs");
		System.out.println(e);
	}catch(NullPointerException e) {
		System.out.println("Null Pointer Exception occurs");
		System.out.println(e);
	}
}
}
