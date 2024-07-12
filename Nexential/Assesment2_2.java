//Write a Java program to remove a specific element from an array and print new array

package Nexential;

import java.util.Scanner;

public class Assesment2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no of elements in array");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter specific position where u want delete");
		int sp=sc.nextInt();
		
		for(int i=sp;i<n-1;i++)
		{
			a[i]=a[i+1];
		}
		n=n-1;
		System.out.println(" After deleting specified position");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}

	}

}
