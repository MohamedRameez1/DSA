package Arrays;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
						       	Scanner s = new Scanner(System.in);
								System.out.print("Enter the number of elements: ");
								int n=s.nextInt();
								int arr[]=new int[n];
								System.out.print("Enter the array elements one by one: ");
						        for(int i=0;i<n;i++)
							    arr[i]=s.nextInt();						       						     
						        System.out.println("Enter the elements you want to search: ");
						        int search =s.nextInt();
						        int count= 0;
						        for(int i=0;i<n;i++) {
						        if(arr[i]==search) {
						        	count++;
						        System.out.printf("Enter %d found at position:%d\n",search,i+1);
						        }
						        }
	                
	                        if(count==0)
		                    System.out.println("Search element is not present");
		                     s.close();
	}
	
}
		
