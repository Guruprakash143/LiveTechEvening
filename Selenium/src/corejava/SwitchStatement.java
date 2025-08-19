package corejava;

public class SwitchStatement {
public static void main(String[] args) {
	
	int day=1;
	
	switch(day) {
	
	case 1:
		System.out.println("Today is Sunday");
		break;
	case 2:
		System.out.println("Today is Monday");
		break;
	case 3:
		System.out.println("Today is TuesDay");
		break;
	case 4:
		System.out.println("Today is Thursday");
		break;
	case 5:
		System.out.println("Today is Friday");
		break;
	case 6:
		System.out.println("Today is Saturday");
		break;
		
		default:
			System.out.println("This is the Default statement...");
	}
}
}
