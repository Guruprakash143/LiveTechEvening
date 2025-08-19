package corejava;


class First{
	void test1() {
		System.out.println("This is the First Class Method....");
	}
}

class Second extends First{
	void test2() {
		System.out.println("This is the Second Class Method...");
	}
}

class Hello extends First{
	
	void test3() {
		System.out.println("This is the Hello Class method....");
	}
	
}


public class Hierarchical extends First{

	public static void main(String[] args) {
		
		Hierarchical obj=new Hierarchical();
		obj.test1();
	}
}
