package Nexential;

import java.util.Scanner;

public class Assesment3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println("Enter the another String");
		String str1=sc.next();
		String str2=str.toUpperCase();
		String str3=str.toLowerCase();
		System.out.println(str2.concat(str3));
		

	}

}
//Write a Java program that reads a string from the keyboard, 
//and outputs the string twice in a row, first all uppercase and next 
//all lowercase. If, for instance, the string “Hello" is given, the output "
//		+ "will be “HELLOhello