package Simple;

import java.util.Scanner;

public class Array_Swap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
        int arr[]= new int[n];
        for(int i =0;i<n;i++)
        	arr[i] = s.nextInt();
        for(int i =0;i<n-1;i+=2) {
        	int temp;
        temp =arr[i];
        arr[i]= arr[i+1];
        arr[i+1]=temp;
	}


