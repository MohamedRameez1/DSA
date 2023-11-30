package Sorting;

public class DoublyLinkedList {
	class Node{
		// stores data
		public int data;
		// pointer to the next node
		public Node next;
		// pointer to the previous node
		public Node prev;
		
		
		public Node(int data) {
			this.data = data;
		
		}
		
	}
	
	// To represent the head of a doubly linked list
	Node head = null;
	// to represent the tail of  a doubly linked list
	Node tail = null;
	public void addNodeFront(int val) {
		Node temp = new Node(val);
		if(head != null)
		{
			head.prev = temp;
			temp.next=head;
		}
		head = temp;
		if(tail == null) 
			tail = temp;
	}
	public void addNodeback(int val) {
		Node temp = new Node(val);
		if(tail != null)
		{
			tail.next = temp;
			temp.prev=tail;
		}
		tail= temp;
		if(head == null) {
			head = temp;
	}
		System.out.println("New node added at the End: "+val);
}
	public void removeNodeFront() {
		Node temp = head;
		head = head.next;
		head.prev = null;
		System.out.println("deleted: "+temp.data);
		//return temp.data;
		
	}
	public void removeNodeBack() {
		Node temp = tail;
		tail = tail.prev;
		tail.next= null;
		System.out.println("deleted: "+temp.data);
		//return temp.data;
		
	}
	
	public void iterateForward() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp =temp.next;
		}
	}
		public void iterateBackward() {
			Node temp = tail;
			while(temp != null) {
				System.out.println(temp.data);
				temp =temp.prev;
			}
		
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addNodeFront(2);
		dll.addNodeFront(100);
		dll.addNodeback(1200);
		dll.addNodeback(2000);
		dll.addNodeback(500);
		System.out.println("Doubly llinked list Before remove: ");
		dll.iterateForward();
		dll.removeNodeFront();
		System.out.println("Doubly linked list after remove: ");
		dll.iterateForward();
		dll.removeNodeBack();
		System.out.println("Doubly linked list after Back: ");
		dll.iterateForward();
		System.out.println("iternate Backward: ");
		dll.iterateBackward();	

	}

}
