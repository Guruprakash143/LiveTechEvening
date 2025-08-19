package corejava;


class Override{
	
	public void bike() {
		System.out.println("My bike name is HONDA");
	}
}



public class MethodOverriding extends Override{

	public void bike() {
		
		System.out.println("My bike Name is KTM");
	}
	
	
	public static void main(String[] args) {
		
		//upcasting
		Override obj=new MethodOverriding();
		obj.bike();
	
	}
	
}
