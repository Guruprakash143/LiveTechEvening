package corejava;

//Super class/ Parent
class Single{
	
	public void bike() {
		System.out.println("My bike name is HONDA.....");
	}
}


//child class / Sub class
public class SingleInheritance extends Single {

	public void car() {
		System.out.println("My car name is Hyndai i20.....");
	}
	
	
	public static void main(String[] args) {
		
		SingleInheritance obj=new SingleInheritance();
		obj.car();
		obj.bike();
				
	}
	
	
}
