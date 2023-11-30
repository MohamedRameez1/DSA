package Sorting;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// Creating Queue using the linkedlist class
		Queue<Integer> numbers = new LinkedList<>();
		
		// offer element to the Queue
		numbers.offer(1);
		numbers.offer(2);
		numbers.offer(3);
		System.out.println("Queue: "+numbers);
		
		// Access elements of the Queue
		int accessedNumber = numbers.peek();
		System.out.println("Accesssed Element: "+ accessedNumber);
		
		// Remove elements of the Queue
		int removedNumber = numbers.poll();
		System.out.println("Removed element: "+removedNumber);
		
		System.out.println("Update Queue: "+numbers);
	}

}
