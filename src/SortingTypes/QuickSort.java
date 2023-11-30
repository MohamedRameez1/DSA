package SortingTypes;

import java.util.Scanner;

public class QuickSort {
	
	static void quickSort(int arr[], int low, int high) {
		if(low>=high) 
			return;
	
		int start = low;
		int end = high;
		int mid = (start+end)/2;
		int pivot =arr[mid];
		
		while(start<=end) {
		while(arr[start]<pivot) 
			start++;
		while(arr[end]>pivot)
			 end--;
		
		if(start<=end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
		
		}
		}
		quickSort(arr,low,end);
		quickSort(arr,start,high);
	}
	
	static void printArray(int arr[],int n) {
		System.out.println("Sorted array: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = {2,7,8,9,1,5,9};
		int n=arr.length;
		quickSort(arr,0,n-1);
		printArray(arr,n);
		s.close();
	}
	}

