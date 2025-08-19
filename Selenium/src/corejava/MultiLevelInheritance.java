package corejava;


class MultiLevelOne{
	
	public void test() {
		System.out.println("This is the MultiLevel Class One Method...");
	}
}

class MultiLevelTwo extends MultiLevelOne{
	public void test2() {
		System.out.println("This is the MultiLevel Class Second Method...");
	}
}



//child class
public class MultiLevelInheritance  extends MultiLevelTwo{

	public void test3() {
		System.out.println("This is the MultiLevel Child Class Method...");
	}
	
	public static void main(String[] args) {
		
		MultiLevelInheritance obj=new MultiLevelInheritance();
		
		obj.test3();
		obj.test2();
		obj.test();
		
		
				
	}
}
