package corejava;

public class MethodOverloading {

	public void mobile(String str) {
		System.out.println("My Mobile Name is "+str);
	}
	
    public void mobile(int i) {
	   	System.out.println("My Mobile Price is "+i);
	}
    
    public static void main(String[] args) {
		
    	MethodOverloading obj=new MethodOverloading();
    	obj.mobile("Sony");
    	obj.mobile("10000");
	}
}
