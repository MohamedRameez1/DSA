package Arrays;

import java.util.Scanner;

public class Shorting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n =s.nextInt();
		int flag=0;
		int arr[]= new int[n];
		System.out.print("Enter the array elements one by one: ");
		for(int i=0;i<n;i++)
		arr[i]=s.nextInt();
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
				System.out.println(arr[i]+" ");
				flag=1;
				}
			}
				if(flag==0)
					System.out.println();
				s.close();
			}
	}

}

