package Simple;

import java.util.Scanner;

public class Gcd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		 s.useDelimiter("[\\s]+");
		    int n1=s.nextInt();
		    int n2=s.nextInt();
		
		int gcd =1;
		
		for(int i=1; i<=n1 && i<=n2;++i) {
			if(n1%i==0 && n2%i==0) {
				gcd=i;
				
			}
		}
			if(gcd==1) {
				System.out.println("-1");
			}else {
				System.out.println(gcd);
			}
		
		s.close();
	}

}



