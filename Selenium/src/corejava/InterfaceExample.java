package corejava;


interface NewInterface{
	
	void print() ;
}

public class InterfaceExample implements NewInterface{

	
	public void print() {
		System.out.println("Hello This Interface method...");
		
	}

	public static void main(String[] args) {
		
		NewInterface obj=new  InterfaceExample();
		obj.print();
				
		
	}
	
}
