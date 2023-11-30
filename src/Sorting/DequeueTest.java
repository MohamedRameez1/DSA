package Sorting;

import java.util.ArrayDeque;

public class DequeueTest {

	public static void main(String[] args) {
		ArrayDeque<String>colors = new ArrayDeque<>();
		colors.add("one");
		colors.add("Two");
		colors.add("Three");
		colors.add("Four");
		colors.add("Five");
		System.out.println("Elements: "+colors);
		
		colors.addFirst("red");
		colors.addLast("blue");
		System.out.println("Elements: : "+colors);
		
		String peek = colors.peekFirst();
		 System.out.println("peek element: "+peek);
		
		// remove elements
		 colors.pollFirst();
		 colors.pollLast();
		 System.out.println("Elements: : "+colors);
		 

	}

}
