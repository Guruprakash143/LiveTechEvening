package corejava;

public class ForLoop {
public static void main(String[] args) {
	
	int i=10;
	for(;i<=20;i=i+2) {
		
		//System.out.println("Value of I is "+i);
		
		if(i==15) {
			//break;
			continue;
		}
		
		System.out.println("Value of I is "+i);
	}
}
}
