package corejava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
public static void main(String[] args) {
	
	HashSet<String> set=new HashSet<String>();
	set.add("Guru");
	set.add("Rama");
	set.add("Sri");
	set.add("Guru");
	set.add(null);
	set.add(null);
	
	Iterator<String> itr=set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
