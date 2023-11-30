package SortingTypes;

import java.util.Scanner;

public class BubbleSort {

		public static void main(String[] args) {
		     Scanner s = new Scanner(System.in);
		     int n = s.nextInt();
		     int arr[]= new int[n];
		     for(int i = 0;i<n;i++)
		    	 arr[i]=s.nextInt();
		     System.out.println("Before Swapping: ");
		     for(int i = 0;i<n;i++) {
		    	 System.out.print(arr[i]+" ");
		     }
		     for(int j=1;j<n;j++) {
		     
		     for(int i=0;i<n-j;i++) {
		    	 
		     if(arr[i]>arr[i+1]) {
		    	
		    	int t = arr[i];
		     arr[i] = arr[i+1];
		     arr[i+1] = t;
		     
		     
		     }
		     }
		     }
		     System.out.println("After swapping: ");
		     for(int i = 0;i<n;i++)
		     System.out.print(arr[i]+" ");
		     s.close();
		}
		
	}


