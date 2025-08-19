package corejava;

public class NullPointer {
public static void main(String[] args) {
	
	String str=null;
	
	try {
		
		int length=str.length();
		System.err.println("Length of String :"+length);
	}catch(NullPointerException e) {
		System.out.println(e);
	}
}
}
