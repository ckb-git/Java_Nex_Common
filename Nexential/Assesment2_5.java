package Nexential;

import java.util.Arrays;
import java.util.Scanner;

public class Assesment2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		String rev="";
		String a[]=str.split("\\.");
		for(String i:a)
		{
			StringBuilder sb= new StringBuilder(i);
			sb.reverse();
			rev=rev+sb+".";
		}
		System.out.println("reverse of string :"+rev);

	}

}
