package corejava;


interface One{
	void hello1();
}

interface Two{
	
	void hello2();
}

public class MultipleInheritance implements One,Two{

	
	public void hello2() {
		System.out.println("This is First interface");
	}


	public void hello1() {
	System.out.println("This is Second interface");
	}
	
	public static void main(String[] args) {
		
		MultipleInheritance obj=new MultipleInheritance();
		obj.hello1();
		obj.hello2();
		
	}

}
