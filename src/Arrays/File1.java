package Arrays;

import java.util.Scanner;
     // swapping of two characters in string program.
public class File1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	String str1= s.next();
	//System.out.println(str1);
	int n =str1.length();
	char ch[]=str1.toCharArray();
	/*for(int i=0;i<n;i++)
		System.out.println(ch[i]);
	System.out.println();*/
	for(int i=0;i<n-1;i+=2)
		System.out.println(ch[i+1]+""+ch[i]);
	}
}