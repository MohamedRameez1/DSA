package Simple;

import java.util.Scanner;

public class Arasu_number {

		public static void main(String[] args) {
			 Scanner s = new Scanner(System.in);
			
				System.out.print("enter number :");
				int n = s.nextInt();
				
				for(int i=1;i<=n;i++) {
					
					int f = i * i+1;
					System.out.print(f);
				}
				

		}

	}
