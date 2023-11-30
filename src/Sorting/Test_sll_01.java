package Sorting;


@SuppressWarnings("unused")
public class Test_sll_01 {
	
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
			  tail.next = newNode; 
			  tail = newNode;   
		  }
	  }
	  
	  
	  void addBeginning(int data) {
		  Node newNode = new Node(data);
		  if(head == null) {
			  head= newNode;
			  tail = newNode; 
	  }
		  else {
			  newNode.next = head;  
			  head = newNode;       
		  }
	  }
	  
	  void addlast(int data) {
		  Node newNode = new Node(data);
		 
		Node current = head;	  
	    if(head==null) {
	    	head = newNode;
	    	tail = newNode;
	    }
	    else {
	    	tail.next= newNode;
	    	tail = newNode;
	    }
	  }
	  
	  public void deleteNodeFront() {
	        if (head == null) {
	            System.out.println("Linked list is empty. Cannot delete from front.");
	            
	        }else {
	        	 head = head.next;
	        }
	       
	    }

	    public void deleteNodeBack() {
	        if (head == null) {
	            System.out.println("Linked list is empty. Cannot delete from back.");
	        }
	        if (head == tail) {
	            head = tail = null;
	        }
	        Node current = head;
	        while (current.next != tail) {
	            current = current.next;
	        }
	        current.next = null;
	        tail = current;
	    }
	  
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
			Test_sll_01 sll = new Test_sll_01();
			
			sll.addNode(2);
			sll.addNode(4);
			sll.addBeginning(6);
			sll.addlast(10);
			sll.addNode(12);
			sll.display();
			sll.deleteNodeFront();
			sll.deleteNodeBack();
			sll.display();
			

		}

	}