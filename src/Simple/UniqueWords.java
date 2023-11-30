package Simple;

import java.util.Scanner;

public class UniqueWords{
	
	public class test3 {
		static int calculateNoofUniquewords(String str) {
			String[]words=str.split(" ");//i am am
			boolean[]array=new boolean[words.length];
			//array={false,false,false,false}
			int j,i=0;
			int count=0;
			for (i = 0; i < words.length; i++) {
				if (!array[i]) {//if(!false)
					count++;
					for (j=i+1;j<words.length;j++) {
					if(words[j].compareTo(words[i])==0) {
						array[j]=true;
						count--;
					}
					}
					}
				}
			return count;
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str;
		System.out.println("Enter the string");
		str=s.nextLine();
		int count=calculateNoofUniquewords(str);
		System.out.println("Total number of unique words in\""+str+"\"are:"+count);
			}
	}
}
     
        


