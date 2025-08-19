package corejava;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {
public static void main(String[] args) {
	
	TreeSet<String> set=new TreeSet<String>();
	set.add("Guru");
	set.add("Anu");
	set.add("Hello");
	set.add("AAA");
	
	Iterator<String> itr=set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
