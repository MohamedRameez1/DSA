package Sorting;

public class Bit_manupulation {
	static public boolean isPowerOfTwo(int x)
	{
		// first x in the below expression is for the case when
		return(x !=0)&&((x&(x-1))==0);
	}


	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(10));
	}

}
