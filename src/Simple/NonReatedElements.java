package Simple;

import java.util.Scanner;

public class NonReatedElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=s.nextInt();
		for(int i=0;i<n;i++)
			System.out.print(ar[i]+" ");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(ar[j]!=ar[j+1]) {
					System.out.print(ar[i]+" ");
				}
					else
						break;
						
				}
					
			}
		for(int i=0;i<n;i++)
			System.out.println(ar[i]+" ");
		}

	}


