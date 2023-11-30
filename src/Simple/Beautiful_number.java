package Simple;

import java.util.Scanner;

public class Beautiful_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int n,sum=0;
		 n =s.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the array elements one by one");
		for(int i =0;i<n;i++)
			arr[i]=s.nextInt();
		
		   for (int num :arr) 
	            sum += num;
	         
		   if(sum%2==0 && sum%3==0 && sum%5==0)
			   System.out.println(1); // Beautiful array
     else 
        System.out.println(0); // Not beautiful array
    

   s.close();
}

}
