package Simple;

public class Gcd {

		public static void main(String[] args) {
			//find gcd betwen n1 and n2
	int n1=2,n2=6;//initailly st to gcd
	int gcd=1;
	for(int i=1;i<=n1 && i<=n2;++i) {
		
		//check i i perfectly divides both n1 and n2
		if(n1%i==0 && n2%i==0)
			gcd=i;
	}
		System.out.println("GCD of"+n1+"and"+n2+"is"+gcd);
		}

	}

