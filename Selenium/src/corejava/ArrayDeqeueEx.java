package corejava;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeqeueEx {
public static void main(String[] args) {
	
	ArrayDeque<String> que=new ArrayDeque<String>();
	que.add("anu");
	que.add("Hello");
	que.addLast("Rama");
	que.addFirst("Guru");
	
	Iterator<String> itr=que.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
