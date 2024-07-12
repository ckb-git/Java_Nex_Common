//Input a string of alphabets. Find out the number of occurrence of all alphabets in that string. Find out the alphabet with maximum occurrence

package Nexential;

import java.util.*;

public class Assesment2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String with char");
		String str=sc.nextLine();
		int max_char=256;
		int len=str.length();
		int count[] = new int[max_char];
		for (int i = 0; i < len; i++)  
			count[str.charAt(i)]++;  
		char a[]=new char[str.length()];
		for(int i=0;i<max_char;i++)
		{
			if(count[i]!=0)
				System.out.println("the occerence of "+(char)i+" is :"+count[i]);
		}
		int max=count[0];
		char ch=' ';
				for (int i = 0; i < len; i++)
				{
					if(max<count[str.charAt(i)]) {
						max=count[str.charAt(i)];
					ch=str.charAt(i);
					}
				}
		System.out.println("alphabet wit max occerence :"+ch+"--"+max);
		

	}

}
