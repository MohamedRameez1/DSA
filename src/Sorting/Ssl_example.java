package Sorting;

public class Ssl_example {
	  class Node{
		  int data;
		  Node next;
		  public Node(int data) {
			  this.data = data;
			  this.next = null;
		  }
	  }
	  public Node head = null;
	  public Node tail = null;
	  void addNode(int data) {
		  Node newNode = new Node(data);
		  if(head == null) {
			  head= newNode;
			  tail = newNode;
		  }
	  
		  else {
			  tail.next = newNode;  // connecting to the newNode
			  tail = newNode;       // moving the tail
		  }
	  }
	  void addBeginning(int data) {
		  Node newNode = new Node(data);
		  if(head == null) {
			  head= newNode;
			  tail = newNode; 
	  }
		  else {
			  newNode.next = head;  // connecting to the newNode
			  head = newNode;       // moving the tail
		  }
	  }
	  void addlast(int data) {
		  Node newNode = new Node(data);
		  @SuppressWarnings("unused")
		Node current = head;	  
	    if(head==null) {
	    	head = newNode;
	    	tail = newNode;
	    }
	    else {/*
	    while(current.next!=null){
	    current = current.next;
	  }
	  current.next = newNode;
	  */
	    	tail.next= newNode;
	    	tail = newNode;
	    }
	  }
	 // void addBetween(int pos,int )
		  
	  public void display() {
		  Node current = head;
		  if(head == null){
			  System.out.println("Linked list is empty");		  
		  }
		  else {
			  System.out.println("Singly linked list elements are: ");
			  while(current!=null) {
				  System.out.print(current.data+" ");
				  current = current.next;
			  }
		  }
	  }
		public static void main(String[] args) {
			Ssl_example sll = new Ssl_example();
			sll.addNode(2);
			sll.addNode(4);
			sll.addNode(20);
			sll.addBeginning(100);
			sll.addlast(10);
			sll.addNode(12);
			sll.display();

		}

	}