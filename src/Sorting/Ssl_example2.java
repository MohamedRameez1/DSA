package Sorting;


public class Ssl_example2 {	
       class Node{
    	   int data;
    	   Node next;
    	   Node prev;
    	 public Node(int data) {
    		 this.data = data;
    		 this.next = null;
    		 this.prev = null;
    	 }
    	    
       }
       public Node head = null;
       public Node tail = null;
       
       void addNodeFront(int data) {
    	   Node newNode = new Node(data);
    	   if(head == null) {
    		   head = newNode;
    		   tail = newNode;
    	   }
    	   else if(head!= null) {
    		   newNode.next =head;
    		   head.prev = newNode;
    		   
    		   
    	   }
       }
       void iterateFront() {
    	   Node current = head;
    	   if(head == null)
    		   System.out.println("The given node is empty: ");
    	   else if(current !=null) {
    			   System.out.print(current.data+" ");
    			   current = current.next;
    		   }
    		   
    	   }
    	   
       
    	   public static void main(String[] args) {
    		   Ssl_example2 obj = new Ssl_example2();
    		   
    		  obj.addNodeFront(2);
    		  obj.addNodeFront(3);
    		  obj.addNodeFront(5);
    		  obj.iterateFront();
    		  obj.addNodeFront(5);
       }
}