package bl.com.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueProblem {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Amod");
		queue.add("Chaudhari");
		queue.add("Kachewani");
		queue.add("Tirora");
		System.out.println("Head of Element"+" "+queue.element());
		System.out.println("Peek Element in list:" +" "+queue.peek());
		
		Iterator item =queue.iterator();
		while(item.hasNext()) {
			System.out.println(item.next());
			
		}
		//queue.poll();
		//System.out.println("After use pool ");
		//System.out.println(queue);
		System.out.println("After use pool ");
		queue.remove();
		System.out.println(queue);
		

	}

}
