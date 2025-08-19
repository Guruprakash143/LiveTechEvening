package corejava;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
public static void main(String[] args) {
	
	PriorityQueue<String> queue=new PriorityQueue<String>();
	queue.add("Guru");
	queue.add("Hello");
	queue.add("Sri");
	
	Iterator<String> itr=queue.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("After remove");
	queue.remove();
	Iterator<String> itr1=queue.iterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
	}
}
}
