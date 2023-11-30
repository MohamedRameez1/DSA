package Sorting;

import java.util.NoSuchElementException;
import java.util.Scanner;

class Node{
	protected int data;
	protected Node link;
	//constructor
	public Node()
	{
		link=null;
		data=0;
	}//constructor
	public Node(int d,Node n)
	{
		data=d;
		link=n;
		
}
//function to set link to next node
public void setLink(Node n)
{
	link=n;
}
//func to set data to current node
public void setData(int d)
{
	data=d;
}
//func to get link to next node
public Node getLink() {
	return link;
}
//func to get data from current node
public int getData() {
	return data;
}}//class linked queue
class linkedQueue
{
	protected Node front,rear;
	public int size;
	//constructor
	public linkedQueue() {
		front=null;
		rear=null;
		size=0;
	}
//func to check  if queue is empty
	public boolean isEmpty()
	{
		return front==null;
	}
	//func to get te size of the queue
	public int getSize() {
		return size;
	}
	//func to insert the element to the queue
	public void insert(int data) {
		Node nptr=new Node(data,null);
		if(rear==null)
		{
			front=nptr;
			rear=nptr;
		}
		else
		{
			rear.setLink(nptr);
			rear=rear.getLink();
		}
		size++;
	}
	//func to remove front element froom the queue
	public int remove() {
		if(isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		Node ptr=front;
		front=ptr.getLink();
		if(front==null)
			rear=null;
		size--;
		return ptr.getData();
	}
	//func to check the front elemenet of the queue
	public int peek() {
		if(isEmpty())
			throw new NoSuchElementException("Underflow Exception");
	return front.getData();
	}
	//func to display the status of the queue
	public void display() {
		System.out.print("\nQueue=");
		if(size==0)
		{
			System.out.print("Empty\n");
			return;
		}
	Node ptr=front;
	while(ptr!=rear.getLink()) {
		System.out.print(ptr.getData()+" ");
		ptr=ptr.getLink();
	}
	System.out.println();
	}
	}
 //class LinkedQueueImplement
public class LinkedQueueImpelement
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
//creating objects of class llinkedqueue
linkedQueue lq= new linkedQueue();
//perform queue operation
System.out.println("linked queue test\n");
char ch;
do {
	System.out.println("\nQueue OPerations");
	System.out.println("1.insert");
	System.out.println("2.remove");
	System.out.println("3.peek");
	System.out.println("4.check empty");
	System.out.println("5.size");
	int choice=scan.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("Enter iinteger element to insert");
	lq.insert(scan.nextInt());
	break;
	case 2:
		try
		{
			System.out.println("Removed element="+lq.remove());
		}
	catch(Exception e) {
		System.out.println("Error:"+e.getMessage());
	}
		break;
	case 3:
		try
		{
			System.out.println("peek element="+lq.peek());
		}
	catch(Exception e) {
		System.out.println("Error:"+e.getMessage());
	}
		break;
	case 4:
			System.out.println("Empty status="+lq.isEmpty());
		break;
	case 5:
		System.out.println("Size="+lq.getSize());
	break;
	default:
		System.out.println("Wromg Entry\n");
		break;
	}
	//display queue
	
	lq.display();
	System.out.println("\nDo you want to continue(Type y or n)\n");
	ch=scan.next().charAt(0);
}
while(ch=='Y' || ch=='y');
	}
}
