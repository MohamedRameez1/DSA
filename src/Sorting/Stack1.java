package Sorting;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		 // Create a stack
        Stack<Integer> stack = new Stack<>();
        stack.push(24);
        stack.push(5);
        stack.push(11);
        stack.push(36);
        stack.push(65);

       

       stack.pop();

        // Display the elements
        System.out.println(stack);

        // Display the elements in reverse order
        Stack<Integer> reversedStack = new Stack<>();
        while (!stack.isEmpty()) {
            reversedStack.push(stack.pop());
        }
        System.out.println(reversedStack);
    }

}
