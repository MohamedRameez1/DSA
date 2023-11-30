package Sorting;

import java.util.ArrayDeque;

public class DequeueRemove {

	public static void main(String[] args) {
		ArrayDeque<String>animals = new ArrayDeque<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Horse");
		animals.add("Hen");
		animals.add("Tiger");
		animals.add("Lion");
		System.out.println("ArrayDeque: "+animals);
		
		// Using remove()
		String element = animals.remove();
		System.out.println("Removed Element: "+animals);
		
		// Using remove(elements)
		animals.remove("Cow");
		
		
		System.out.println("New ArrayDeque: "+animals);
		
		// Using removeFirst()
		String firstelements = animals.removeFirst();
		System.out.println("Removed firstelement: "+firstelements);
		
		// Using removeLast(
		String lastelements = animals.removeLast();
		System.out.println("Removed last element: "+lastelements);
		
		System.out.println("New ArrayDeque: "+animals);
		animals.clear();
		System.out.println("New ArrayDeque: "+animals);
	}

	}


