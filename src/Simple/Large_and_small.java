package Simple;

import java.util.Scanner;

public class Large_and_small {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		System.out.print("Enter the number: ");
		 n =s.nextInt();
		int arr[]= new int[n];
		System.out.print("Enter the array element one by one: ");
		for(int i =0;i<n;i++)
			arr[i]=s.nextInt();
		int min_idx=0,max_idx=0;
		for(int i =1;i<n;i++) {
		
		if(arr[i]<arr[min_idx])
		
            min_idx =i;
		else if(arr[i]>arr[max_idx])
			
			max_idx=i;
		}
	System.out.println("small index is: "+arr[min_idx]);
	System.out.println("greate index is: "+arr[max_idx]);

	}

}
