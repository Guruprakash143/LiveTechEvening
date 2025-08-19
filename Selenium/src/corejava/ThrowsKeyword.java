package corejava;

import java.io.IOException;

class ThrowsError{
	
	void method() throws IOException{
		System.out.println("Device operation performed....");
	}
}


public class ThrowsKeyword {

	public static void main(String[] args) throws IOException {
		
		ThrowsError obj=new ThrowsError();
		obj.method();
				
	}
}
