package Nexential;

import java.util.Scanner;

public class Assesment3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a passge");
		String str=sc.nextLine();
		//int count=n.split(\n);
		int count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')) {
			count++;
			}
		}
		System.out.println("No of words : "+count);

	}

}
