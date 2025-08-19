package corejava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
public static void main(String[] args) {
	
	ArrayList<String> list=new ArrayList<>();
	list.add("Guru");
	list.add("Sri");
	list.add("Hari");
	list.add("Rama");
	
	
	Iterator<String> itr=list.iterator();
	
	while(itr.hasNext()) {
		
		System.out.println(itr.next());
	}
	
}
}
