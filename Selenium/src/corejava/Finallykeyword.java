package corejava;

public class Finallykeyword {
public static void main(String[] args) {
	
	try {
		
		int x=25/0;
		System.out.println(x);
	}catch(Exception e) {
		
		System.out.println(e);
	}finally{
		System.out.println("Finally block is always executed....");
	}
	
	System.out.println("Rest of the code....");
}
}
