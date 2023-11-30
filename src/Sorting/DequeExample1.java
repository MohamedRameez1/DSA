package Sorting;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample1 {

	public static void main(String[] args) {
		// Creating Deque using the ArrayDeque class
		
		Deque<Integer> numbers = new ArrayDeque<>();
		
		//Add elements to the Deque
		numbers.offer(1);
		numbers.offerLast(2);
		numbers.offerFirst(3);
		System.out.println("Deque: "+numbers);
		
		// Access elements o the Deque
		int firstElement = numbers.peekFirst();
		System.out.println("First Element: "+firstElement);
		
		int lastElement = numbers.peekLast();
		System.out.println("last element: "+lastElement);
		
		// Remove firstElement = numbers.peekFirst();
		int removeNumber1 = numbers.pollFirst();
		System.out.println("Remove First Element: "+removeNumber1);
		
		int removedNumber2 = numbers.pollLast();
		System.out.println("Removed last Element: "+removedNumber2);
		
		System.out.println("Update Deque: "+numbers);
		
	
		}

}
