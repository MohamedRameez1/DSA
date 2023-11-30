package SortingTypes;

import java.util.Scanner;

public class InsertionSort {
	static void insertSort(int n,int ar[]) {
		
		for(int i=1;i<n;i++) {
		//	int key=i;
			
			for(int j=i;j>0;j--) {
				if(ar[j]<ar[j-1]) {
					int t = ar[j];
					ar[j]=ar[j-1];
					ar[j-1]=t;
				}
					else
						break;
				}
			}
		}
	static void printArray(int n,int ar[]) {
		System.out.println();
		System.out.println("After Swapping: ");
		for(int i =0;i<n;i++)
			System.out.print(ar[i]+" ");
	}
		

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int n =s.nextInt();
		int ar[]= new int[n];
		System.out.println("Enter the number of element one by one");
		for(int i=0;i<n;i++)
			ar[i]=s.nextInt();
		System.out.println("Before swapping: ");
		for(int i =0;i<n;i++)
			System.out.print(ar[i]+" ");
		insertSort(n,ar);
		printArray(n,ar);
		s.close();
		
		
	}

}
