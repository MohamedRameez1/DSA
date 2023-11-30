package Sorting;

import java.util.ArrayDeque;
import java.util.Iterator;

public class IteratorDeque {

	public static void main(String[] args) {
		
			ArrayDeque<String>animals = new ArrayDeque<>();
			animals.add("Dog");
			animals.add("Cat");
			animals.add("Cow");
			animals.add("Horse");
			animals.add("Hen");
			animals.add("Tiger");
			animals.add("Lion");
     // Using iterator()
			System.out.println("\nArrayDeque: ");
			Iterator<String> iterate = animals.iterator();
			while(iterate.hasNext()) {
				System.out.print(iterate.next());
				System.out.print(",");
			}
			System.out.println("\nArrayDeque in reverse order: ");
	 // Using descendingIternator()
			Iterator<String> desiterate = animals.descendingIterator();
			while(desiterate.hasNext()) {
				System.out.print(desiterate.next());
				System.out.print(",");
			}
			
	}

}
