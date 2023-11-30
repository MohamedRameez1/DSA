package Simple;

public class Lcm {

	     public static void main(String[] args) {
				// TODO Auto-generated method stub
				//find gcd betwen n1 and n2
		int n1=2,n2=6;//initailly st to gcd
		int gcd=1;
		for(int i=1;i<=n1 && i<=n2;++i) {
			
			//check if i is factor of both integers
			if(n1%i==0 && n2%i==0)
				gcd=i;
		}
		int lcm=(n1*n2)/gcd;
			System.out.printf("The LCM of %d and %d",n1,n2,lcm);
			}

	

	}


