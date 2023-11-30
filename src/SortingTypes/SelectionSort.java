package SortingTypes;

import java.util.Scanner;

public class SelectionSort {
	static void selectionSort(int n,int ar[]) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(ar[i]>ar[j]) {
					int smallest = ar[i];
					ar[i]=ar[j];
					ar[j] = smallest;
				}
					
			}
		}		
	}
	static void printArray(int n,int ar[]) {
		System.out.println();
		System.out.println("After swapping: ");
		for(int i=0;i<n;i++)
			System.out.print(ar[i]+" ");
	}

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter the array size: ");
		 int n =s.nextInt();
		 int ar[]=new int[n];
		 for(int i = 0;i<n;i++)
			 ar[i] = s.nextInt();
		 System.out.println("Before swapping: ");
		 for(int i =0;i<n;i++)
			 System.out.print(ar[i]+" ");
		 selectionSort(n,ar);
		 printArray(n,ar);		 
         s.close();
	}

}
