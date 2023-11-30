package Sorting;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueUsingIterator {

	public static void main(String[] args) {
		// Creating Queue using the PriorityQueue class
		Queue<Integer> numbers = new PriorityQueue<>();
		
		// offer element to the Queue
		numbers.offer(4);
		numbers.offer(2);
		numbers.offer(1);
		System.out.println("Priority Queue using iterator(): ");

		// Using the iterator() method
		Iterator<Integer> iterate = numbers.iterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(",");
		}
	}

}
