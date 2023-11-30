package Testprograms;

import java.util.Scanner;

		public class Test4 {


				public static void main(String[] args) {
					// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			System.out.println("enter no of elements: ");
			int n =s.nextInt();
			int[] arr= new int[n];
			System.out.println("enter the elements: ");
			for(int i=0;i<n;i++) {
				arr[i] = s.nextInt();
			}
			int firstValue = arr[0];
			for(int i=0;i<arr.length-1;i++) {
				arr[i] = arr[i+1];
			}
			arr[arr.length-1]=firstValue;
			System.out.println("after permuting: ");
			for(int num:arr) {
				System.out.println(num +" ");
			}
				}
		
		
	}

