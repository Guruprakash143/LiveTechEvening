package corejava;

public class EncapsulationExample {
	
	private String name;
	private int age;
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
public static void main(String[] args) {
	
	EncapsulationExample obj=new EncapsulationExample();
	obj.setName("Guru");
	obj.setAge(100);
	
	System.out.println(obj.getName());
	System.out.println(obj.getAge());
}
}
