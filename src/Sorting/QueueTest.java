package Sorting;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> numbers = new LinkedList<>();
        numbers.offer(11);
        numbers.offer(5);
        numbers.offer(25);
        numbers.offer(34);
        numbers.offer(96);
        numbers.offer(112);
        
        System.out.println("Queue: "+numbers);
        
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Number: "+accessedNumber);
        
         int removedNumber = numbers.poll();
     		System.out.println("Removed element: "+removedNumber);
     		
     	  numbers.remove(34);
     		
     		
     		System.out.println("Update Queue: "+numbers);
        
	}

}
