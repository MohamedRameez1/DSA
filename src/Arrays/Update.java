package Arrays;

import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
				       	Scanner s = new Scanner(System.in);
						System.out.print("Enter the number of elements: ");
						int n=s.nextInt();
						int arr[]=new int[n];
						System.out.print("Enter the array elements one by one: ");
				        for(int i=0;i<n;i++)
					    arr[i]=s.nextInt();
				        System.out.print("Enter the position you want to insert: ");
				        int pos =s.nextInt();
				        System.out.println("Enter the elements you wan to update: ");
				        int element =s.nextInt();
				        arr[pos-1]=element;				        				     										  
				        System.out.println("Array traverse: ");
				        for(int i=0;i<n;i++)
				        	System.out.print(arr[i]+" ");
					  s.close();
					
		}


	}


